import java.util.Scanner;

public class EinfacheEingabe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie ihren Vornamen ein: ");
        String Vorname = scanner.next();
        System.out.println("Geben sie ihren Nachname ein: ");
        String Nachname = scanner.next();
        System.out.println("Hallo " + Vorname + " " + Nachname);
        System.out.println("Geben sie ihre Email ein: ");
        String Email = scanner.next();
        System.out.println("Geben sie ihr Geburtsjahr");
        String Geburtsjahr = scanner.next();
        System.out.println(Vorname + " " + Nachname + " " + Email + " " + Geburtsjahr);
    }
}
