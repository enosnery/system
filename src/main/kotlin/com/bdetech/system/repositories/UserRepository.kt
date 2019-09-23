package com.bdetech.system.repositories

import com.bdetech.system.models.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long>{
        fun findByLoginAndPassword(login : String, password : String ) : User?
}