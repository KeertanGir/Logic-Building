package Level1;

import java.util.Scanner;

public class largetinthree {
//    Take three numbers and print the largest
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Any Number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter Any Number : ");
        int num3 = sc.nextInt();

        int grater;
        if(num1 < num2){
            grater = num2;
        }else{
            grater = num1;
        }
        int max =  Math.max(num3 , grater);

//        in one line
        int max2 = Math.max(num1, Math.max(num2, num3));

        System.out.println(max);
        System.out.println(max2);

    }
}
