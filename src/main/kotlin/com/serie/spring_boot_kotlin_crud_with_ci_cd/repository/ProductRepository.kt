package com.serie.spring_boot_kotlin_crud_with_ci_cd.repository

import com.serie.spring_boot_kotlin_crud_with_ci_cd.entity.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ProductRepository:JpaRepository<Product, UUID>{
}