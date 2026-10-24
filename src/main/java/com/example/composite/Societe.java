package com.example.composite;


public abstract  class Societe  {

    double coutUnitVehicule = 5.0;
    int nbrVehicule = 0;
   
    public  abstract boolean ajouterFilale(Societe filiale);
    public abstract  double CalculerChiffreAffaire() ;
     
      
    public void ajouterVehicule() {
       nbrVehicule++;
    }
}