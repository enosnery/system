package com.bdetech.system.controllers

import com.bdetech.system.constants.Constants
import com.bdetech.system.request.AddUserForm
import com.bdetech.system.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
class UserController @Autowired constructor(val userService: UserService){

    @GetMapping("/users/list")
    fun list(): HashMap<String, Any> {
        var response = HashMap<String, Any>()
        var users = userService.list()
        response["code"] = Constants.REQUEST_SUCCESS
        response["users"] = users
        return response
    }

    @PostMapping("/users/add")
    fun addNew(@RequestBody form: AddUserForm): HashMap<String, Any> {
        var response = HashMap<String, Any>()
        var responseBody = userService.addNew(form)
        response["response"] = responseBody
        return response

    }
}