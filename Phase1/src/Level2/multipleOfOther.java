package Level2;

import java.util.Scanner;

public class multipleOfOther {
//    Check if one of two given numbers is a multiple of the other

    public static void main(String[] args) {
        Scanner sc = new
                Scanner(System.in);

        System.out.print("Enter A number : ");
        int numA = sc.nextInt();
        System.out.print("Enter B Number : ");
        int numB = sc.nextInt();

        if(numA%numB == 0 || numB%numA == 0 ){
            System.out.println("it is Multiple Of Other !");
        }else{
            System.out.println("No Its Not !");
        }

    }

}
