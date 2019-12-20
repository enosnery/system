package com.bdetech.system.repositories

import com.bdetech.system.models.Menu
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MenuRepository : JpaRepository<Menu, Long> {
}