package fr.epsi.b3devc2.tp_note_spring_data_jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import fr.epsi.b3devc2.tp_note_spring_data_jpa.bo.*;
import fr.epsi.b3devc2.tp_note_spring_data_jpa.repository.*;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;


@SpringBootApplication
public class TpNoteSpringDataJpaApplication implements CommandLineRunner {
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private PetStoreRepository petStoreRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private AnimalRepository animalRepository;

    public static void main(String[] args) {
        SpringApplication.run(TpNoteSpringDataJpaApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {



            // Insérer des adresses
            Address address1 = new Address();
            address1.setNumber("123");
            address1.setStreet("Main Street");
            address1.setZipCode("12345");
            address1.setCity("Paris");
            addressRepository.save(address1);

            // Insérer des produits
            Product product1 = new Product();
            product1.setCode("P001");
            product1.setLabel("Fish Food");
            product1.setType(ProdType.FOOD);
            product1.setPrice(20.0);
            productRepository.save(product1);

            Product product2 = new Product();
            product2.setCode("P002");
            product2.setLabel("Cat Toy");
            product2.setType(ProdType.ACCESSORY);
            product2.setPrice(15.0);
            productRepository.save(product2);

            // Insérer des animaleries
            PetStore petStore = new PetStore();
            petStore.setName("Animal World");
            petStore.setManagerName("Alice");
            petStore.setAddress(address1);
            petStoreRepository.save(petStore);

            // Lier les produits à l'animalerie
            petStore.getProducts().add(product1);
            petStore.getProducts().add(product2);
            petStoreRepository.save(petStore);

            // Insérer des animaux
            Cat cat = new Cat();
            cat.setBirth(new Date());
            cat.setCouleur("Black");
            cat.setPetStore(petStore);
            cat.setChipId("12345");
            animalRepository.save(cat);
        }

}
