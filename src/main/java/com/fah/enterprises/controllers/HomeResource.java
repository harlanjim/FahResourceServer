package com.fah.enterprises.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	@GetMapping("/ws/admin/")
	public String admin() {
		return "<h1>Hello Admin</h1>";
	}

}
