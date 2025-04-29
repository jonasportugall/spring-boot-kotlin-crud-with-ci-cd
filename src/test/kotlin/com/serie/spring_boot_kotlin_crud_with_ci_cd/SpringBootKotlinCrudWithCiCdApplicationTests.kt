package com.serie.spring_boot_kotlin_crud_with_ci_cd

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import

@Import(TestcontainersConfiguration::class)
@SpringBootTest
class SpringBootKotlinCrudWithCiCdApplicationTests {

	@Test
	fun contextLoads() {
	}

}
