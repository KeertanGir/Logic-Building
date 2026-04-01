package Level2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Grading {
    //   Take marks (0–100) and print the corresponding grade (A/B/C/D/F).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Marks (0–100) : ");
        int marks = sc.nextInt();

        if(marks >= 50){
            System.out.println("Pass!");
            if(marks >= 50 && marks <= 60){
                System.out.println("Grade D");
            } else if (marks > 60 && marks <= 70) {
                System.out.println("Grade C");
            } else if (marks > 70 && marks <= 80) {
                System.out.println("Grade B");
            }else if (marks > 90 && marks <= 100){
                System.out.println("Grade A");
            }
        }else{
            System.out.println("Fail!");
            System.out.println("Grade F");
        }


    }

}
