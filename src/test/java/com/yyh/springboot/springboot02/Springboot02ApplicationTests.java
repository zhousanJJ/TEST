package com.yyh.springboot.springboot02;

import com.yyh.springboot.springboot02.bean.Person;
import com.yyh.springboot.springboot02.bean.Pet;
import com.yyh.springboot.springboot02.bean.Season;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//@RunWith()
@SpringBootTest
class Springboot02ApplicationTests {

	@Autowired
	Person person;

	@Test
	void contextLoads() {
		Pet dog = person.getDog();
		System.out.println(dog.toString());
		System.out.println(person);
	}

	@Test
	void test1(){
		Logger logger = LoggerFactory.getLogger(Springboot02ApplicationTests.class);
		logger.info("Hello World");
		System.out.println(Season.CHUN.getName());
	}


}
