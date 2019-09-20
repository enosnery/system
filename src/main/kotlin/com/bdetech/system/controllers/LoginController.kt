package com.bdetech.system.controllers

import com.bdetech.system.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RestController

@RestController
class LoginController @Autowired constructor(val userService: UserService) {

    @PostMapping("/login")
    fun login(@RequestHeader login : String, @RequestHeader password : String) : Int {
        return userService.login(login, password)
    }
}