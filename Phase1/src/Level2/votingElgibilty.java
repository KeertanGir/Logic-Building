package Level2;

import java.util.Scanner;

public class votingElgibilty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();

        if(age < 18){
            System.out.println("You are no eligible for Voting !");
        }else{
            System.out.println("You are Eligible For Voting !");
        }

    }
}
