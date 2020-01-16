package com.bdetech.system.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "tb_address")
class Address (
        @Id @GeneratedValue var id: Long? = null,
        var street1 : String = "",
        var street2 : String = "",
        var neighborhood : String = "",
        var city : String = "",
        var state : String = "",
        var zipCode : String = ""

)