package com.bdetech.system.models

import java.util.*
import javax.persistence.*

@Entity(name = "tb_stock_item")
class StockItem (
        @Id @GeneratedValue var id : Long? = null,
        @OneToOne var product: Product = Product(),
        @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "stock_id") var stock : Stock,
        var quantity: Long = 0,
        var unitValue: Double = 0.0,
        var createdAt : Date = Date()
)