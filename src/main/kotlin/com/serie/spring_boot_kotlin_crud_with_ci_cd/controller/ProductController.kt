package com.serie.spring_boot_kotlin_crud_with_ci_cd.controller

import com.serie.spring_boot_kotlin_crud_with_ci_cd.DTOs.AddProductRequest
import com.serie.spring_boot_kotlin_crud_with_ci_cd.service.ProductService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.UUID

@RestController
class ProductController(private val productService:ProductService){

    @GetMapping("/products")
    fun getAll(): ResponseEntity<Any> {
        return productService.getAll()
    }

    @PostMapping("/products")
    fun addProduct(@RequestBody request: AddProductRequest):ResponseEntity<Any>{
        return productService.addProduct( request )
    }

    @PutMapping("/products/{id}")
    fun updateProduct(@PathVariable id:UUID, @RequestBody request: AddProductRequest):ResponseEntity<Any>{
        return productService.updateProduct( id , request )
    }

    @DeleteMapping("/{id}")
    fun deleteProduct(@PathVariable id:UUID):ResponseEntity<Any>{
        return productService.deleteProduct( id )
    }


}