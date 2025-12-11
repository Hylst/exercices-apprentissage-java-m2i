import models.*;

// Classe principale de test
public class MondeHeroique {
    public static void main(String[] args) {
        System.out.println("=== CRÉATION DES PERSONNAGES ===\n");

        // Instanciation de personnages
        Guerrier thor = new Guerrier("Thor", 15, 200, 30, "Marteau");
        Mage merlin = new Mage("Merlin", 20, 150, 50, "Feu");
        Archer legolas = new Archer("Legolas", 18, 180, 40, "Arc long");
        Amazone artemis = new Amazone("Artémis", 25, 220, 35, "Épée double", "Vision nocturne");

        // Tableau des personnages
        Personnage[] personnages = {thor, merlin, legolas, artemis};

        // Appel des méthodes sur chaque personnage
        for (Personnage p : personnages) {
            p.sePresenter();
            p.attaquer();
            System.out.println();
        }

        System.out.println("=== DÉMONSTRATION DES SURCHARGES ===\n");

        // Surcharge des méthodes attaquer()
        thor.attaquer();
        thor.attaquer("un gobelin");
        thor.attaquer("un dragon", 3);

        System.out.println("\n=== COMPÉTENCES SPÉCIALES ===\n");

        // Utilisation de l'interface CompetenceSpeciale
        CompetenceSpeciale[] competents = {thor, legolas};
        for (CompetenceSpeciale cs : competents) {
            cs.utiliserCompetence();
        }

        System.out.println("\n=== MÉTHODES SPÉCIFIQUES ===\n");

        // Appel de méthodes spécifiques
        thor.seDefendre();
        merlin.lancerSort("Boule de feu");
        legolas.viser("l'œil de Sauron");
        artemis.utiliserPouvoirSpecial();

        System.out.println("\n=== MODIFICATION D'ÉTAT ===\n");

        // Modification des points de vie
        System.out.println("Points de vie de Thor avant combat: " + thor.getPointsDeVie());
        thor.setPointsDeVie(150);
        System.out.println("Points de vie de Thor après combat: " + thor.getPointsDeVie());

        System.out.println("\n=== PRÉSENTATION SPÉCIFIQUE ===\n");

        // Appel de la méthode surchargée sePresenter()
        merlin.sePresenter();
    }
}