package com.bdetech.system.controllers

import com.bdetech.system.constants.Constants
import com.bdetech.system.request.UserLoginForm
import com.bdetech.system.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
class LoginController @Autowired constructor(val userService: UserService) {

    @PostMapping("/login")
    fun login(@RequestBody form : UserLoginForm) : HashMap<String, Any> {
        val user = userService.login(form.username, form.password )
        val response = HashMap<String, Any>()
        if(user.id == null){
            response[Constants.CODE] = Constants.REQUEST_FAILURE
            response[Constants.MESSAGE] = "O usuário ou senha estão incorretos"
            return response
        }else{
            response[Constants.CODE] = Constants.REQUEST_SUCCESS
            response[Constants.RESPONSE_USER_DATA] = user
            return response
        }
    }
}