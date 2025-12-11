package models;

// Classe Amazone (extension spécifique)
public class Amazone extends Guerrier {
    private String pouvoirSpecial;

    public Amazone(String nom, int niveau, int pointsDeVie, int force, String arme, String pouvoirSpecial) {
        super(nom, niveau, pointsDeVie, force, arme);
        this.pouvoirSpecial = pouvoirSpecial;
    }

    // Redéfinition avec ajout de fonctionnalité
    @Override
    public void attaquer() {
        System.out.println("L'amazone " + nom + " entre en action !");
        super.attaquer(); // Appel de la méthode parent
    }

    // Nouvelle méthode spécifique
    public void utiliserPouvoirSpecial() {
        System.out.println(nom + " active son pouvoir spécial: " + pouvoirSpecial);
    }
}