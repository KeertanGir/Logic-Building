package Level2;

import java.util.Scanner;

public class Times {
//    Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “Good
//    Evening”, or “Good Night”
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour of Day (0-23) : ");
        int hr = sc.nextInt();

        if( (hr >= 20 && hr <= 23) || (hr >= 0  && hr <=3) ){
            System.out.println("Good Night!");
        } else if (hr > 3 && hr< 12) {
            System.out.println("Good Morning");
        } else if (hr >= 12 && hr < 16) {
            System.out.println("Good Afternoon");
        } else if (hr >= 16 && hr < 20) {
            System.out.println("Good Evening");
        }

    }
}
