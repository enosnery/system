package com.bdetech.system.controllers

import com.bdetech.system.models.User
import com.bdetech.system.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.gson.GsonProperties
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RestController
class UserController @Autowired constructor(val userService: UserService){

    @GetMapping("/users/list")
    fun list(){
        var map = HashMap<String, List<User>>()
        var users = userService.list()
        map["users"] = users
        return
    }
}