package br.com.softplan.cadastrodepessoas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.softplan.cadastrodepessoas.controller.dto.PersonDTO;
import br.com.softplan.cadastrodepessoas.controller.form.PersonForm;
import br.com.softplan.cadastrodepessoas.model.Person;
import br.com.softplan.cadastrodepessoas.repository.PersonRepository;

@RestController
public class PersonController {
	
	@Autowired
	private PersonRepository personRepository;
	
	@RequestMapping("/consultar")
	public PersonDTO consult(String cpf) {
		Person person = personRepository.findBycpf(cpf);
		return PersonDTO.toConvert(person);
	}
	
	@PostMapping("/cadastrar")
	public void register(@RequestBody PersonForm form) {
		Person person = form.toConvert();
		personRepository.save(person);
	}
}
