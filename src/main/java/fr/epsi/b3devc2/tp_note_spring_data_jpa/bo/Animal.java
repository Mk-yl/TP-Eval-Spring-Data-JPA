package fr.epsi.b3devc2.tp_note_spring_data_jpa.bo;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;



@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date birth;
    private String couleur;

    @ManyToOne
    @JoinColumn(name = "petstore_id")
    private PetStore petStore;

    // Constructeurs vide
    public Animal() {
    }

    // Constructeur avec paramètres
    public Animal(Date birth, String couleur, PetStore petStore) {
        this.birth = birth;
        this.couleur = couleur;
        this.petStore = petStore;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public PetStore getPetStore() {
        return petStore;
    }

    public void setPetStore(PetStore petStore) {
        this.petStore = petStore;
    }
}
