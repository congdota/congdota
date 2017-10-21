package com.savis.springboot.endpoint.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.savis.springboot.dao.dto.HuyenDTO;
import com.savis.springboot.dao.model.Huyen;
import com.savis.springboot.dao.model.Tinh;
import com.savis.springboot.service.HuyenService;
import com.savis.springboot.service.TinhService;

@Controller
@RequestMapping(value ="/com/savis/springboot/")
public class HuyenResource {
	@Autowired
	private HuyenService huyenService;
	
	@Autowired
	private TinhService tinhService;
	///findAll huyen---
	@GetMapping(value = "huyens", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<List<Huyen>> findAll() {
		return ResponseEntity.ok().body(huyenService.findAllHuyen());
	}
	//-----findOne Huyen
	@GetMapping(value= "huyens/{id}", produces ={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Huyen> findAll( @PathVariable("id") int id){
		return ResponseEntity.ok().body(huyenService.findOne(id));
	}

	//---create Huyen--
	@PostMapping(value = "huyens/create", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE }, consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<Integer> create(@Validated @RequestBody Huyen huyen) {
		return ResponseEntity.ok().body(huyenService.create(huyen));
	}

	//---create Huyen--
//	@PostMapping(value= "huyens/create", produces= {MediaType.APPLICATION_JSON_UTF8_VALUE}, consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE})
//	public ResponseEntity<Integer> create( @RequestBody HuyenDTO huyen){
//		Huyen district = new Huyen();
//		district.setTinh(tinhService.findOne(Integer.parseInt(huyen.getIdTinh())));
//		district.setMaHuyen(huyen.getMaHuyen());
//		district.setTenHuyen(huyen.getTenHuyen());
//		return ResponseEntity.ok().body(huyenService.create(district));	
//	}
	
	//---update---
	/*@PutMapping(value= "huyens/update", produces= {MediaType.APPLICATION_JSON_UTF8_VALUE}, consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<Integer> update( @RequestBody HuyenDTO huyen){
		Huyen district = new Huyen();
		district.setTinh(tinhService.findOne(Integer.parseInt(huyen.getIdTinh())));
		district.setMaHuyen(huyen.getMaHuyen());
		district.setTenHuyen(huyen.getTenHuyen());
		return ResponseEntity.ok().body(huyenService.update(district));
	}*/
	
	//--update 
	@PutMapping(value = "huyens/update", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE }, consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<Integer> update(@Validated @RequestBody Huyen huyen){
		return ResponseEntity.ok().body(huyenService.update(huyen));
		
	}
	
	//---deleteId---
	@DeleteMapping(value= "huyens/delete/{id}", produces ={MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<Integer> deleteById( @PathVariable("id") int id){
		return ResponseEntity.ok().body(huyenService.deleteById(id));
	}
}
