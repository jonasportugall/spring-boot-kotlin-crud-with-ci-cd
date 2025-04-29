package com.serie.spring_boot_kotlin_crud_with_ci_cd.controller

import com.serie.spring_boot_kotlin_crud_with_ci_cd.DTOs.AddProductRequest
import com.serie.spring_boot_kotlin_crud_with_ci_cd.service.ProductService
import io.swagger.v3.oas.annotations.Operation
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.UUID

@RestController
class ProductController(private val productService:ProductService){

    @Operation(summary = "Get all products")
    @GetMapping("/products")
    fun getAll(): ResponseEntity<Any> {
        return productService.getAll()
    }

    @Operation(summary = "Add a product")
    @PostMapping("/products")
    fun addProduct(@RequestBody request: AddProductRequest):ResponseEntity<Any>{
        return productService.addProduct( request )
    }
    @Operation(summary = "Update the product")
    @PutMapping("/products/{id}")
    fun updateProduct(@PathVariable id:UUID, @RequestBody request: AddProductRequest):ResponseEntity<Any>{
        return productService.updateProduct( id , request )
    }

    @Operation(summary = "Delete the product by id")
    @DeleteMapping("/products/{id}")
    fun deleteProduct(@PathVariable id:UUID):ResponseEntity<Any>{
        return productService.deleteProduct( id )
    }


}