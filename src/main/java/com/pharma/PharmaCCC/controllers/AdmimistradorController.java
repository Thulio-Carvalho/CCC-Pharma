package com.pharma.PharmaCCC.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/administrador")
public class AdmimistradorController {
	@RequestMapping(method = RequestMethod.GET)
	public String administradorController() {
		return "Controller Administrador ok!";
	}
}
