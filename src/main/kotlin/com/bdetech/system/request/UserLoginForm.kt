package com.bdetech.system.request

class UserLoginForm(
        val login : String,
        val password: String
){
    override fun toString(): String {
        return "UserLoginForm(login='$login', password='$password')"
    }
}