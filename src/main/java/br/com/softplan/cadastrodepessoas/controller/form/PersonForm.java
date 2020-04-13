package br.com.softplan.cadastrodepessoas.controller.form;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import br.com.softplan.cadastrodepessoas.model.Person;

public class PersonForm {
	
	@NotEmpty @CPF @Column(unique=true)
	protected String cpf;
	@NotEmpty @Size(min = 2, max = 30)
	protected String name;
	protected String gender;
	@Email
	protected String email;
	@NotNull @Past
	protected LocalDate dateOfBirth;
	@Size(min = 2, max = 30)
	protected String naturalness;
	@Size(min = 2, max = 30)
	protected String nationality;
	@NotNull
	private LocalDate dateOfCriation = LocalDate.now();
	
	public Person toConvert() {
		return new Person(cpf,name,gender,email,dateOfBirth,naturalness,nationality,dateOfCriation);
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
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
	public LocalDate getDateOfCriation() {
		return dateOfCriation;
	}
	public void setDateOfCriation(LocalDate dateOfCriation) {
		this.dateOfCriation = dateOfCriation;
	}
}
