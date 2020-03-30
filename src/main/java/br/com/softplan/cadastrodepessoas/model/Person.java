package br.com.softplan.cadastrodepessoas.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique=true)
	private String cpf;
	private String name;
	@Enumerated(EnumType.STRING)
	private Genders gender;
	private String email;
	private String dateOfBirth;
	private String naturalness;
	private String nationality;
	private LocalDateTime dateOfCriation = LocalDateTime.now();
	private LocalDateTime dateOfModification = null;
	
	public Person() { }
	
	public Person(String cpf, String name, String gender, String email, String dateOfBirth,
			String naturalness, String nationality, LocalDateTime dateOfCriation, LocalDateTime dateOfModification) {
		super();
		this.cpf = cpf;
		this.name = name;
		this.gender = Genders.valueOf(gender);
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.naturalness = naturalness;
		this.nationality = nationality;
		this.dateOfCriation = dateOfCriation;
		this.dateOfModification = dateOfModification;
	}

	public String getCpf() {
		return cpf;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
