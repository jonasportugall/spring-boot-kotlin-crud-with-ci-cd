package com.serie.spring_boot_kotlin_crud_with_ci_cd

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<SpringBootKotlinCrudWithCiCdApplication>().with(TestcontainersConfiguration::class).run(*args)
}
