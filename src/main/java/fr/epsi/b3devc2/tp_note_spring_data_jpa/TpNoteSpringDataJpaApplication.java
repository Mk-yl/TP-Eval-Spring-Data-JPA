package fr.epsi.b3devc2.tp_note_spring_data_jpa;

import fr.epsi.b3devc2.tp_note_spring_data_jpa.bo.Animal;
import fr.epsi.b3devc2.tp_note_spring_data_jpa.bo.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import fr.epsi.b3devc2.tp_note_spring_data_jpa.services.DatabaseService;

import java.util.List;

@SpringBootApplication
public class TpNoteSpringDataJpaApplication implements CommandLineRunner {

    @Autowired
    private DatabaseService databaseService;

    public static void main(String[] args) {
        SpringApplication.run(TpNoteSpringDataJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // Initialisation des données via le service
        databaseService.initializeData();

        // Tester la récupération des produits par code
        List<Product> products = databaseService.getProductsByCode("P001");
        System.out.println("Produits avec code P001 : " + products);

        // Tester la récupération des animaux par animalerie
        List<Animal> animals = databaseService.getAnimalsByPetStore(1L); // ID de l'animalerie à vérifier
        System.out.println("Animaux dans l'animalerie 1 : " + animals);
    }
}
