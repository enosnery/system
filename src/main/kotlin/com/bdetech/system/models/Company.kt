package com.bdetech.system.models

import org.hibernate.validator.constraints.br.CNPJ
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "tb_company")
class Company (
        @Id @GeneratedValue var id : Long? = null,
        var name : String = "",
        var cnpj: CNPJ? = null,
        var address: Address = Address()
)