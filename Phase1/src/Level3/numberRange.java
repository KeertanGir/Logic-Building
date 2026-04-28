package Level3;

import java.util.Scanner;

public class numberRange {
//    Check if a number lies within the range [100, 999].

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num = sc.nextInt();


        if(num / 100 > 0  && num / 100 <=9){
            System.out.println("Number Lies b/w  [100, 999] ");
        } else {
            System.out.println("Number doesn't Lies b/w  [100, 999] ");
        }

        if(num >= 100 && num <= 999 ){
            System.out.println("Number Lies b/w  [100, 999] ");
        }else {
            System.out.println("Number doesn't Lies b/w  [100, 999] ");
        }


    }


}
