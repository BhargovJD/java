import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        int number, counter = 0;
        System.out.println("Enter your number...");

        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        scan.close();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }

        if (counter == 2) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }

    }
}
