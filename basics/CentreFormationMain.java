import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CentreFormationMain {
    // Déclaration des listes comme variables de classe
    private static List<Enseignant> tousLesEnseignants;
    private static List<Etudiant> etudiants;
    private static List<Filiere> toutesFilieres;
    private static List<Specialite> toutesSpecialites;

    public static void main(String[] args) {
        System.out.println("=== CENTRE DE FORMATION AFPA ===\n");

        // Création des spécialités
        Specialite javaJee = new Specialite("JAVA/JEE");
        Specialite htmlCss = new Specialite("HTML/CSS");
        Specialite gestionProjet = new Specialite("Gestion de projet");
        Specialite js = new Specialite("JS");
        Specialite php = new Specialite("PHP");

        toutesSpecialites = Arrays.asList(javaJee, htmlCss, gestionProjet, js, php);

        // Création de TOUS les enseignants
        Enseignant dupont = new Enseignant("M. Dupont", javaJee);
        Enseignant martin = new Enseignant("Mme. Martin", javaJee);
        Enseignant bernard = new Enseignant("M. Bernard", php);
        Enseignant dubois = new Enseignant("Mme. Dubois", js);
        Enseignant burns = new Enseignant("Charles Montgomery Burns", javaJee);
        Enseignant kas = new Enseignant("Zack Kas", gestionProjet);
        Enseignant aucun = new Enseignant("Aucun formateur", null);

        tousLesEnseignants = Arrays.asList(dupont, martin, bernard, dubois, burns, kas, aucun);

        // Création des filières avec les enseignants existants
        Filiere cda = new Filiere("cda", "CDA", burns);
        Filiere marketing = new Filiere("marketing", "Marketing", kas);
        Filiere assistanceVie = new Filiere("assistance_vie", "Assistance de vie", aucun);

        toutesFilieres = Arrays.asList(cda, marketing, assistanceVie);

        // 3. Affichage des enseignants par spécialité
        System.out.println("=== LISTE DES ENSEIGNANTS PAR SPÉCIALITÉ ===\n");

        for (Specialite specialite : toutesSpecialites) {
            System.out.println("Spécialité : " + specialite.getNom());
            System.out.println("-----------------------------------");

            boolean trouve = false;

            for (Enseignant enseignant : tousLesEnseignants) {
                if (enseignant.getSpecialite() != null &&
                        enseignant.getSpecialite().getNom().equals(specialite.getNom())) {
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
        etudiants = Arrays.asList(
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
                System.out.println("Pas d'inscrit");
            }
            System.out.println();
        }

        // Appel de la fonction de recherche
        chercheParFormateurOuFiliere();
    }

    public static void chercheParFormateurOuFiliere() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== RECHERCHE ===");
        System.out.println("Quel type de recherche souhaites-tu ? ");
        System.out.println("1 : Par nom de formateur");
        System.out.println("2 : Par nom de filière");
        System.out.print("Quel est ton choix (1 ou 2) ? ");

        int choix = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le retour à la ligne

        if (choix == 1) {
            // Recherche par nom de formateur
            System.out.print("Quel est le nom du formateur que tu recherches ? ");
            String nomFormateur = scanner.nextLine();

            boolean trouve = false;

            // Recherche dans tous les enseignants
            for (Enseignant enseignant : tousLesEnseignants) {
                if (enseignant.getNom().equalsIgnoreCase(nomFormateur)) {
                    System.out.println("\n=== RÉSULTAT RECHERCHE ===");
                    System.out.println("Formateur trouvé : " + enseignant.getNom());

                    // Afficher la spécialité
                    if (enseignant.getSpecialite() != null) {
                        System.out.println("Spécialité : " + enseignant.getSpecialite().getNom());
                    } else {
                        System.out.println("Spécialité : Aucune");
                    }

                    // Vérifier s'il est responsable d'une filière
                    boolean estResponsable = false;
                    for (Filiere filiere : toutesFilieres) {
                        if (filiere.getFormateur().getNom().equalsIgnoreCase(nomFormateur)) {
                            estResponsable = true;
                            System.out.println("Filière responsable : " + filiere.getLibelle());

                            // Afficher les étudiants de cette filière
                            int compteurEtudiants = 0;
                            System.out.println("Étudiants inscrits :");

                            for (Etudiant etudiant : etudiants) {
                                if (etudiant.getFiliere().getLibelle().equals(filiere.getLibelle())) {
                                    compteurEtudiants++;
                                    System.out.println("  - " + etudiant.getPrenom() + " " + etudiant.getNom());
                                }
                            }

                            if (compteurEtudiants == 0) {
                                System.out.println("  Aucun étudiant inscrit");
                            } else {
                                System.out.println("Total : " + compteurEtudiants + " étudiant(s)");
                            }
                        }
                    }

                    if (!estResponsable) {
                        System.out.println("Cet enseignant n'est responsable d'aucune filière.");
                    }

                    trouve = true;
                    break; // On sort après avoir trouvé
                }
            }

            if (!trouve) {
                System.out.println("Aucun enseignant trouvé avec le nom : " + nomFormateur);
            }

        } else if (choix == 2) {
            // Recherche par nom de filière
            System.out.print("Quel est le nom de la filière que tu recherches ? ");
            String nomFiliere = scanner.nextLine();

            boolean trouve = false;

            for (Filiere filiere : toutesFilieres) {
                if (filiere.getLibelle().equalsIgnoreCase(nomFiliere)) {
                    System.out.println("\n=== RÉSULTAT RECHERCHE ===");
                    System.out.println("Filière trouvée : " + filiere.getLibelle());
                    System.out.println("Formateur : " + filiere.getFormateur().getNom());

                    // Afficher la spécialité du formateur
                    if (filiere.getFormateur().getSpecialite() != null) {
                        System.out.println("Spécialité du formateur : " + filiere.getFormateur().getSpecialite().getNom());
                    }

                    // Afficher les étudiants
                    int compteur = 1;
                    boolean aDesEtudiants = false;
                    System.out.println("Étudiants inscrits :");

                    for (Etudiant etudiant : etudiants) {
                        if (etudiant.getFiliere().getLibelle().equals(filiere.getLibelle())) {
                            System.out.println(compteur + ". " + etudiant.getPrenom() + " " + etudiant.getNom());
                            compteur++;
                            aDesEtudiants = true;
                        }
                    }

                    if (!aDesEtudiants) {
                        System.out.println("Pas d'étudiant inscrit");
                    } else {
                        System.out.println("Total : " + (compteur-1) + " étudiant(s)");
                    }

                    trouve = true;
                    break;
                }
            }

            if (!trouve) {
                System.out.println("Aucune filière trouvée avec le nom : " + nomFiliere);
            }

        } else {
            System.out.println("Ce n'était pas le choix attendu (1 ou 2)");
        }

        scanner.close();
    }
}