package fr.epsi.b3devc2.tp_note_spring_data_jpa.repository;

import fr.epsi.b3devc2.tp_note_spring_data_jpa.bo.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

    //Recherche d'animaux
    @Query("SELECT a FROM Animal a WHERE a.petStore.id = :petStoreId")
    List<Animal> findAnimalsByPetStore(@Param("petStoreId") Long petStoreId);
}