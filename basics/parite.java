import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int nombre;
        String parite;
        
        System.out.print("Entre un nombre ? ");
        nombre = (int)scanner.nextInt();
        System.out.print("Ton nombre " + nombre + " est ");
        if(nombre%2 == 0) {
            parite = "pair";
        } else {
            parite = "impair";
        }
            System.out.println(parite);
    }
}