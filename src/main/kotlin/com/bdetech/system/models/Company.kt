package com.bdetech.system.models

import org.hibernate.validator.constraints.br.CNPJ
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToOne
import javax.validation.constraints.Size

@Entity(name = "tb_company")
class Company (
        @Id @GeneratedValue var id : Long? = null,
        var name : String = "",
        @CNPJ @Size(max = 14) var cnpj: String = "",
        @OneToOne var address: Address = Address()
)