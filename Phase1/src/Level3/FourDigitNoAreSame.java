package Level3;

import java.util.Scanner;

public class FourDigitNoAreSame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 4 digit No!");
        int digit = sc.nextInt();

        int first_digit = digit / 1000;   // 4567/1000 = 4
        int second_digit = digit / 100 % 10;  // 4567/100 = 45 % 10 = 5
        int third_digit = digit / 10 % 10; // 4567 / 10 = 456 % 10 = 6
        int last_digit = digit % 10; // 4567 % 10 = 7

        System.out.println(first_digit);
        System.out.println(second_digit);
        System.out.println(third_digit);
        System.out.println(last_digit);


        if(first_digit == last_digit){
            System.out.println("Yes! First Digit and last digit are Same!");
        }else if(first_digit > last_digit){
            System.out.println("First Digit is Greater than last digit");
        } else if (last_digit > first_digit) {
            System.out.println("Last Digit is Greater Than First Digit");
        } else{
            System.out.println("No! First Digit and last digit are not Same!");
        }

    }
}
