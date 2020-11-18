package per.itachi.middleware.mongodb.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonController {
	
	@GetMapping("/persons/{id}")
	public void getPerson() {
		
	}

}
