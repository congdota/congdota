package com.savis.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.savis.springboot.dao.model.Tinh;
import com.savis.springboot.dao.model.Xa;
import com.savis.springboot.dao.repository.XaRepository;

import com.savis.springboot.service.XaService;
@Service
public class XaServiceImpl implements XaService{
	
	@Autowired
	private XaRepository xaRepository;
	@Override
	public List<Xa> findAll() {
		// TODO Auto-generated method stub
		return xaRepository.findAll();
	}

	@Override
	public Xa findOne(int id) {
		
		return xaRepository.findOne(id);
}

	@Override
	public int create(Xa xa) {
		if (xaRepository.save(xa) !=null){
			return 1;
		}
		return 0;
	}

	@Override
	public int deleteById(int id) {
		try{
			xaRepository.delete(id);
			return 1;
		}catch (Exception e){
			
		return 0;
		}
	}

	@Override
	public int updateXa(Xa xa) {
		// TODO Auto-generated method stub
			if(xaRepository.save(xa)!=null){
				return 1;
			}
		return 0;
	}

	@Override
	public int deleteAllXa() {
		// TODO Auto-generated method stub
		return 0;
	}

	



}
