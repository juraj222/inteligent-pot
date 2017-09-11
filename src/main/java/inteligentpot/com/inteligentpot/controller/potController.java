package inteligentpot.com.inteligentpot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class potController {
	    @RequestMapping("/")
	    public String index() {
	        return "Greetings from Spring Boot!";
	    }

}
