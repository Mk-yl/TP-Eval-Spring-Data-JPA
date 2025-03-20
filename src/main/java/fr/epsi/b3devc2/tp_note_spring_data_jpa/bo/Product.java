package fr.epsi.b3devc2.tp_note_spring_data_jpa.bo;


import jakarta.persistence.*;
import java.util.Set;

@Entity

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String label;

    @Enumerated(EnumType.STRING)
    private ProdType type;

    private double price;


    //relation many to many avec petstore
    @ManyToMany(mappedBy = "products")
    private Set<PetStore> petStores;

    // Constructeurs vide
    public Product() {
    }


    // Constructeur avec paramètres

    public Product(Set<PetStore> petStores, double price, ProdType type, String label, String code) {
        this.petStores = petStores;
        this.price = price;
        this.type = type;
        this.label = label;
        this.code = code;
    }


    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<PetStore> getPetStores() {
        return petStores;
    }

    public void setPetStores(Set<PetStore> petStores) {
        this.petStores = petStores;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProdType getType() {
        return type;
    }

    public void setType(ProdType type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
