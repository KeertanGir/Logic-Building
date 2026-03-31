package Level1;

import java.util.Scanner;

public class DivisibleOf3and5 {
    public static void main(String[] args) {
//        Check if a number is divisible by both 3 and 5
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num = sc.nextInt();

        if(num%5==0 && num%3==0){
            System.out.println("Yes it's divisible of both 3 and 5");
        }else{
            System.out.println("No it's not-divisible of both 3 anf 5");
        }
    }
}
