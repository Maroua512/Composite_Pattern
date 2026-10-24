package com.example.composite;
import java.util.ArrayList;
import java.util.List;

// Composite : une société qui peut contenir plusieurs filiales.
public  class SocieteComposite extends Societe {

   // Liste des sociétés contenues dans le groupe.
   private final  List<Societe> filiales = new ArrayList<Societe>();
    @Override 
    public boolean ajouterFiliale(Societe filiale) {
        // Ajoute une filiale au groupe.
        return filiales.add(filiale);
    }

    @Override
    public double CalculerChiffreAffaires() {
        double chiffreAffaire = 0.0 ; 
        for (Societe filiale : filiales) {
            // Additionne le chiffre d'affaires de chaque filiale.
            chiffreAffaire += filiale.CalculerChiffreAffaires();
        }
        // Ajoute le chiffre d'affaires des véhicules du groupe.
        return chiffreAffaire + super.nbrVehicule * coutUnitaireVehicule;
    }
    


}
