package Level3;

import java.util.Scanner;

public class ThirdAngleOfATriangle {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Angle 1 of Triangle : ");
        int angle1 = sc.nextInt();
        System.out.print("Enter Angle 2 of Triangle : ");
        int angle2 = sc.nextInt();

        int angle3 = 180 - angle1 - angle2;

        System.out.println("The Third angle of triangle is "+ angle3 + " degree ");


    }
}
