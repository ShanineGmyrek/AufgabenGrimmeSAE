import java.util.InputMismatchException;
import java.util.Scanner;

public class NewApplication {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){


        System.out.println("Enter the height of the Tree: ");

        int height = getNumber();

        for(int i = 0; i < height; i++){
            for(int s = 0; s < height - i+1;s++){
                System.out.print(" ");
            }
            for (int l = 0;l<2*i+1;l++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int s = 0; s < height - 1+1;s++){
            System.out.print(" ");
        }
        System.out.print("***");


    }

    static int getNumber() {
        try {
             return scanner.nextInt();
        } catch(Exception e) {
            System.out.println("Not a number, try again: ");
            scanner.nextLine();
            return getNumber();
        }
    }
}
