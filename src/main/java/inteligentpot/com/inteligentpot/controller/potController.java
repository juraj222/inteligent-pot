package inteligentpot.com.inteligentpot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class potController {
	    @RequestMapping("/")
	    public String index() {
	        return "Greetings from Spring Boot!";
	    }

}
