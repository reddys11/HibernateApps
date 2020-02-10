package com.demo.hbmapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class MappingExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MappingExampleApplication.class, args);
	}

}
