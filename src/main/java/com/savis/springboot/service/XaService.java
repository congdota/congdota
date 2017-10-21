package com.savis.springboot.service;

import java.util.List;

import com.savis.springboot.dao.model.Xa;


public interface XaService {
	List<Xa> findAll();
	Xa findOne(int id);
	int create(Xa tinh);
	int deleteById(int id);
	int updateXa(Xa xa);
	int deleteAllXa();
}
