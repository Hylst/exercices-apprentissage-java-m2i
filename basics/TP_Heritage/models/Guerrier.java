package models;

public class Guerrier extends Personnage implements CompetenceSpeciale {
    private int force;
    private String arme;

    // Constructeur avec super()
    public Guerrier(String nom, int niveau, int pointsDeVie, int force, String arme) {
        super(nom, niveau, pointsDeVie);
        this.force = force;
        this.arme = arme;
    }

    // Implémentation de la méthode abstraite
    @Override
    public void attaquer() {
        System.out.println(nom + " attaque avec son " + arme + " (Force: " + force + ")");
    }

    // Surcharge de la méthode attaquer
    public void attaquer(String cible) {
        System.out.println(nom + " attaque " + cible + " avec son " + arme);
    }

    // Surcharge avec paramètre supplémentaire
    public void attaquer(String cible, int puissance) {
        int degats = force * puissance;
        System.out.println(nom + " inflige " + degats + " dégâts à " + cible);
    }

    // Implémentation de l'interface
    @Override
    public void utiliserCompetence() {
        System.out.println(nom + " utilise la compétence 'Fureur du guerrier' !");
        this.force += 10;
        System.out.println("Force augmentée à: " + force);
    }

    // Méthode spécifique au Guerrier
    public void seDefendre() {
        System.out.println(nom + " se défend avec son bouclier");
    }
}

