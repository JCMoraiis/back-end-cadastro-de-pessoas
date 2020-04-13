package br.com.softplan.cadastrodepessoas.controller.form;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import br.com.softplan.cadastrodepessoas.model.Genders;
import br.com.softplan.cadastrodepessoas.model.Person;
import br.com.softplan.cadastrodepessoas.repository.PersonRepository;

public class PersonFormUpdate {
	
	@NotEmpty @Size(min = 2, max = 30)
	protected String name;
	protected Genders gender;
	@Email
	protected String email;
	@NotNull @Past
	protected LocalDate dateOfBirth;
	@Size(min = 2, max = 30)
	protected String naturalness;
	@Size(min = 2, max = 30)
	protected String nationality;
	@NotNull
	private LocalDate dateOfModification = LocalDate.now();
	
	public Person atualizar(Long id, PersonRepository personRepository) {
		
		Person person = personRepository.getOne(id);
		person.setName(this.name);
		person.setGender(this.gender);
		person.setEmail(this.email);
		person.setDateOfBirth(this.dateOfBirth);
		person.setNaturalness(this.naturalness);
		person.setNationality(this.nationality);
		person.setDateOfModification(this.dateOfModification);
		
		return person;
	}
	
	public Person toConvert() {
		return new Person(name,gender,email,dateOfBirth,naturalness,nationality,dateOfModification);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Genders getGender() {
		return gender;
	}
	public void setGender(Genders gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNaturalness() {
		return naturalness;
	}
	public void setNaturalness(String naturalness) {
		this.naturalness = naturalness;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public LocalDate getDateOfModification() {
		return dateOfModification;
	}
	public void setDateOfModification(LocalDate dateOfModification) {
		this.dateOfModification = dateOfModification;
	}
}
