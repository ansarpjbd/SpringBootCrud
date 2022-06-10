package com.gd.demo.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@GetMapping("/hello")
	public void hello()
	{
		System.out.println("hello Spring boot");
	}
	
	@GetMapping("/getstring")
	public String getString()
	{
		return "hello Spring boot";
	}
	
	
	@PostMapping("/hello")
	public String helloPost()
	{
		return "hello Spring boot Post Mapping";
	}
	
	@PutMapping("/hello")
	public String helloPut()
	{
		return "hello Spring boot Put Mapping";
	}
	
	@DeleteMapping("/hello")
	public String helloDelete()
	{
		return "hello Spring boot delete Mapping";
	}
	
	

}
