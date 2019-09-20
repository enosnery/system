package com.bdetech.system.services

import com.bdetech.system.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService @Autowired constructor (val userRepository: UserRepository){
    fun login(login : String, password : String): Int {
        val user = userRepository.findByLoginAndPassword(login, password)
        return when (user.id){
            null -> 500
            else -> 200
        }
    }
}