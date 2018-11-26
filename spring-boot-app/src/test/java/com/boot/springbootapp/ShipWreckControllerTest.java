package com.boot.springbootapp;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.boot.springbootapp.controller.ShipWreckController;
import com.boot.springbootapp.model.Shipwreck;
import com.boot.springbootapp.repository.ShipWreckRepository;

public class ShipWreckControllerTest {
	
	@InjectMocks
	private ShipWreckController controller;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	@Mock
	private ShipWreckRepository repository;
	@Test
	public void testShipWreckget() {
		
		Optional<Shipwreck> wreck = Optional.of(new Shipwreck());
		wreck.get().setId(1l);
		
		when(repository.findById(1l)).thenReturn(wreck);
		
		//assertEquals(1l, controller.get(1l).getId().longValue());
		
		assertThat(controller.get(1l).getId(),is(1l));
	}

}
