package br.com.softplan.cadastrodepessoas.model;

import java.time.LocalDate;

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
	private LocalDate dateOfBirth;
	private String naturalness;
	private String nationality;
	private LocalDate dateOfCriation = LocalDate.now();
	private LocalDate dateOfModification;
	
	public Person() { }
	
	public Person(String cpf, String name, Genders gender, String email, LocalDate dateOfBirth,
			String naturalness, String nationality, LocalDate dateOfCriation, LocalDate dateOfModification) {
		super();
		this.cpf = cpf;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.naturalness = naturalness;
		this.nationality = nationality;
		this.dateOfCriation = dateOfCriation;
		this.dateOfModification = dateOfModification;
	}
	public Person(String cpf, String name, Genders gender, String email, LocalDate dateOfBirth,
			String naturalness, String nationality, LocalDate dateOfCriation) {
		super();
		this.cpf = cpf;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.naturalness = naturalness;
		this.nationality = nationality;
		this.dateOfCriation = dateOfCriation;
	}
	public Person(String name, Genders gender, String email, LocalDate dateOfBirth,
			String naturalness, String nationality, LocalDate dateOfModification) {
		super();
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.naturalness = naturalness;
		this.nationality = nationality;
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
	public LocalDate getDateOfModification() {
		return dateOfModification;
	}
	public void setDateOfModification(LocalDate dateOfModification) {
		this.dateOfModification = dateOfModification;
	}	
}
