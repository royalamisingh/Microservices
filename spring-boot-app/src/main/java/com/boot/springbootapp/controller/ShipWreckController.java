package com.boot.springbootapp.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.springbootapp.model.Shipwreck;
import com.boot.springbootapp.repository.ShipWreckRepository;

@RestController
@RequestMapping("api/v1/")
public class ShipWreckController {

	@Autowired(required = true)
	private ShipWreckRepository shipWreckRepository;

	@RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
	public List<Shipwreck> list() {
		// return ShipwreckStub.list();
		return shipWreckRepository.findAll();
	}

	@RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
	public Shipwreck create(@RequestBody Shipwreck shipwreck) {
		// return ShipwreckStub.create(shipwreck);
		return shipWreckRepository.saveAndFlush(shipwreck);
	}

	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
	public Shipwreck get(@PathVariable Long id) {
		// return ShipwreckStub.get(id);
		return shipWreckRepository.findById(id).get();
	}

	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
	public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck) {
		// return ShipwreckStub.update(id, shipwreck);
		Shipwreck existingShipWreck = shipWreckRepository.findById(id).get();
		BeanUtils.copyProperties(shipwreck, existingShipWreck);
		return shipWreckRepository.saveAndFlush(existingShipWreck);
	}

	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
	public Shipwreck delete(@PathVariable Long id) {
		// return ShipwreckStub.delete(id);
		Shipwreck existingShipWreck = shipWreckRepository.findById(id).get();
		shipWreckRepository.delete(existingShipWreck);
		return existingShipWreck;
	}
}
