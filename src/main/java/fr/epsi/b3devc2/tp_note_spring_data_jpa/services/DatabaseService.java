package fr.epsi.b3devc2.tp_note_spring_data_jpa.services;

import fr.epsi.b3devc2.tp_note_spring_data_jpa.bo.*;
import fr.epsi.b3devc2.tp_note_spring_data_jpa.repository.AddressRepository;
import fr.epsi.b3devc2.tp_note_spring_data_jpa.repository.AnimalRepository;
import fr.epsi.b3devc2.tp_note_spring_data_jpa.repository.PetStoreRepository;
import fr.epsi.b3devc2.tp_note_spring_data_jpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Set;


@Service
public class DatabaseService {

    // insserting the repositories
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private PetStoreRepository petStoreRepository;

    @Autowired
    private AddressRepository addressRepository;

    // initializing the data dans la base de données

    public void initializeData() {
        Address address1 = new Address("10", "Rue des Lilas", "75001", "Paris");
        Address address2 = new Address("25", "Avenue des Champs", "75008", "Paris");
        Address address3 = new Address("15", "Boulevard Haussmann", "75009", "Paris");
        addressRepository.saveAll(List.of(address1, address2, address3));

        PetStore petStore1 = new PetStore(null, null, address1, "Pet Paradise", "John Doe");
        PetStore petStore2 = new PetStore(null, null, address2, "Animal House", "Jane Doe");
        petStoreRepository.saveAll(List.of(petStore1, petStore2));

        Product product1 = new Product(null, 15.99, ProdType.FOOD, "Dog Food", "P001");
        Product product2 = new Product(null, 25.49, ProdType.ACCESSORY, "Cat Collar", "P002");
        Product product3 = new Product(null, 9.99, ProdType.CLEANING, "Fish Tank Cleaner", "P003");
        productRepository.saveAll(List.of(product1, product2, product3));

        Animal cat1 = new Cat();
        cat1.setBirth(new Date());
        cat1.setCouleur("Black");
        cat1.setPetStore(petStore1);
        ((Cat) cat1).setChipId("CHIP123");

        Animal fish1 = new Fish();
        fish1.setBirth(new Date());
        fish1.setCouleur("Gold");
        fish1.setPetStore(petStore2);
        ((Fish) fish1).setLivingEnv(FishLivEnv.FRESH_WATER);


        petStore1.setProducts(Set.of(product1, product2, product3));


        petStoreRepository.save(petStore1);

        animalRepository.saveAll(List.of(cat1, fish1));
    }

    public List<Product> getProductsByCode(String code) {
        return productRepository.findByCode(code);
    }

    public List<Animal> getAnimalsByPetStore(Long petStoreId) {
        return animalRepository.findAnimalsByPetStore(petStoreId);
    }

}
