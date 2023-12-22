package br.ce.wcaquino.taskbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value ="/")
public class RootController {

	
	@GetMapping
	public String hello() {
		return "Hello World! - " + new Date().toString() + " - André 2023!";
	}
}
