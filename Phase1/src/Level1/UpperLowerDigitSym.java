package Level1;

import java.util.Scanner;

public class UpperLowerDigitSym {
//        Take a character and check whether it’s uppercase, lowercase, a digit, or a special
//         character.
    public static void main(String[] args) {

        String UpperCases = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String LowerCases = "abcdefghijklmnopqrstuvwxyz";
        String Numbers = "1234567890";
        String Symbols = "~`!@#$%^&*()_+|\\}]{[''\"/?.><,;:";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Character : ");
        char ch = sc.next().trim().charAt(0);

        if(UpperCases.contains(String.valueOf(ch))){
            System.out.println("It's A Upper Case !");
        }else if(LowerCases.contains(String.valueOf(ch))){
            System.out.println("It's A Lower Case !");
        }else if(Numbers.contains(String.valueOf(ch))){
            System.out.println("It's A Digit !");
        } else if (Symbols.contains(String.valueOf(ch))) {
            System.out.println("It's a Special Character");
        }else{
            System.out.println("Invalid Key");
        }


    }
}
