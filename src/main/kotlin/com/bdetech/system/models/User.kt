package com.bdetech.system.models

import com.bdetech.system.enumerates.UserType
import org.hibernate.validator.constraints.br.CPF
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.Size
import kotlin.math.max

@Entity(name = "tb_users")
class User(
        @Id @GeneratedValue val id : Long? = null,
        var login : String = "",
        var name : String = "",
        var password: String = "",
        var type : UserType = UserType.BASIC,
        var email: String = "",
        var token: String = "",
        var photoUrl: String = "",
        var cpf: CPF? = null,
        var created_at : Date = Date()

        )