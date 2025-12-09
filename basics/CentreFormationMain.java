public class CentreFormationMain {
    // CENTRE DE FORMATION AFPA
    public static void main(String[] args) {
        // 1. Création des 5 spécialités
        Specialite javaJee = new Specialite("JAVA/JEE");
        Specialite htmlCss = new Specialite("HTML/CSS");
        Specialite gestionProjet = new Specialite("Gestion de projet");
        Specialite js = new Specialite("JS");
        Specialite php = new Specialite("PHP");

        // Liste de toutes les spécialités
        Specialite[] toutesSpecialites = {javaJee, htmlCss, gestionProjet, js, php};

        // 2. Création des 4 enseignants
        Enseignant[] enseignants = new Enseignant[4];

        // Les deux premiers enseignent JAVA/JEE
        enseignants[0] = new Enseignant("M. Dupont", javaJee);
        enseignants[1] = new Enseignant("Mme. Martin", javaJee);

        // Le 3ème enseigne le PHP
        enseignants[2] = new Enseignant("M. Bernard", php);

        // Le dernier du JS
        enseignants[3] = new Enseignant("Mme. Dubois", js);

        // 3. Affichage des enseignants par spécialité
        System.out.println("=== LISTE DES ENSEIGNANTS PAR SPÉCIALITÉ ===\n");

        for (Specialite specialite : toutesSpecialites) {
            System.out.println("Spécialité : " + specialite.getNom());
            System.out.println("-----------------------------------");

            boolean trouve = false;

            for (Enseignant enseignant : enseignants) {
                // Comparaison par nom de spécialité
                if (enseignant.getSpecialite().getNom().equals(specialite.getNom())) {
                    System.out.println("- " + enseignant.getNom());
                    trouve = true;
                }
            }

            if (!trouve) {
                System.out.println("Aucun enseignant pour la spécialité " + specialite.getNom());
            }

            System.out.println();
        }
    }
}