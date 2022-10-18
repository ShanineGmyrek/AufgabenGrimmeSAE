import java.util.Scanner;

public class Mwst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie einen geldbetrag ein: ");
        int geldbetrag = scanner.nextInt();

        double Mehrwertsteuer = geldbetrag * 0.19;
        double neueGeldbetrag = geldbetrag + (geldbetrag * 0.19);

        System.out.println("Geldbetrag: " + geldbetrag + "\n+ Mwst: " + Mehrwertsteuer + " \n--------------- \nGesamtbetrag: " + neueGeldbetrag );


    }
}
