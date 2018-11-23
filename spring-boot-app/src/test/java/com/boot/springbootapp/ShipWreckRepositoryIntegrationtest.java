package com.boot.springbootapp;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.boot.model.Shipwreck;
import com.boot.springbootapp.repository.ShipWreckRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitWebConfig(SpringBootApp.class)
public class ShipWreckRepositoryIntegrationtest {

	@Autowired(required = true)
	private ShipWreckRepository shipWreckRepository;
	
	@Test
	public void testFindAll() {
		
		List<Shipwreck> wrecks = shipWreckRepository.findAll();
		
		assertEquals(wrecks.size(), 0);
	}
}
