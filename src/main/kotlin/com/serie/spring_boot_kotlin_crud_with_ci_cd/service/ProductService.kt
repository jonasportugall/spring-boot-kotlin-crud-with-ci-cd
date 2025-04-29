package com.serie.spring_boot_kotlin_crud_with_ci_cd.service

import com.serie.spring_boot_kotlin_crud_with_ci_cd.DTOs.AddProductRequest
import com.serie.spring_boot_kotlin_crud_with_ci_cd.entity.Product
import com.serie.spring_boot_kotlin_crud_with_ci_cd.repository.ProductRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductService(private val productRepository: ProductRepository) {

    fun getAll(): ResponseEntity<Any> {
        val products = productRepository.findAll()
        return ResponseEntity.ok(products)
    }

    fun addProduct(request: AddProductRequest): ResponseEntity<Any> {
        val product = Product(
            name = request.name,
            quantity = request.quantity,
            price = request.price
        )
        val savedProduct = productRepository.save(product)
        return ResponseEntity.ok(savedProduct)
    }

    fun updateProduct(id: UUID, request: AddProductRequest): ResponseEntity<Any> {
        val optionalProduct = productRepository.findById(id)

        if (optionalProduct.isEmpty) {
            return ResponseEntity.notFound().build()
        }

        val product = optionalProduct.get()
        product.name = request.name
        product.quantity = request.quantity
        product.price = request.price

        val updatedProduct = productRepository.save(product)
        return ResponseEntity.ok(updatedProduct)
    }

    fun deleteProduct(id: UUID): ResponseEntity<Any> {
        val exists = productRepository.existsById(id)
        if (!exists) {
            return ResponseEntity.notFound().build()
        }

        productRepository.deleteById(id)
        return ResponseEntity.noContent().build()
    }
}
