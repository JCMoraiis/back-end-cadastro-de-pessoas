package br.com.softplan.cadastrodepessoas.controller.form;

import java.time.LocalDateTime;

import br.com.softplan.cadastrodepessoas.model.Person;

public class PersonForm {
	
	private String cpf;
	private String name;
	private String gender;
	private String email;
	private String dateOfBirth;
	private String naturalness;
	private String nationality;
	private LocalDateTime dateOfCriation = LocalDateTime.now();
	private LocalDateTime dateOfModification = null;
	
	public Person toConvert() {
		return new Person(cpf,name,gender,email,dateOfBirth,naturalness,nationality,dateOfCriation,dateOfModification);
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
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
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
	public LocalDateTime getDateOfCriation() {
		return dateOfCriation;
	}
	public void setDateOfCriation(LocalDateTime dateOfCriation) {
		this.dateOfCriation = dateOfCriation;
	}
	public LocalDateTime getDateOfModification() {
		return dateOfModification;
	}
	public void setDateOfModification(LocalDateTime dateOfModification) {
		this.dateOfModification = dateOfModification;
	}
}
