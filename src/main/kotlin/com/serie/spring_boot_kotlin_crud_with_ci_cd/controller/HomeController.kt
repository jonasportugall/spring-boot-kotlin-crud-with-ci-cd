package com.serie.spring_boot_kotlin_crud_with_ci_cd.controller

import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @Operation(summary = "Show the welcome message", description = "Show the welcome message")
    @GetMapping("/")
    fun welcome():String{
        return "WELCOME TO THE MY SIMPLE API WITH SPRING BOOT AND KOTLIN!"
    }

}