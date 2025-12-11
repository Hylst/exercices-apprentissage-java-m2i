package models;

public class Mage extends Personnage {
    private int intelligence;
    private String element;

    // Constructeur avec super()
    public Mage(String nom, int niveau, int pointsDeVie, int intelligence, String element) {
        super(nom, niveau, pointsDeVie);
        this.intelligence = intelligence;
        this.element = element;
    }

    // Implémentation de la méthode abstraite
    @Override
    public void attaquer() {
        System.out.println(nom + " lance un sort de " + element + " (Intelligence: " + intelligence + ")");
    }

    // Surcharge de la méthode sePresenter()
    @Override
    public void sePresenter() {
        super.sePresenter(); // Appel de la méthode parent
        System.out.println("Je maîtrise l'élément " + element);
    }

    // Méthode spécifique au Mage
    public void lancerSort(String sort) {
        System.out.println(nom + " lance le sort: " + sort);
    }
}