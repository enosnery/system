package com.bdetech.system.services

import com.bdetech.system.repositories.StockItemRepository
import com.bdetech.system.repositories.StockRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StockService @Autowired constructor(stockRepository: StockRepository, stockItemRepository: StockItemRepository){
}