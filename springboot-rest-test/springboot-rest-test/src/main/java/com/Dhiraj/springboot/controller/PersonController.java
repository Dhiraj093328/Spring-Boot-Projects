package com.Dhiraj.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Dhiraj.springboot.model.Person;
import com.Dhiraj.springboot.service.PersonService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/persons")
@AllArgsConstructor
public class PersonController {
	@Autowired
	private PersonService personService;
	
	@GetMapping
	public List<Person> getPerson()
	{
		return personService.getAllPerson();
	}
	@GetMapping("/{id}")
	public Person getPerson(@PathVariable Long id)
	{
		return personService.getPersonById(id);
	}
	@PostMapping
	public Person createPerson(@RequestBody Person person)
	{
		return personService.createPerson(person);
	}
	@PutMapping("/{id}")
	public Person updatePerson(@PathVariable Long id,@RequestBody Person person)
	{
		return personService.updatePerson(id, person);
	}
	@DeleteMapping
	public String deletePerson(@PathVariable Long id)
	{
		return personService.deletePerson(id);
	}

}
