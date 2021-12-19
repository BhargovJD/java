import java.util.*;
public class hello {
    public static void main(String[] args) {
        System.out.println("Hello");

        // Variables and Data types
        String uName ="Bhargov";
        char fAlphabet = 'A';
        System.out.println(fAlphabet);

        // Casting and Converting
        System.out.println(3.13);
        System.out.println((int)3.13);

        System.out.println(3.24);
        System.out.println((int)3.24);

        int intFromString = Integer.parseInt("50");
        System.out.println(intFromString+21);

        // String
        String myString = "ABCDEFG";
        System.out.println(myString);
        System.out.println(myString.length());
        System.out.println(myString.charAt(1));
        System.out.println(myString.indexOf("A"));
        System.out.println(myString.indexOf("CDE"));
        System.out.println(myString.substring(3));
        System.out.println(myString.substring(3,6));

        // Numbers
        System.out.println(2+2);
        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(144));
        System.out.println(Math.round(2.3));

        // User Input
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your number...");
        String userName = userInput.nextLine();
        System.out.println("Your name is "+userName);

        // Arrays
        int [] myNumbers = {1,2,3,4,5,6,7,8,9};
        System.out.println(myNumbers.length);
        System.out.println(myNumbers[0]);
        myNumbers[0]=99;
        System.out.println(myNumbers[0]);

        // 2d Array
        int [][] numberGrid = { {1, 2}, {3, 4} };
        System.out.println(numberGrid[1][0]);

        // ArrayList

        ArrayList<String> friends = new ArrayList<>();
        friends.add("Oscar");
        friends.add("Award");
        friends.add("Winner");

        System.out.println(friends.get(0));
        System.out.println(friends.get(1));
        System.out.println(friends.get(2));
        System.out.println(friends.contains("Oscar"));







    }
}
