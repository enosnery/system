package com.bdetech.system.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "tb_menu_items")
class Menu (
        @Id @GeneratedValue var id : Long? = null,
        var title: String = "",
        var imagem: String = "",
        var content: String = ""
)