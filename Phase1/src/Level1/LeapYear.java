package Level1;

import java.util.Scanner;

public class LeapYear {
//    Check if a given year is a leap year
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Year : ");
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("Yes Its a Leap-Year");
        }else{
            System.out.println("No Its not");
        }
    }
}
