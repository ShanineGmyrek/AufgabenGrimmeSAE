public class Zahlenrechner {
    public static void main(String[] args){
        /*
        - 1 + 7 - 14 + 92
        - 82 - 92,92 + 94,821 - 92
        - 4 * 3 / 6
        - (2-8) * (8+9)
        - 3,0 / 4,0
        - 8,0 / 4,0 + 8 * 11
        - 92 / 8,3 / 2
        - 82 % 2
        - 13 % 4 */

        int nummer1 = 3;
        int nummer2 = 4;
        int nummer3 = 92;
        int nummer4 = 2;
        int rechnung1 = 1 + 7 - 14 + nummer3;
        int rechnung2 = 82 - nummer3;
        int rechnung3 = nummer3 + 94;
        int rechnung4 = 821 - nummer3;
        int rechnung5 = nummer2 * nummer1 / 6;
        int rechnung6 = (nummer4-8) * (8+9);
        double rechnung7 = nummer1 /nummer2;
        double rechnung8 = 8.0 / nummer2 + 8 * 11;
        double rechnung9 = nummer3 / 8.3 / nummer4;
        double rechnung10 = 82 % nummer4;
        double rechnung11 = 13 % nummer2;

        System.out.println(rechnung1);
        System.out.println(rechnung2);
        System.out.println(rechnung3);
        System.out.println(rechnung4);
        System.out.println(rechnung5);
        System.out.println(rechnung6);
        System.out.println(rechnung7);
        System.out.println(rechnung8);
        System.out.println(rechnung9);
        System.out.println(rechnung10);
        System.out.println(rechnung11);


    }
}
