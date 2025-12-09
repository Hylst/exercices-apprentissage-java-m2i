import java.util.Scanner;
// Calcul de la somme et la moyenne des valeurs d'un tableau défini par l'utilisateur
public class main {

    public static void somme_moy_val_user(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Calcul de la somme et la moyenne des valeurs d'un tableau défini que vous allez définir");
        System.out.println("Combien de valeurs à entrer ? ");
        int nombreValeurs = scanner.nextInt();


        // taille positive ?
        if (nombreValeurs <= 0) {
            System.out.println("Erreur : la taille doit être un nombre positif !");
            scanner.close();
            return;
        }

        int[] tableau = new int[nombreValeurs];

        System.out.println("\nVous allez maintenant saisir les " + nombreValeurs + " valeurs :");

        // Remplissage user
        for (int i = 0; i < nombreValeurs; i++) {
            System.out.print("Élément n°" + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

        // Somme
        int somme = 0;
        for (int i = 0; i < nombreValeurs; i++) {
            somme += tableau[i];
        }

        // Moyenne
        double moyenne = (double) somme / nombreValeurs;

        // Résultats
        System.out.println("\n=== RÉSULTATS ===");
        System.out.println("Tableau saisi : ");

        // Contenu du tableau
        System.out.print("[");
        for (int i = 0; i < nombreValeurs; i++) {
            System.out.print(tableau[i]);
            if (i < nombreValeurs - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("Somme des valeurs : " + somme);
        System.out.println("Moyenne des valeurs : " + moyenne);
        System.out.printf("Moyenne (formatée) : %.2f\n", moyenne);

        scanner.close();
    }
}
