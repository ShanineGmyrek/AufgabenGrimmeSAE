import java.util.Scanner;

public class SchoenerName {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your name: ");
        String name = scanner.nextLine();

        int nameLength = name.length();

        System.out.print("+");
        for(int i = 0; i < nameLength; i++){
            System.out.print("-");
        }
        System.out.print("+");

        System.out.println(" ");
        System.out.print("|");
        System.out.print(name);
        System.out.println("|");

        System.out.print("+");
        for(int i = 0; i < nameLength; i++){
            System.out.print("-");
        }
        System.out.print("+");
    }
}
