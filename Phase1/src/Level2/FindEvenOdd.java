package Level2;

import java.util.Scanner;

public class FindEvenOdd {
//    Take two numbers and determine whether both are even, both are odd, or one is
//    even and one is odd.
    public static void main(String[] args) {

        Scanner sc = new
                Scanner(System.in);

        System.out.print("Enter A number : ");
        int numA = sc.nextInt();
        System.out.print("Enter B Number : ");
        int numB = sc.nextInt();

        if(numB%2==0 && numA%2==0){
            System.out.println("Both are Even!");
        } else if (numB%2!=0 && numA%2!=0) {
            System.out.println("Both are Odd!");
        }else{
            System.out.println("One is Even and One is Odd");
        }

    }
}
