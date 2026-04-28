package Level3;

import java.util.Scanner;

public class MultipleOf7andEndon7 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any digit ! ");
        int digit = sc.nextInt();

        int last_digit = Math.abs(digit) % 10;

        System.out.println(last_digit);

        if ( Math.abs(digit) % 7 == 0 && last_digit == 7 ) {
            System.out.println(digit + " is Multiple of 7!");
            System.out.println("Last digit is : "+ last_digit);
        }else if(Math.abs(digit) % 7 == 0){
            System.out.println(digit + " is Multiple of 7!");
        } else if (last_digit == 7) {
            System.out.println("Last digit is : "+ last_digit);
        }


    }
}
