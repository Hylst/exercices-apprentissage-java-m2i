import java.util.Arrays;
import java.util.List;

public class CentreFormationMain {
    public static void main(String[] args) {

        System.out.println("=== CENTRE DE FORMATION AFPA ===\n");

        // Création des 5 spécialités
        Specialite javaJee = new Specialite("JAVA/JEE");
        Specialite htmlCss = new Specialite("HTML/CSS");
        Specialite gestionProjet = new Specialite("Gestion de projet");
        Specialite js = new Specialite("JS");
        Specialite php = new Specialite("PHP");

        List<Specialite> toutesSpecialites = Arrays.asList(javaJee, htmlCss, gestionProjet, js, php);

        List<Enseignant> enseignants = Arrays.asList(
                new Enseignant("M. Dupont", javaJee),
                new Enseignant("Mme. Martin", javaJee),
                new Enseignant("M. Bernard", php),
                new Enseignant("Mme. Dubois", js)
        );

        Enseignant formateurCDA = new Enseignant("Charles Montgomery Burns", javaJee);
        Enseignant formateurMarketing = new Enseignant("Zack Kas", gestionProjet);
        Enseignant formateurAssistance = new Enseignant("Aucun formateur", null);

        Filiere cda = new Filiere("cda", "CDA", formateurCDA);
        Filiere marketing = new Filiere("marketing", "Marketing", formateurMarketing);
        Filiere assistanceVie = new Filiere("assistance_vie", "Assistance de vie", formateurAssistance);

        // 3. Affichage des enseignants par spécialité
        System.out.println("=== LISTE DES ENSEIGNANTS PAR SPÉCIALITÉ ===\n");

        for (Specialite specialite : toutesSpecialites) {
            System.out.println("Spécialité : " + specialite.getNom());
            System.out.println("-----------------------------------");

            boolean trouve = false;

            for (Enseignant enseignant : enseignants) {
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

        // PARTIE ÉTUDIANTS
        List<Filiere> toutesFilieres = Arrays.asList(cda, marketing, assistanceVie);

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

        // === PARTIE FINALE ===
        System.out.println("\n=== FORMATEURS ET LISTE DES APPRENANTS PAR FILIÈRE ===\n");

        for (Filiere filiere : toutesFilieres) {

            System.out.println(filiere.getLibelle());
            System.out.println("Formateur : " + filiere.getFormateur().getNom());

            int compteur = 1;
            boolean aDesEtudiants = false;

            for (Etudiant etudiant : etudiants) {
                if (etudiant.getFiliere().getLibelle().equals(filiere.getLibelle())) {
                    System.out.println(compteur + ". " + etudiant.getPrenom() + " " + etudiant.getNom());
                    compteur++;
                    aDesEtudiants = true;
                }
            }

            if (!aDesEtudiants) {
                System.out.println("Pas d’inscrit");
            }

            System.out.println();
        }
    }
}
