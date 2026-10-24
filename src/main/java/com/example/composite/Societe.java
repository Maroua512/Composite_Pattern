package com.example.composite;


public abstract  class Societe  {

     // Tarif appliqué à chaque véhicule.
     protected static final double coutUnitaireVehicule = 5.0;
     // Nombre de véhicules gérés par cette société.
     protected int nbrVehicule = 0;
   
    // Une société composite peut ajouter des filiales.
    public  abstract boolean ajouterFiliale(Societe filiale);
    // Calcule le chiffre d'affaires de la société.
    public abstract  double CalculerChiffreAffaires() ;
     
      
    public void ajouterVehicule() {
       // Ajoute un véhicule à la société.
       nbrVehicule++;
    }
}