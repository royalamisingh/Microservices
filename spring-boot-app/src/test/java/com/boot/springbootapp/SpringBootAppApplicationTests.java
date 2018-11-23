package com.boot.springbootapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.boot.springbootapp.controller.HomeController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootAppApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testApp() {
		
		HomeController controller = new HomeController();
		assertEquals(controller.testhome(), "Test Home Successful");
		
	}

}
