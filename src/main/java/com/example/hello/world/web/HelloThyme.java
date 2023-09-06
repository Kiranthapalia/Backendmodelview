package com.example.hello.world.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloThyme {

	@GetMapping("/helllo")
	public String sayHello(@RequestParam(name = "name") String name, @RequestParam(name = "age") int age) {
		if (age > 18) {
			return "Welcome " + name + "!";

		} else {
			return "You are too young!";
		}
	}
}
