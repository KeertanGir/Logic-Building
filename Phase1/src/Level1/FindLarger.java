package Level1;

import java.util.Scanner;

public class FindLarger {
    //    Take two numbers and print the larger one
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Any Number : ");
        int num2 = sc.nextInt();

//                  condition ? if true : else
        int grater = num1<num2? num2 : num1;

        System.out.println("The Grater number is : "+ grater);

    }
}
