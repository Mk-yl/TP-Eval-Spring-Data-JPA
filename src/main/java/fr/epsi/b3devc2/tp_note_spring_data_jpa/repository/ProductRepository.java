package fr.epsi.b3devc2.tp_note_spring_data_jpa.repository;

import fr.epsi.b3devc2.tp_note_spring_data_jpa.bo.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    //Recherche de produits par code
    List<Product> findByCode(String code);
}