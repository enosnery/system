package com.bdetech.system.models

import com.bdetech.system.enumerates.UserType
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "users")
class User(
        @Id @GeneratedValue val id : Long? = null,
        var login : String = "",
        var name : String = "",
        var password: String = "",
        var type : UserType = UserType.BASIC,
        var email: String = "",
        var token: String = ""

        )