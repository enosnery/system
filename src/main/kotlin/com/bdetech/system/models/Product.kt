package com.bdetech.system.models

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity(name = "tb_products")
class Product (
        @Id @GeneratedValue var id: Long? = null,
        var name : String = "",
        var description : String = "",
        var photoUrl : String = "",
        var createdAt : Date = Date()
)