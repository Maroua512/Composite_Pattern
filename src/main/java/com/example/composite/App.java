package com.example.composite;

public final class App {

    private App() {
    }

    public static void main(String[] args) {
        // Création d'une société sans filiale avec un véhicule.
        Societe societe1 = new SocieteSansFiliale(); 
	    societe1.ajouterVehicule(); 

        // Création d'une deuxième société avec deux véhicules.
	    Societe societe2 = new SocieteSansFiliale(); 
	    societe2.ajouterVehicule(); 
	    societe2.ajouterVehicule(); 

        // Création du groupe et ajout de ses filiales.
	    Societe groupe = new SocieteComposite();
	    groupe.ajouterFiliale(societe1);
	    groupe.ajouterFiliale(societe2);
	    groupe.ajouterVehicule(); 
	    System.out.println( 
	      " Cot dentretien total du groupe : " + 
	      groupe.CalculerChiffreAffaires());
    }
}
