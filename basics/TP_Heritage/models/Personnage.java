package models;

public abstract class Personnage {
    protected String nom;
    protected int niveau;
    protected int pointsDeVie;

    // Constructeur avec super() appelé dans les sous-classes
    public Personnage(String nom, int niveau, int pointsDeVie) {
        this.nom = nom;
        this.niveau = niveau;
        this.pointsDeVie = pointsDeVie;
    }

    // Méthode abstraite à implémenter
    public abstract void attaquer();

    // Méthode concrète
    public void sePresenter() {
        System.out.println("Je suis " + nom + ", niveau " + niveau);
    }

    // Getters/Setters
    public String getNom() { return nom; }
    public int getNiveau() { return niveau; }
    public int getPointsDeVie() { return pointsDeVie; }
    public void setPointsDeVie(int points) { this.pointsDeVie = points; }
}
