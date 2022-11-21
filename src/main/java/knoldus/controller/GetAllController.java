package knoldus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import knoldus.service.PersonService;

/**
 * The type Get all controller.
 */
@Controller
public class GetAllController {
	
	@Autowired
	private PersonService personService;


	/**
	 * Show all persons model and view.
	 *
	 * @return the model and view
	 */
	@GetMapping("/getAll")
	public ModelAndView showAllPersons() {
		
		ModelAndView  mv  = new ModelAndView("getAll");
		mv.addObject("persons", personService.list());
		return mv;
	}

}
