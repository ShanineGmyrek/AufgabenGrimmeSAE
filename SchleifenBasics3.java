public class SchleifenBasics3 {
    public static void main(String[] args) {
        int zahl = 100;
        for(int i= 1; i <= zahl; i++){
            if(i == zahl){
                System.out.print(i);
                break;
            }
            System.out.print(i + ", ");

        }
    }
}
