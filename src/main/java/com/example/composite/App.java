package com.example.composite;

public final class App {

    private App() {
    }

    public static void main(String[] args) {
      
        Societe societe1 = new SocieteSansFiliale(); 
	    societe1.ajouterVehicule(); 
	    Societe societe2 = new SocieteSansFiliale(); 
	    societe2.ajouterVehicule(); 
	    societe2.ajouterVehicule(); 
	    Societe groupe = new Filiale(); 
	    groupe.ajouterFilale(societe1); 
	    groupe.ajouterFilale(societe2); 
	    groupe.ajouterVehicule(); 
	    System.out.println( 
	      " Cot dentretien total du groupe : " + 
	      groupe.CalculerChiffreAffaire()); 
    }
}
