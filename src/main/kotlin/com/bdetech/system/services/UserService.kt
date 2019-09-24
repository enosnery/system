package com.bdetech.system.services

import com.bdetech.system.repositories.UserRepository
import com.bdetech.system.response.UserResponseForm
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService @Autowired constructor (val userRepository: UserRepository){
    fun login(login : String, password : String): UserResponseForm {
        return UserResponseForm(userRepository.findByLoginAndPassword(login, password))
    }
}