package Level1;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
//        Check if a number is even or odd
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }


    }
}
