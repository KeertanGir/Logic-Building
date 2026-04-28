package Level3;

import java.util.Scanner;

public class DistinfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 3 digit No!");
        int digit = sc.nextInt();

        int digit1 = digit/100;
        int digit2 = digit/10 % 10;
        int digit3 = digit%10;

//        System.out.println(digit1);
//        System.out.println(digit2);
//        System.out.println(digit3);

        if(digit1 != digit2 && digit2 != digit3){
            System.out.println("All Numbers are Distinct!");
        }else{
            System.out.println("Numbers Have Any Same Digit");
        }




    }
}
