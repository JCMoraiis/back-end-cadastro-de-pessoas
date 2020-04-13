package br.com.softplan.cadastrodepessoas.controller;

import java.net.URI;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.softplan.cadastrodepessoas.controller.dto.PersonDTO;
import br.com.softplan.cadastrodepessoas.controller.form.PersonForm;
import br.com.softplan.cadastrodepessoas.controller.form.PersonFormUpdate;
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
	@Transactional
	public ResponseEntity<PersonDTO> register(@RequestBody @Valid PersonForm form, UriComponentsBuilder uriBuilder) {
		Person person = form.toConvert();
		personRepository.save(person);
		
		URI uri = uriBuilder.path("/cadastrar/{id}").buildAndExpand(person.getId()).toUri();
		return ResponseEntity.created(uri).body(new PersonDTO(person));
	}
	
	@PutMapping("atualizar/{id}")
	@Transactional
	public ResponseEntity<PersonDTO> update(@PathVariable Long id, @RequestBody @Valid PersonFormUpdate form) {
		Optional<Person> optional = personRepository.findById(id);
		if (optional.isPresent()) {
			Person person = form.atualizar(id, personRepository);
			return ResponseEntity.ok(new PersonDTO(person));
		}
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("remover/{id}")
	@Transactional
	public ResponseEntity<?> remove(@PathVariable Long id) {
		Optional<Person> optional = personRepository.findById(id);
		if (optional.isPresent()) {
			personRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}
}
