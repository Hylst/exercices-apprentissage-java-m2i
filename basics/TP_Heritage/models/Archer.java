package models;

// Classe Archer (hérite de Personnage et implémente CompetenceSpeciale)
public class Archer extends Personnage implements CompetenceSpeciale {
    private int agilite;
    private String typeArc;

    public Archer(String nom, int niveau, int pointsDeVie, int agilite, String typeArc) {
        super(nom, niveau, pointsDeVie);
        this.agilite = agilite;
        this.typeArc = typeArc;
    }

    @Override
    public void attaquer() {
        System.out.println(nom + " tire une flèche avec son " + typeArc + " (Agilité: " + agilite + ")");
    }

    @Override
    public void utiliserCompetence() {
        System.out.println(nom + " utilise la compétence 'Tir rapide' !");
        System.out.println("3 flèches sont tirées en même temps !");
    }

    // Méthode spécifique
    public void viser(String cible) {
        System.out.println(nom + " vise " + cible + " avec précision");
    }
}