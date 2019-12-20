package com.bdetech.system.services

import com.bdetech.system.models.Menu
import com.bdetech.system.repositories.MenuRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MenuService @Autowired constructor(private val menuRepository: MenuRepository) {

    fun listar(): MutableList<Menu> {
        return menuRepository.findAll();
    }
}