package com.example.ex_classes_abstraites;

public class Ordinateur extends Produit {
        private String processeur;
        private int ram; // en Go
        private int stockage; // en Go

        public Ordinateur(String nom, double prix, String processeur, int ram, int stockage) {
            super(nom, prix);
            this.processeur = processeur;
            this.ram = ram;
            this.stockage = stockage;
        }

        @Override
        public void afficherDetails() {
            System.out.println("Ordinateur: " + this.getNom() + ", Processeur: " + processeur + ", RAM: " + ram + " Go, Stockage: " + stockage + " Go, Prix: " + this.getPrix());
        }

        @Override
        public double calculerPrixAvecReduction() {
            double prixReduit;
            if(ram > 8) {
                prixReduit = this.getPrix()*0.95;
            }
            else {
                prixReduit = this.getPrix();
            }
            return prixReduit;
        }
}
