package com.bdetech.system.services

import com.bdetech.system.repositories.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductService @Autowired constructor(productRepository: ProductRepository){
}