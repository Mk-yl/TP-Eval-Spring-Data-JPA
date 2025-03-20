Projet Spring Data JPA - Animalerie

Auteurs

Nom: LY

Prénom: Mika

Description du Projet

Ce projet est une application Spring Boot utilisant Spring Data JPA pour gérer une animalerie. Il permet de gérer les animaleries (PetStore), les produits, les animaux et leurs relations.

Technologies Utilisées

Java 17

Spring Boot

Spring Data JPA


Maven

Fonctionnalités Implémentées

Gestion des entités : PetStore, Animal, Product, Address

Relations entre les entités :

@OneToMany entre PetStore et Animal

@ManyToMany entre PetStore et Product

@OneToOne entre PetStore et Address

Requêtes spécifiques :

Récupérer tous les produits en fonction d’un code produit

Récupérer tous les animaux d’une animalerie donnée

Insertion automatique des données via DatabaseService

Installation et Exécution

Cloner le projet :

Configurer la base de données :

Vérifiez que application.properties contient la bonne configuration.

J'ai un utilisateur pour ce projet dans ma BDD
spring.datasource.username=java
spring.datasource.password=java

Lancer l’application.

MR Sega the best 

