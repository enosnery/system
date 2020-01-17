package com.bdetech.system.models

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity(name = "tb_stock")
class Stock (
        @Id @GeneratedValue var id : Long? = null,
        var stockName: String = "",
        @OneToMany(mappedBy = "stock") var items : MutableList<StockItem> = arrayListOf(),
        var createdAt : Date = Date()
)