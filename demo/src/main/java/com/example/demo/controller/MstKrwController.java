package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.MstKrw;
import com.example.demo.service.MstKrwService;

@RestController
@RequestMapping(value = "test")
public class MstKrwController {
	
	@Autowired
	private MstKrwService mstKrwService;

	@SuppressWarnings({ })
	@GetMapping("/findAll")
	public ResponseEntity<List<MstKrw>> searchParameter() {
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON)
				.body(mstKrwService.findAll());
	}
}
