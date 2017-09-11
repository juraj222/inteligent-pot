package inteligentpot.com.inteligentpot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication
public class InteligentPotApplication {

	@RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World!";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(InteligentPotApplication.class, args);
	}
}
