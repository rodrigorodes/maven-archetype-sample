package ${package};

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingResource {

	@GetMapping
	public String get() {
		return "Ola Mundo!";
	}
}
