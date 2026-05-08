package Level3;

import java.util.Scanner;

public class NumberIsPerfectSequare {
    public static void main(String[] args) {
//        Check whether a number is a perfect square (without using the square root function).
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++){
            if(i * i > num){
                System.out.println("Number is Not Perfect Square!");
                return;
            }

            if(i*i == num ){
                System.out.println("Number is Perfect square!");

                return;
            }

        }


    }
}
