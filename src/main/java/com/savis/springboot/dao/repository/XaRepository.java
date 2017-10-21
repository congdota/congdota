package com.savis.springboot.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savis.springboot.dao.model.Xa;

public interface XaRepository  extends JpaRepository<Xa, Integer>{
}
