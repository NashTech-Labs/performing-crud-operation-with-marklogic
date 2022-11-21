package knoldus.service.impl;

import knoldus.controller.HomeController;
import knoldus.dao.Person;
import knoldus.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private HomeController.MarkLogicOperations ops;

	@Override
	public Person insert(Person p) {

		LocalDateTime time = LocalDateTime.now();
		Integer generatedId = Integer
				.valueOf(time.getDayOfMonth() + "" + time.getHour() + "" + time.getMinute() + "" + time.getSecond());
		p.setId(generatedId);

		Person write = ops.write(p);

		return write;
	}

	@Override
	public List<Person> list() {

		List<Person> search = ops.search(Person.class);

		return search;

	}

	@Override
	public Person getPersonById(int id) {


		Person read;
		read = ops.read(id,
				Person.class);

		return read;
	}

	@Override
	public Person update(Person p) {

		Person write = ops.write(p);

		return write;

	}

	@Override
	public void deleteById(int id) {
		
		ops.deleteById(id, Person.class);
		
	}

}
