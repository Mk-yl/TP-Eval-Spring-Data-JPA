package fr.epsi.b3devc2.tp_note_spring_data_jpa.repository;

import fr.epsi.b3devc2.tp_note_spring_data_jpa.bo.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
