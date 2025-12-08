import java.util.Scanner;

public class QuestionnaireSimple {
    // Constante pour l'âge minimum
    private static final int AGE_MINIMUM = 18;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables de différents types
        String nom;          // Type référence
        int age;             // Type primitif numérique
        double taille;       // Type primitif décimal
        boolean estEtudiant; // Type primitif booléen
        char premiereLettre; // Type primitif caractère

        System.out.println("=== Questionnaire Simple ===");

        // Question 1 : Nom (String)
        System.out.print("Quel est votre nom ? ");
        nom = scanner.nextLine();

        // Question 2 : Âge (int)
        System.out.print("Quel est votre âge ? ");
        age = scanner.nextInt();

        // Utilisation de la constante pour vérification
        if (age < AGE_MINIMUM) {
            System.out.println("Attention : " + AGE_MINIMUM + " ans est l'âge minimum requis !");
        }

        // Question 3 : Taille (double)
        System.out.print("Quelle est votre taille en mètres ? ");
        taille = scanner.nextDouble();

        // Question 4 : Statut étudiant (boolean)
        System.out.print("Êtes-vous étudiant ? (true/false) ");
        estEtudiant = scanner.nextBoolean();

        // Question 5 : Première lettre du prénom (char)
        System.out.print("Quelle est la première lettre de votre prénom ? ");
        premiereLettre = scanner.next().charAt(0);

        System.out.println("\n=== RÉSUMÉ ===");
        System.out.println("Bonjour " + nom + " !");
        System.out.println("Vous avez " + age + " ans.");

        // Conversion et affichage de la taille en cm
        int tailleCm = (int)(taille * 100); // Conversion en int
        System.out.println("Votre taille : " + taille + "m (" + tailleCm + " cm)");

        System.out.println("Statut étudiant : " + (estEtudiant ? "Oui" : "Non"));
        System.out.println("Première lettre du prénom : " + premiereLettre);

        // Quelques opérations avec les variables
        System.out.println("\n=== INFORMATIONS COMPLÉMENTAIRES ===");
        int anneeNaissanceApprox = 2024 - age;
        System.out.println("Vous êtes né vers l'année : " + anneeNaissanceApprox);

        double taillePieds = taille * 3.28084;
        System.out.println("Votre taille en pieds : " + String.format("%.2f", taillePieds));

        // Test avec la constante
        if (age >= AGE_MINIMUM) {
            System.out.println("Vous avez l'âge requis (" + AGE_MINIMUM + " ans minimum)");
        } else {
            System.out.println("Vous n'avez pas encore l'âge requis");
        }

        scanner.close();
        System.out.println("\nMerci pour vos réponses !");
    }
}