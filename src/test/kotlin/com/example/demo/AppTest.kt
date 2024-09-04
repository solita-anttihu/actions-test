package com.example.demo

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.fail
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class AppTest {

	@Test
	fun testContextLoads() { }

	// @Disabled
	@Test
	fun testFail() {
		fail("Testing failure")
	}

}
