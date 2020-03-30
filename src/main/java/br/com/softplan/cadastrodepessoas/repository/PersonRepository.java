package br.com.softplan.cadastrodepessoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.softplan.cadastrodepessoas.model.Person;


public interface PersonRepository extends JpaRepository<Person, Long> {

	Person findBycpf(String cpf);

}
