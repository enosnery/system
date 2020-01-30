package com.bdetech.system.services

import com.bdetech.system.models.User
import com.bdetech.system.repositories.UserRepository
import com.bdetech.system.request.AddUserForm
import com.bdetech.system.response.UserResponseForm
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService @Autowired constructor (val userRepository: UserRepository){
    fun login(login : String, password : String): UserResponseForm {
        val temp = userRepository.findByLoginAndPassword(login, password)
        if(temp != null){
            temp.token = UUID.randomUUID().toString()
            userRepository.save(temp)
        }

        return UserResponseForm(temp)
    }

    fun list() : List<User>{
        return userRepository.findAll();
    }

    fun authorize(token: String): Boolean{
        var authorized = false
        val temp = userRepository.findByToken(token);
        if(temp != null){
            authorized = true
        }
        return authorized
    }

    fun addNew(form: AddUserForm): String {
        var response = ""
        try {
            var newUser = User(form)
            userRepository.save(newUser)
            if(newUser.id != null){
                response = "Novo Usuário inserido com sucesso!"
            }
        }catch (e : Exception){
            response = if(userRepository.existsByLogin(form.login)){
                "Este Login já está vinculado a outro Usuário."
            } else if(userRepository.existsByCpf(form.cpf)) {
                "Este CPF já está vinculado a outro Usuário."
            }else{
                "Erro ao inserir novo Usuário."
            }
        }
        return response
    }

    fun getById(id : Long): User {
        return userRepository.findById(id).get();
    }
}