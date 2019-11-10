package com.waplak.pawn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("rest/pawn")
public class PawnController {
	
//	@Autowired
	RestTemplate pawnRestTemplate;
	
    @GetMapping("/{userName}")
    public String getPawnUser(@PathVariable("userName")String name) {
    //ResponseEntity<String> response= pawnRestTemplate.exchange("http://localhost:8300/rest/db/"+name, HttpMethod.GET, null,ParameterizedTypeReference<String>(){});
       
       return "Hi "+name+" Welcome to Hell";
    }
}
