import java.util.Scanner;

public class Summenrechner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the first Number");
        int number1 = scanner.nextInt();
        System.out.println("Type in the second Number");
        int number2 = scanner.nextInt();

        int Rechnung = number1 + number2;

        System.out.println("Die Summe aus " + number1 + " und " + number2 + " beträgt: " + Rechnung);

    }
}
