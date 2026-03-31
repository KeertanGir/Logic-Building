package Level1;

import java.util.Scanner;

public class DivisibleOfFive {
    public static void main(String[] args) {
//        Check if a number is divisible by 5
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num = sc.nextInt();

        if(num%5==0){
            System.out.println("Yes This number is Divisible Of 5");
        }else{
            System.out.println("No, This number is Not-Divisible of 5");
        }

    }
}
