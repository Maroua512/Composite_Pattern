package com.example.composite;
public class SocieteSansFiliale extends Societe {

    @Override 
    public boolean ajouterFilale(Societe filiale) {
        return false;
    }

    @Override
    public double CalculerChiffreAffaire() {
        return super.nbrVehicule * super.coutUnitVehicule;
    }
}