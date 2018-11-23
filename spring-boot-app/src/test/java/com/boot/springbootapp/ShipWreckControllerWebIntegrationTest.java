package com.boot.springbootapp;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitWebConfig(SpringBootApp.class)
@SpringBootTest
public class ShipWreckControllerWebIntegrationTest {
	
	
	@Test
	public void testListAll() {
		
		RestTemplate template = new RestTemplate();
		ResponseEntity<String> response = template.getForEntity("http://localhost:9090/api/v1/shipwrecks", String.class);
		
		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
		
	}

}
