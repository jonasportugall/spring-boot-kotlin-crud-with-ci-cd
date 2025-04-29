package com.serie.spring_boot_kotlin_crud_with_ci_cd.DTOs

data class AddProductRequest(
    val name:String,
    val price:Double,
    val quantity:Int
)
