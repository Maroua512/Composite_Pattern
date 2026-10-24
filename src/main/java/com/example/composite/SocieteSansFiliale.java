package com.example.composite;

// Feuille : une société qui ne contient pas de filiale.
public class SocieteSansFiliale extends Societe {

    @Override 
    public boolean ajouterFiliale(Societe filiale) {
       // Une feuille ne peut pas contenir d'autre société.
       throw new UnsupportedOperationException(
        "Une société sans filiale ne peut pas contenir d'autre société"
    );
    }

    @Override
    public double CalculerChiffreAffaires() {
        return super.nbrVehicule * coutUnitaireVehicule;
    }
}