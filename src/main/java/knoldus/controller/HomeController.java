package knoldus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * The type Home controller.
 */
@Controller
public class HomeController {
	
	
	@Autowired
	private MarkLogicOperations ops;

	/**
	 * Home page string.
	 *
	 * @return the string
	 */
	@GetMapping("/")
	public String homePage() {
		
		
				
		return "home";
	}

	/**
	 * The type Mark logic operations.
	 */
	public class MarkLogicOperations {
	}
}
