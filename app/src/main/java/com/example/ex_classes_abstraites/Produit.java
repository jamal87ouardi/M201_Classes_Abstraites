package com.example.ex_classes_abstraites;

public abstract class Produit {

    private String nom;
    private double prix;

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public abstract void afficherDetails();
    public abstract double calculerPrixAvecReduction();





}
