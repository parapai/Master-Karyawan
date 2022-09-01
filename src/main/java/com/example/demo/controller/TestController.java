package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ChannelService;

@RestController
@RequestMapping(value = "test")
public class TestController {
	
	@Autowired
	ChannelService channelService;

	@GetMapping("/getNumber/{value}")
	public String getNumber(@PathVariable String value) {
		return "Angka yang anda ketik adalah : "+value;
	}
	
	@GetMapping("/inputChannel/{channel}")
	public String inputChannel(@PathVariable String channel) {
		return channelService.findChannel(channel);
	}
}
