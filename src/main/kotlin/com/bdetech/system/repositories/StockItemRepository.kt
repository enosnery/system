package com.bdetech.system.repositories

import com.bdetech.system.models.StockItem
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StockItemRepository : JpaRepository<StockItem, Long> {
}