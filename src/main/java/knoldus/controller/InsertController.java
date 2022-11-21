package knoldus.controller;

import knoldus.dao.Person;
import knoldus.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * The type Insert controller.
 */
@Controller
public class InsertController {

	
	@Autowired
	private PersonService personService;


	/**
	 * Gets insert page.
	 *
	 * @param model the model
	 * @return the insert page
	 */
	@GetMapping("/insert")
	public ModelAndView getInsertPage(Model model) {

		return new ModelAndView("insert", "person", new Person());

	}


	/**
	 * Process insert form string.
	 *
	 * @param person the person
	 * @param result the result
	 * @param model  the model
	 * @return the string
	 */
	@PostMapping("/insert")
	public String processInsertForm(@ModelAttribute("person") Person person, BindingResult result, ModelMap model) {

		personService.insert(person);
		
		return "insert";
	}

}
