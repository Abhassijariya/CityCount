package com.hsbctest.hsbctest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbctest.hsbctest.service.Cityservice;

import lombok.extern.slf4j.Slf4j;



@RestController
@Slf4j
@CrossOrigin
@RequestMapping("/json")
public class Citycontroller {

	@Autowired
	private Cityservice Cityservice;
	
	@GetMapping("/api")
	public String simpleApi() {
		log.info("API is working fine --_::::");
		return "JSON format";
	}
	
	@GetMapping(value={"/fetch/cites", "/fetch/cites/{city}"})
	public Long citesNumber(@PathVariable(required = false) String city) {
		Long value=0L;
		try {
			value=Cityservice.fetchCity(city);
			return value;
		} catch (Exception e) {
			e.printStackTrace();
			return value;
		}
		
	}
	
}
