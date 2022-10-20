import java.util.Scanner;

public class ForIntervall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie die erste kleine Zahl ein: ");
        int ersteZahl = scanner.nextInt();
        System.out.println("Geben sie die zweite große Zahl ein: ");
        int zweiteZahl = scanner.nextInt();
        System.out.println("Geben sie die Schritte aus ein: ");
        int schritte = scanner.nextInt();

        for(int i = ersteZahl; i <= zweiteZahl; i = i + schritte){
            System.out.println(i);
        }

    }
}
