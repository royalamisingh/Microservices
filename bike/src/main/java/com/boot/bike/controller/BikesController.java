package com.boot.bike.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.boot.bike.models.Bike;
import com.boot.bike.repository.BikeRepository;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {
	
	@Autowired
	BikeRepository repository;
	
	@GetMapping
	public List<Bike> list(){
		
		return repository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Bike bike) {
		repository.save(bike);
	}
	
	@GetMapping("/{id}")
	public Bike get(@PathVariable("id") long id) {
		
		return repository.getOne(id);
		
	}

}
