package com.bdetech.system.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class User(
        @Id @GeneratedValue val id : Long? = null,
        var login : String = "",
        var password: String = ""
)