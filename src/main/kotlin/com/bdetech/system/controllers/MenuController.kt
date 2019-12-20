package com.bdetech.system.controllers

import com.bdetech.system.constants.Constants
import com.bdetech.system.services.MenuService
import com.bdetech.system.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RestController
class MenuController @Autowired constructor(private val menuService: MenuService, private val userService: UserService) {

    @GetMapping("/menu")
    fun listar(@RequestHeader Authorization : String): HashMap<String, Any?> {
        val auth = userService.authorize(Authorization)
        val response = HashMap<String, Any?>()
        if(auth){
            response.put(Constants.CODE, Constants.REQUEST_SUCCESS)
            response.put(Constants.RESPONSE_MENU_LIST, menuService.listar())
        }else{
            response.put(Constants.CODE, Constants.REQUEST_FAILURE)
            response.put(Constants.MESSAGE, "Nenhum item no menu")
        }
        println(response)
        return response
    }
}