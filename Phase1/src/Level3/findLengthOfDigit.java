package Level3;

import java.util.Scanner;

public class findLengthOfDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any digit ! ");
        int digit = sc.nextInt();

        if(Math.abs(digit) >= 0 & Math.abs((digit) ) <= 9){
            System.out.println("Single Digit!");
        }else if(Math.abs(digit) / 10 > 0 && Math.abs(digit) / 10 <= 9){
            System.out.println("Double-digit Number!");
        } else {
            System.out.println("Multi Digit Number!");
        }


    }
}
