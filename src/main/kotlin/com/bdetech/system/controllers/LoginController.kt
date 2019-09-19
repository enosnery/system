package com.bdetech.system.controllers

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RestController

@RestController
class LoginController {

    @PostMapping("/login")
    fun login(@RequestHeader login : String, @RequestHeader password : String) : String{
        return when (login != ""){
            true -> "Login Certo"
            false -> "Login Errado"
        }
    }
}