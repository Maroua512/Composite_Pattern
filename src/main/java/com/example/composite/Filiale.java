package com.example.composite;
import java.util.ArrayList;
import java.util.List;
public  class Filiale extends Societe {

    List<Societe> filiales = new ArrayList<Societe>();
    @Override 
    public boolean ajouterFilale(Societe filiale) {
        return filiales.add(filiale);
    }

    @Override
    public double CalculerChiffreAffaire() {
        double chiffreAffaire = 0.0 ; 
        for (Societe filiale : filiales) {
            chiffreAffaire += filiale.CalculerChiffreAffaire();
        }
        return chiffreAffaire + super.nbrVehicule * super.coutUnitVehicule;
    }
    


}
