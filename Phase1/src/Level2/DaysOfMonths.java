package Level2;

import java.util.Scanner;

public class DaysOfMonths {
//    Take a month number (1–12) and print the number of days in that month (ignore leap
//    years).
    public static void main(String[] args) {



        Scanner sc = new
                Scanner(System.in);

        System.out.print("Enter A month no : ");
        int month = sc.nextInt();
        if(month%2!=0 && month < 8){
            System.out.println("31 Days");
        } else if (month%2==0 && month > 8) {
            System.out.println("31 Days");
        } else if(month == 2){
            System.out.println("28 Days");
        } else if (month > 12){;
            System.out.println("Invalid Month! try again");
        } else {
            System.out.println("30 days");
        }
    }
}
