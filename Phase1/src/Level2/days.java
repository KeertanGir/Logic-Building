package Level2;

import java.util.Scanner;

public class days {
//    Take a day number (1–7) and print the corresponding day name.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Day No : ");
        int dayn = sc.nextShort();

        if(dayn == 1){
            System.out.println("Monday");
        } else if (dayn == 2) {
            System.out.println("Tuesday");
        } else if (dayn == 3) {
            System.out.println("Wednesday");
        } else if (dayn == 4) {
            System.out.println("Thursday");
        } else if (dayn == 5) {
            System.out.println("Friday");
        } else if (dayn == 6) {
            System.out.println("Saturday");
        } else if (dayn == 7) {
            System.out.println("Sunday");
        }else {
            System.out.println("invalid day!! try correct");
        }
    }
}
