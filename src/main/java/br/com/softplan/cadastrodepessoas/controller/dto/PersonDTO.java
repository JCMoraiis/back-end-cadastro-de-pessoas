package br.com.softplan.cadastrodepessoas.controller.dto;

import java.time.LocalDateTime;

import br.com.softplan.cadastrodepessoas.model.Person;

public class PersonDTO {
	
	private String cpf;
	private String name;
	private String gender;
	private String email;
	private LocalDateTime dateOfBirth;
	private String naturalness;
	private String nationality;
	
	public PersonDTO(Person person) {
		
		this.name = person.getName();
		this.gender = person.getGender().toString();
		this.email = person.getEmail();
		this.dateOfBirth = person.getDateOfBirth();
		this.naturalness = person.getNaturalness();
		this.nationality = person.getNationality();
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
	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}
	public String getNaturalness() {
		return naturalness;
	}
	public String getNationality() {
		return nationality;
	}
}
