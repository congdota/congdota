package com.savis.springboot.endpoint.rest;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.savis.springboot.dao.model.Tinh;
import com.savis.springboot.service.TinhService;


@Controller
@RequestMapping(value="/com/savis/springboot/")
public class TinhResource {

	@Autowired
	private TinhService tinhService;

	@GetMapping(value = "tinhs", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<List<Tinh>> findAll() {
		return ResponseEntity.ok().body(tinhService.findAll());
	}

	@GetMapping(value = "tinhs/{id}", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<Tinh> findAll( @PathVariable("id")int id) {
		return ResponseEntity.ok().body(tinhService.findOne(id));
	}
	
	@PostMapping(value = "tinhs/create", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE }, consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<Integer> create( @RequestBody Tinh tinh) {
		return ResponseEntity.ok().body(tinhService.create(tinh));
	}
		//---update---
	@PutMapping(value = "tinhs/update", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE }, consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<Integer> update( @RequestBody Tinh tinh){
		return ResponseEntity.ok().body(tinhService.updateTinh(tinh));
		
	}
	//deleteId-----
	@DeleteMapping(value = "tinhs/delete/{id}", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<Integer> deleteById( @PathVariable("id")int id) {
		return ResponseEntity.ok().body(tinhService.deleteById(id));
	}
	//DeleteAll----
	@DeleteMapping(value= "tinhs/deleteAll", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<Integer> deleteAllTinh(){
		return ResponseEntity.ok().body(tinhService.deleteAllTinh());
	}

}
