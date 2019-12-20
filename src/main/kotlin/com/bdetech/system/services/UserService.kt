package com.bdetech.system.services

import com.bdetech.system.models.User
import com.bdetech.system.repositories.UserRepository
import com.bdetech.system.response.UserResponseForm
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService @Autowired constructor (val userRepository: UserRepository){
    fun login(login : String, password : String): UserResponseForm {
        val temp = userRepository.findByLoginAndPassword(login, password)
        if(temp != null){
            temp.token = UUID.randomUUID().toString()
            userRepository.save(temp)
        }

        return UserResponseForm(temp)
    }

    fun list() : List<User>{
        return userRepository.findAll();
    }

    fun authorize(token: String): Boolean{
        println(token)
        var authorized = false
        val temp = userRepository.findByToken(token);
        if(temp != null){
            authorized = true
        }
        return authorized
    }
}