package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "test")
public class TestController {

	@GetMapping("/getNumber/{value}")
	public String getNumber(@PathVariable String value) {
		return "Angka yang anda ketik adalah : "+value;
	}
}
