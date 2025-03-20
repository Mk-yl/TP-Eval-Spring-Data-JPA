package fr.epsi.b3devc2.tp_note_spring_data_jpa.bo;

import jakarta.persistence.*;

import java.util.Set;



@Entity

public class PetStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String managerName;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToMany
    @JoinTable(
            name = "petstore_product",
            joinColumns = @JoinColumn(name = "petstore_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id")
    )
    private Set<Product> products;

    @OneToMany(mappedBy = "petStore")
    private Set<Animal> animals;


    // Constructeurs vide
    public PetStore() {
    }

    // Constructeur avec paramètres
    public PetStore(Set<Animal> animals, Set<Product> products, Address address, String name, String managerName) {
        this.animals = animals;
        this.products = products;
        this.address = address;
        this.name = name;
        this.managerName = managerName;
    }


    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(Set<Animal> animals) {
        this.animals = animals;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}