package br.com.softplan.cadastrodepessoas.model;

import java.time.LocalDateTime;

public class Person {
	
	private String cpf;
	private String name;
	private Genders genders;
	private String email;
	private LocalDateTime dateOfBirth;
	private String naturalness;
	private String nacionality;
	
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
	public Genders getGenders() {
		return genders;
	}
	public void setGenders(Genders genders) {
		this.genders = genders;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNaturalness() {
		return naturalness;
	}
	public void setNaturalness(String naturalness) {
		this.naturalness = naturalness;
	}
	public String getNacionality() {
		return nacionality;
	}
	public void setNacionality(String nacionality) {
		this.nacionality = nacionality;
	}
	
	
}
