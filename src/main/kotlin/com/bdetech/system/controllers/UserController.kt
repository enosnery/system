package com.bdetech.system.controllers

import com.bdetech.system.constants.Constants
import com.bdetech.system.request.AddUserForm
import com.bdetech.system.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
class UserController @Autowired constructor(val userService: UserService){

    @GetMapping("/user")
    fun list(): HashMap<String, Any> {
        val response = HashMap<String, Any>()
        val users = userService.list()
        response["code"] = Constants.REQUEST_SUCCESS
        response["users"] = users
        return response
    }

    @PostMapping("/user")
    fun addNew(@RequestBody form: AddUserForm): HashMap<String, Any> {
        val response = HashMap<String, Any>()
        val responseBody = userService.addNew(form)
        response["response"] = responseBody
        return response

    }

    @GetMapping("/user/{id}")
    fun getById(@PathVariable id: Long): HashMap<String, Any> {
        val response = HashMap<String, Any>()
        val responseBody = userService.getById(id);
        response["code"] = Constants.REQUEST_SUCCESS
        response["userDetail"] = responseBody
        return response
    }

    @DeleteMapping("/user/{id}")
    fun deleteById(@PathVariable id: Long): HashMap<String, Any> {
        val response = HashMap<String, Any>()
        val responseBody = userService.deleteById(id);
        response["code"] = Constants.REQUEST_SUCCESS
        response["message"] = responseBody
        return response
    }
}