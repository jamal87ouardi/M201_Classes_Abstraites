package com.example.ex_classes_abstraites;

public class Test {

    public static void main(String[] args) {


        Ordinateur ord1 = new Ordinateur("HP Elitbook",4300.0,"i5",16,512);

        ord1.afficherDetails();
        System.out.println(ord1.calculerPrixAvecReduction());


    }

}
