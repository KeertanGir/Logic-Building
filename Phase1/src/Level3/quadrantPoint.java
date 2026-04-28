package Level3;

import java.util.Scanner;

public class quadrantPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of X : ");
        int x = sc.nextInt();
        System.out.print("Enter Value of Y : ");
        int y = sc.nextInt();

        if(x > 0 && y > 0){
            System.out.println("Quadrant |");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrant ||");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrant |||");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrant |V");
        }else{
            System.out.println("Its on Axis!");
        }

    }
}
