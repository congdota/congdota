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

import com.savis.springboot.dao.model.Xa;
import com.savis.springboot.service.XaService;

@Controller
@RequestMapping(value ="/com/savis/springboot/")

public class XaResource {
	@Autowired
	private  XaService xaService;
	//--findAll
	@GetMapping(value = "xa", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<List<Xa>> findAll() {
		return ResponseEntity.ok().body(xaService.findAll());
	}
	//--findOne
	@GetMapping(value = "xa/{id}", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<Xa> findAll( @PathVariable("id")int id) {
		return ResponseEntity.ok().body(xaService.findOne(id));
	}
	//--create
	@PostMapping(value = "xa/create", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE }, consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<Integer> create( @RequestBody Xa xa) {
		return ResponseEntity.ok().body(xaService.create(xa));
	}
		//---update---
	@PutMapping(value = "xa/update", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE }, consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<Integer> update( @RequestBody Xa xa){
		return ResponseEntity.ok().body(xaService.updateXa(xa));
		
	}
	
	
	//deleteId-----
	@DeleteMapping(value = "xa/delete/{id}", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<Integer> deleteById(@PathVariable("id")int id) {
		return ResponseEntity.ok().body(xaService.deleteById(id));
	}
	//DeleteAll----
	@DeleteMapping(value= "xa/deleteAll", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<Integer> deleteAllXa(){
		return ResponseEntity.ok().body(xaService.deleteAllXa());
	}
}
