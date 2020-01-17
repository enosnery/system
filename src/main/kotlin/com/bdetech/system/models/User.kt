package com.bdetech.system.models

import com.bdetech.system.enumerates.UserType
import com.bdetech.system.request.AddUserForm
import org.hibernate.validator.constraints.br.CPF
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.Size

@Entity(name = "tb_users")
class User(
        @Id @GeneratedValue val id : Long? = null,
        @Column(unique = true) var login : String = "",
        var name : String = "",
        var password: String = "",
        var type : UserType = UserType.BASIC,
        var email: String = "",
        var token: String = "",
        var photoUrl: String = "",
        @Column(unique = true) @CPF @Size(max = 11) var cpf: String = "",
        var created_at : Date = Date()
        ){
        constructor(userForm: AddUserForm) : this(){
                this.name = userForm.name
                this.login = userForm.login
                this.password = userForm.password
                this.type = UserType.values()[userForm.type]
                this.cpf = userForm.cpf
                this.email = userForm.email
        }
}