package com.bdetech.system

import com.bdetech.system.controllers.UserController
import com.bdetech.system.repositories.UserRepository
import com.bdetech.system.services.UserService
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.util.*

@RunWith(SpringRunner::class)
@SpringBootTest
class SystemApplicationTests {

	@Mock
	lateinit var userRepository: UserRepository
	@Mock
	lateinit var userService : UserService
	@InjectMocks
	lateinit var userController : UserController

	@Before
	fun setupVariables(){
		userService = UserService(userRepository)
		userController = UserController(userService)
	}

	@Test
	fun contextLoads() {
		val result = userController.getById(1)
		println(result["userDetail"] as LinkedList<com.bdetech.system.models.User>)
		kotlin.test.assertEquals(result["code"], com.bdetech.system.constants.Constants.REQUEST_SUCCESS)
	}

}
