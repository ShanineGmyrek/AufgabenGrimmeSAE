import java.util.*;

public class Primfaktoren {
       public static void main(String[] args) {

       boolean first = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben sie eine zahl ein: ");
        int primzahl = scanner.nextInt();
        scanner.close();
        int eigentlichePrimzahl = primzahl;

        for (int i = 2; i <= primzahl; i++ ){
            if(primzahl % i == 0){
                if(primzahl == i && first) {
                    System.out.println("Diese Zahl ist eine Primzahl");
                    break;
                }
                first = false;
                System.out.println(i);
                primzahl = primzahl / i;
                i = 1;
            }
            if(primzahl == 1) {
                break;
            }
        }


    }
}
