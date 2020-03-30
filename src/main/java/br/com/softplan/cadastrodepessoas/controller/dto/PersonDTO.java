package br.com.softplan.cadastrodepessoas.controller.dto;

import java.time.LocalDateTime;

import br.com.softplan.cadastrodepessoas.model.Person;

public class PersonDTO {
	
	private Long id;
	private String cpf;
	private String name;
	private String gender;
	private String email;
	private String dateOfBirth;
	private String naturalness;
	private String nationality;
	
	public PersonDTO(Person person) {
		
		this.id = person.getId();
		this.cpf = person.getCpf();
		this.name = person.getName();
		this.gender = person.getGender().toString();
		this.email = person.getEmail();
		this.dateOfBirth = person.getDateOfBirth();
		this.naturalness = person.getNaturalness();
		this.nationality = person.getNationality();
	}

	public static PersonDTO toConvert(Person person) {
		return new PersonDTO(person);
	}
	
	public Long getId() {
		return id;
	}
	
	public String getCpf() {
		return cpf;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getEmail() {
		return email;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public String getNaturalness() {
		return naturalness;
	}
	public String getNationality() {
		return nationality;
	}
}
