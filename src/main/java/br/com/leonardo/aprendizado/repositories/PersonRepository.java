package br.com.leonardo.aprendizado.repositories;

import br.com.leonardo.aprendizado.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
