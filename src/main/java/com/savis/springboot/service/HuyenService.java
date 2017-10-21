package com.savis.springboot.service;

import java.util.List;

import com.savis.springboot.dao.model.Huyen;

public interface HuyenService {
	List<Huyen> findAllHuyen();
	
	Huyen findOne(int id);
	
	int create(Huyen huyen);
	
	int deleteById(int id);
	
	int update(Huyen huyen);

	
}
