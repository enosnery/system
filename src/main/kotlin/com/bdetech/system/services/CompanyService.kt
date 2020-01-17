package com.bdetech.system.services

import com.bdetech.system.repositories.CompanyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CompanyService @Autowired constructor(companyRepository: CompanyRepository) {

}