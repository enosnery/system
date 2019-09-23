package com.bdetech.system.controllers

import com.bdetech.system.forms.UserLoginForm
import com.bdetech.system.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
class LoginController @Autowired constructor(val userService: UserService) {

    @PostMapping("/login")
    fun login(@RequestBody form : UserLoginForm) : Int {
        return userService.login(form.login, form.login )
    }
}