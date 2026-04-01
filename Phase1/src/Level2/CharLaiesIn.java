package Level2;

import java.util.Scanner;

public class CharLaiesIn {
    //    Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Character : ");
        char ch = sc.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'm') {
            System.out.println("Its lies b/w a to m");
        } else {
            System.out.println("Its lies b/w n to z");
        }

    }
}
