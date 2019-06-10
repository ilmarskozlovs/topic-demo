package com.mycompany.topicdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TopicDemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void simpleTest(){
		String name = "Janis";
		assertThat("Janis").isEqualTo(name);
	}

}
