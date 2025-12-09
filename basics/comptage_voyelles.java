import java.util.Scanner;
// Comptage de voyelles
public class main {

    public static void comptage_voyelles(String[] args) { // //

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une phrase : ");
        String phrase = scanner.nextLine();

        int compteur = 0;
        String voyelles = "aeiouyAEIOUY";

        for (int i = 0; i < phrase.length(); i++) {
            char caractere = phrase.charAt(i);
            if (voyelles.indexOf(caractere) != -1) {
                compteur++;
            }
        }

        System.out.println("Nombre de voyelles : " + compteur);
        scanner.close();
    }
}
