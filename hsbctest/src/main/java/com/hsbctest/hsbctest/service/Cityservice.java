package com.hsbctest.hsbctest.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class Cityservice {
	
	
	public Long fetchCity(String city) throws JsonProcessingException, IOException {
	Long value=0L;
	ArrayList<String> l=new ArrayList<String>();
	ObjectMapper mapper=new ObjectMapper();
	File file=new File("src\\main\\resources\\cites.txt");
	JsonNode jsnode=mapper.readTree(file);
	JsonNode list=jsnode.findValue("list");
	
	for (JsonNode jsonNode : list) {	
		l.add(jsonNode.findValue("name").asText());
	}
	String jq=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
	if(city!=null) {
		value=l.stream().filter(p->p.matches(city+".*")).count();
	}
	return value;
}
}
