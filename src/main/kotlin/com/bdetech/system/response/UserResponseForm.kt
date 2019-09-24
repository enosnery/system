package com.bdetech.system.response

import com.bdetech.system.enumerates.UserType
import com.bdetech.system.models.User

class UserResponseForm(
        val id : Long?,
        val name : String?,
        val type: UserType?
){
    constructor(user: User?): this(user?.id,user?.login, user?.type )
}