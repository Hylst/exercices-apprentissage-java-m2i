
public class main {
    // CENTRE DE FORMATION AFPA
    public static void main(String[] args) {

        // 5 spécialités
        Specialite javaJee = new Specialite("JAVA/JEE");
        Specialite htmlCss = new Specialite("HTML/CSS");
        Specialite gestionProjet = new Specialite("Gestion de projet");
        Specialite js = new Specialite("JS");
        Specialite php = new Specialite("PHP");

        // Liste de toutes les spécialités
        Specialite[] toutesSpecialites = {javaJee, htmlCss, gestionProjet, js, php};

        // Tableau d'enseignants : 4
        Enseignant[] enseignants = new Enseignant[4];
        enseignants[0] = new Enseignant("Robert", javaJee);
        enseignants[1] = new Enseignant("Didier", javaJee);
        enseignants[2] = new Enseignant("Gertrude", php);
        enseignants[3] = new Enseignant("Honorine", js);

        List<Enseignant> enseignants = Arrays.asList(robert, didier, gertrude, honorine);

        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║    CENTRE DE FORMATION AFPA           ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("║         SPECIALITES PROPOSES           ║");

        for (Specialite specialite : toutesSpecialites) {
            System.out.println("Spécialité : " + specialite.getNom());
            System.out.println("═══════════════════════════════════");
        }

        boolean trouve = false;

        System.out.println("╚════════════════════════════════════════╝");

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

    }
}
