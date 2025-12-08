import java.util.Scanner;

public class QuestionnaireSimple {
    private static final int AGE_MINIMUM = 18;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nom;          // Type référence
        int age;             // Type primitifs v
        double taille;
        boolean estEtudiant;
        char premiereLettre;

        System.out.println("=== Questionnaire Simple ===");

        System.out.print("Quel est votre nom ? ");
        nom = scanner.nextLine();

        System.out.print("Quel est votre âge ? ");
        age = scanner.nextInt();

        if (age < AGE_MINIMUM) {
            System.out.println("Attention : " + AGE_MINIMUM + " ans est l'âge minimum requis !");
        }

        System.out.print("Quelle est votre taille en mètres ? ");
        taille = scanner.nextDouble();

        System.out.print("Êtes-vous étudiant ? (true/false) ");
        estEtudiant = scanner.nextBoolean();

        System.out.print("Quelle est la première lettre de votre prénom ? ");
        premiereLettre = scanner.next().charAt(0);

        System.out.println("\n=== RÉSUMÉ ===");
        System.out.println("Bonjour " + nom + " !");
        System.out.println("Vous avez " + age + " ans.");

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

        if (age >= AGE_MINIMUM) {
            System.out.println("Vous avez l'âge requis (" + AGE_MINIMUM + " ans minimum)");
        } else {
            System.out.println("Vous n'avez pas encore l'âge requis");
        }

        scanner.close();
        System.out.println("\nMerci pour vos réponses !");
    }
}