package com.savis.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savis.springboot.dao.model.Tinh;
import com.savis.springboot.dao.repository.TinhRepository;
import com.savis.springboot.service.TinhService;

@Service
public class TinhServiceImpl implements TinhService {

	@Autowired
	private TinhRepository tinhRepository;

	@Override
	public List<Tinh> findAll() {
		// TODO Auto-generated method stub
		return tinhRepository.findAll();
	}

	@Override
	public Tinh findOne(int id) {
		
		return tinhRepository.findOne(id);
	}

	@Override
	public int deleteById(int id) {
		try {
			tinhRepository.delete(id);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}

	}

	@Override
	public int create(Tinh tinh) {
		if (tinhRepository.save(tinh)!= null) {
			return 1;
		}
		return 0;
	}

	@Override
	public int updateTinh(Tinh tinh) {
		// TODO Auto-generated method stub
		if (tinhRepository.save(tinh)!= null) {
			return 1;
		}
		return 0;
	}
	@Override
	public int deleteAllTinh(){
		return 0;
	}

}
