import java.util.ArrayList;
import java.util.Scanner;

public class TP_Bibliotheque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livre> bibliotheque = new ArrayList<>();
        int choix;

        do {
            // Affichage du menu
            System.out.println("\n=== GESTION DE LA BIBLIOTHÈQUE ===");
            System.out.println("1. Ajouter un nouveau livre");
            System.out.println("2. Afficher tous les livres");
            System.out.println("3. Rechercher un livre par titre");
            System.out.println("4. Calculer le prix moyen des livres");
            System.out.println("5. Modifier un livre existant");
            System.out.println("6. Supprimer un livre");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            // Validation de la saisie du choix
            while (!scanner.hasNextInt()) {
                System.out.println("Erreur : veuillez entrer un nombre !");
                scanner.nextLine();
                System.out.print("Votre choix : ");
            }
            choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la ligne restante

            switch (choix) {
                case 1:
                    // Ajouter un livre
                    Livre nouveauLivre = new Livre(scanner);
                    bibliotheque.add(nouveauLivre);
                    System.out.println("Livre ajouté avec succès !");
                    break;

                case 2:
                    // Afficher tous les livres
                    System.out.println("\n=== LISTE DES LIVRES ===");
                    if (bibliotheque.isEmpty()) {
                        System.out.println("La bibliothèque est vide.");
                    } else {
                        for (int i = 0; i < bibliotheque.size(); i++) {
                            System.out.println((i + 1) + ". " + bibliotheque.get(i));
                        }
                    }
                    break;

                case 3:
                    // Rechercher un livre par titre
                    System.out.print("\nEntrez le titre à rechercher : ");
                    String recherche = scanner.nextLine().toLowerCase();

                    boolean trouve = false;
                    System.out.println("\n=== RÉSULTATS DE LA RECHERCHE ===");
                    for (Livre livre : bibliotheque) {
                        if (livre.getTitre().toLowerCase().contains(recherche)) {
                            System.out.println("• " + livre);
                            trouve = true;
                        }
                    }
                    if (!trouve) {
                        System.out.println("Aucun livre trouvé avec ce titre.");
                    }
                    break;

                case 4:
                    // Calculer le prix moyen
                    if (bibliotheque.isEmpty()) {
                        System.out.println("La bibliothèque est vide.");
                    } else {
                        double somme = 0;
                        for (Livre livre : bibliotheque) {
                            somme += livre.getPrix();
                        }
                        double moyenne = somme / bibliotheque.size();
                        System.out.printf("Le prix moyen des livres est de : %.2f€\n", moyenne);
                    }
                    break;

                case 5:
                    // Modifier un livre
                    if (bibliotheque.isEmpty()) {
                        System.out.println("La bibliothèque est vide.");
                        break;
                    }

                    System.out.println("\n=== MODIFICATION D'UN LIVRE ===");
                    for (int i = 0; i < bibliotheque.size(); i++) {
                        System.out.println((i + 1) + ". " + bibliotheque.get(i));
                    }

                    System.out.print("Numéro du livre à modifier : ");
                    int indexModif = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (indexModif >= 0 && indexModif < bibliotheque.size()) {
                        Livre livreAModifier = bibliotheque.get(indexModif);

                        System.out.println("\nQue voulez-vous modifier ?");
                        System.out.println("1. Titre");
                        System.out.println("2. Auteur");
                        System.out.println("3. Prix");
                        System.out.println("4. Tout");
                        System.out.print("Votre choix : ");

                        int choixModif = scanner.nextInt();
                        scanner.nextLine();

                        switch (choixModif) {
                            case 1:
                                System.out.print("Nouveau titre : ");
                                livreAModifier.setTitre(scanner.nextLine());
                                break;
                            case 2:
                                System.out.print("Nouvel auteur : ");
                                livreAModifier.setAuteur(scanner.nextLine());
                                break;
                            case 3:
                                System.out.print("Nouveau prix : ");
                                livreAModifier.setPrix(scanner.nextDouble());
                                scanner.nextLine();
                                break;
                            case 4:
                                System.out.print("Nouveau titre : ");
                                livreAModifier.setTitre(scanner.nextLine());
                                System.out.print("Nouvel auteur : ");
                                livreAModifier.setAuteur(scanner.nextLine());
                                System.out.print("Nouveau prix : ");
                                livreAModifier.setPrix(scanner.nextDouble());
                                scanner.nextLine();
                                break;
                            default:
                                System.out.println("Choix invalide.");
                        }
                        System.out.println("Livre modifié avec succès !");
                    } else {
                        System.out.println("Numéro invalide !");
                    }
                    break;

                case 6:
                    // Supprimer un livre
                    if (bibliotheque.isEmpty()) {
                        System.out.println("La bibliothèque est vide.");
                        break;
                    }

                    System.out.println("\n=== SUPPRESSION D'UN LIVRE ===");
                    for (int i = 0; i < bibliotheque.size(); i++) {
                        System.out.println((i + 1) + ". " + bibliotheque.get(i));
                    }

                    System.out.print("Numéro du livre à supprimer : ");
                    int indexSuppr = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (indexSuppr >= 0 && indexSuppr < bibliotheque.size()) {
                        Livre livreSupprime = bibliotheque.remove(indexSuppr);
                        System.out.println("Livre supprimé : " + livreSupprime.getTitre());
                    } else {
                        System.out.println("Numéro invalide !");
                    }
                    break;

                case 0:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide ! Veuillez réessayer.");
            }

        } while (choix != 0);

        scanner.close();
    }
}