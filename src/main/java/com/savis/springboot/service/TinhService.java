package com.savis.springboot.service;

import java.util.List;

import com.savis.springboot.dao.model.Tinh;

public interface TinhService {

	List<Tinh> findAll();
	
	Tinh findOne(int id);
	
	int create(Tinh tinh);

	int deleteById(int id);
	
	int updateTinh(Tinh tinh);
	
	int deleteAllTinh();
}

