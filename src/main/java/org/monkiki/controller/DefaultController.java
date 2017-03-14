package org.monkiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Date;

/**
 * Created by pavila on 17/06/16.
 */
@Controller
public class DefaultController {

	@GetMapping("/")
	public String login(Model model) {
		model.addAttribute("fecha", new Date(System.currentTimeMillis()));
		return "index";
	}

	@GetMapping("/header")
	public String header() {
		return "include/header";
	}

	@GetMapping("/menu")
	public String menu(Model model) {
		return "include/menu";
	}

	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("lista", "Perico Palotes");
		return "list";
	}
}
