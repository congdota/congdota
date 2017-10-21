package com.savis.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.savis.springboot.dao.model.Huyen;
import com.savis.springboot.dao.repository.HuyenRepository;
import com.savis.springboot.service.HuyenService;


@Service
public class HuyenServiceImpl  implements HuyenService{
	
	@Autowired
	private HuyenRepository huyenRepository;
	
	public List<Huyen> findAllHuyen() {
		// TODO Auto-generated method stub
		return huyenRepository.findAll();
	}

	@Override
	public Huyen findOne(int id) {
		// TODO Auto-generated method stub
		
		return huyenRepository.findOne(id);
	}

	@Override
	public int create(Huyen huyen) {
		// TODO Auto-generated method stub
		if(huyenRepository.save(huyen) !=null){
			
			return 1;
		}
		return 0;
	}

	@Override
	public int deleteById(int id) {
		try{
			huyenRepository.delete(id);
			return 1;
		}catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
		
	}

	@Override
	public int update(Huyen huyen) {
		// TODO Auto-generated method stub
		if( huyenRepository.save(huyen) !=null ){
			return 1;
		}
		return 0;
	}


}
