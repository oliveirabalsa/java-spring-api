package br.com.leonardo.aprendizado.repositories;

import br.com.leonardo.aprendizado.entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
}
