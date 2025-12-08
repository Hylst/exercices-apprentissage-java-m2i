import java.util.Scanner;
// Devine nombre
public class devineNombre {
    private static final int NOMBRE_MYSTERE = 18;
    public static void main(String[] args) {

        int nombreJoueur;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Devinne le nombre mystère : ");
            nombreJoueur = scanner.nextInt();
            if(nombreJoueur < NOMBRE_MYSTERE)
            {
                System.out.println("Trop petit");
            } else if (nombreJoueur > NOMBRE_MYSTERE) {
                System.out.println("Trop grand");
            }
        } while (nombreJoueur != NOMBRE_MYSTERE);
        System.out.println("Bravo, tu as trouvé le nombre mystère.");

        scanner.close();
    }
}
