package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MstKrw;
import com.example.demo.repository.MstKrwRepository;

@Service
public class MstKrwService {

	@Autowired
	private MstKrwRepository mstKrwRepository;

	public List<MstKrw> findAll() {

		return mstKrwRepository.findAll();

	}

}
