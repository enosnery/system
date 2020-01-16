package com.bdetech.system.models

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToOne

@Entity(name = "tb_stock_item")
class StockItem (
        @Id @GeneratedValue var id : Long? = null,
        @OneToOne var product: Product = Product(),
        var quantity: Long = 0,
        var unitValue: Double = 0.0,
        var createdAt : Date = Date()
)