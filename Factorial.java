import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int number,counter=1;

        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        scan.close();

        for(int i=1; i<=number;i++){
              counter = counter*i;
        }

        System.out.println(counter);
    }
}
