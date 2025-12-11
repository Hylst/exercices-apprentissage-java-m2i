import java.util.Scanner;

public class Livre {
    // Attributs privés
    private String titre;
    private String auteur;
    private double prix;

    // Constructeur intelligent avec Scanner
    public Livre(Scanner scanner) {
        System.out.println("\n--- Création d'un nouveau livre ---");

        // Saisie du titre
        System.out.print("Entrez le titre du livre : ");
        this.titre = scanner.nextLine();

        // Saisie de l'auteur
        System.out.print("Entrez l'auteur du livre : ");
        this.auteur = scanner.nextLine();

        // Saisie du prix avec validation
        boolean prixValide = false;
        while (!prixValide) {
            System.out.print("Entrez le prix du livre (nombre positif) : ");
            if (scanner.hasNextDouble()) {
                double prixSaisi = scanner.nextDouble();
                if (prixSaisi >= 0) {
                    this.prix = prixSaisi;
                    prixValide = true;
                } else {
                    System.out.println("Erreur : Le prix doit être positif !");
                }
            } else {
                System.out.println("Erreur : Vous devez entrer un nombre !");
            }
            scanner.nextLine(); // Consommer la ligne restante
        }
    }

    // Constructeur avec paramètres (optionnel mais utile)
    public Livre(String titre, String auteur, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }

    // GETTERS (accesseurs)
    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public double getPrix() {
        return prix;
    }

    // SETTERS (mutateurs)
    public void setTitre(String titre) {
        if (titre != null && !titre.trim().isEmpty()) {
            this.titre = titre;
        } else {
            System.out.println("Erreur : Le titre ne peut pas être vide !");
        }
    }

    public void setAuteur(String auteur) {
        if (auteur != null && !auteur.trim().isEmpty()) {
            this.auteur = auteur;
        } else {
            System.out.println("Erreur : L'auteur ne peut pas être vide !");
        }
    }

    public void setPrix(double prix) {
        if (prix >= 0) {
            this.prix = prix;
        } else {
            System.out.println("Erreur : Le prix doit être positif !");
        }
    }

    // Méthode toString() pour l'affichage
    @Override
    public String toString() {
        return String.format("« %s » par %s - %.2f€", titre, auteur, prix);
    }

    // Méthode pour afficher les détails (optionnel)
    public void afficherDetails() {
        System.out.println(toString());
    }
}