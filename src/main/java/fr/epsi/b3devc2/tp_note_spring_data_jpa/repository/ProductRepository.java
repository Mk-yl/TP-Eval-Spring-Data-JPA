package fr.epsi.b3devc2.tp_note_spring_data_jpa.repository;

import fr.epsi.b3devc2.tp_note_spring_data_jpa.bo.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByCode(String code);
}
