import java.util.Scanner;

public class CalculMoyenne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calcul de moyenne ===");

        // Demander les 3 notes
        System.out.print("Entrez la première note : ");
        double note1 = scanner.nextDouble();

        System.out.print("Entrez la deuxième note : ");
        double note2 = scanner.nextDouble();

        System.out.print("Entrez la troisième note : ");
        double note3 = scanner.nextDouble();

        // Calculer la moyenne
        double moyenne = (note1 + note2 + note3) / 3;

        // Afficher le résultat
        System.out.println("\n=== Résultat ===");
        System.out.println("Note 1 : " + note1);
        System.out.println("Note 2 : " + note2);
        System.out.println("Note 3 : " + note3);
        System.out.println("Moyenne : " + String.format("%.2f", moyenne));

        scanner.close();
    }
}