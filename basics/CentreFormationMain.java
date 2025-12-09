import java.util.Arrays;
import java.util.List;

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
        List<Specialite> toutesSpecialites = Arrays.asList(javaJee, htmlCss, gestionProjet, js, php);

        // 2. Création des 4 enseignants
        List<Enseignant> enseignants = Arrays.asList(
                new Enseignant("M. Dupont", javaJee),
                new Enseignant("Mme. Martin", javaJee),
                new Enseignant("M. Bernard", php),
                new Enseignant("Mme. Dubois", js)
        );

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

        // PARTIE ÉTUDIANTS (corrigée)

        // Création des filières
        Filiere cda = new Filiere("cda", "CDA");
        Filiere marketing = new Filiere("marketing", "Marketing");
        Filiere assistanceVie = new Filiere("assistance_vie", "Assistance de vie");

        // Liste de toutes les filières
        List<Filiere> toutesFilieres = Arrays.asList(cda, marketing, assistanceVie);

        // Création des 5 étudiants (en supposant qu'il existe une classe Etudiant)
        List<Etudiant> etudiants = Arrays.asList(
                new Etudiant("Simpson", "Homer", cda),
                new Etudiant("Simpson", "Bart", cda),
                new Etudiant("Sultan", "Vanessa", marketing),
                new Etudiant("Simpson", "Marge", marketing),
                new Etudiant("Simpson", "Lisa", marketing)
        );

        System.out.println("\n=== LISTE DES ÉTUDIANTS PAR FILIÈRE ===\n");

        for (Filiere filiere : toutesFilieres) {
            System.out.println("Filière : " + filiere.getLibelle());
            System.out.println("-----------------------------------");

            boolean trouveEtudiant = false;

            for (Etudiant etudiant : etudiants) {
                // Comparaison par nom de filière
                if (etudiant.getFiliere().getLibelle().equals(filiere.getLibelle())) {
                    System.out.println("- " + etudiant.getPrenom() + " " + etudiant.getNom());
                    trouveEtudiant = true;
                }
            }

            if (!trouveEtudiant) {
                System.out.println("Aucun étudiant pour la filière " + filiere.getLibelle());
            }

            System.out.println();
        }
    }
}