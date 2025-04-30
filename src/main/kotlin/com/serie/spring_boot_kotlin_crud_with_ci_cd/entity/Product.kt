package com.serie.spring_boot_kotlin_crud_with_ci_cd.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name="products")
data class Product(
    @Id
    @Column(columnDefinition = "uuid", updatable = false, nullable = false)
    val id: UUID = UUID.randomUUID(),
    @Column
    var name:String = "",

    @Column
    var price:Double = 0.0,

    @Column
    var quantity:Int = 0

)
