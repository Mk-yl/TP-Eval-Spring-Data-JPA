package fr.epsi.b3devc2.tp_note_spring_data_jpa.repository;

import fr.epsi.b3devc2.tp_note_spring_data_jpa.bo.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
