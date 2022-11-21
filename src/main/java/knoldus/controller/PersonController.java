package knoldus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import knoldus.dao.Person;
import knoldus.service.PersonService;

/**
 * The type Person controller.
 */
@Controller
public class PersonController {
	
	@Autowired
	private PersonService personService;

	/**
	 * Gets single person.
	 *
	 * @param id the id
	 * @return the single person
	 */
	@GetMapping("/person/{id}")
	public ModelAndView getSinglePerson(@PathVariable("id") int id) {
		
		ModelAndView mv = new ModelAndView("singlePerson");
		
		Person personById = personService.getPersonById(id);
		
		mv.addObject("person", personById);
		
		return mv;
	}

	/**
	 * Update person by id string.
	 *
	 * @param id the id
	 * @param p  the p
	 * @return the string
	 */
	@PostMapping("/person/{id}")
	public String updatePersonById(@PathVariable("id") int id , @ModelAttribute("person") Person p) {
		
		personService.update(p);
		return "redirect:/person/"+p.getId();
	}

	/**
	 * Delete by id string.
	 *
	 * @param id the id
	 * @return the string
	 */
	@GetMapping("/delete/{id}")
	public String deleteById(@PathVariable("id") int id) {
		
		personService.deleteById(id);
		
		return "redirect:/getAll";
	}
	

}
