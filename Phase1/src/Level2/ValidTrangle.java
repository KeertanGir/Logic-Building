package Level2;

import java.util.Scanner;

public class ValidTrangle {
//    ke three sides and check if they form a valid triangle.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Side A : ");
        int SideA = sc.nextInt();
        System.out.print("Enter Length of Side B : ");
        int SideB = sc.nextInt();
        System.out.print("Enter Length of Side C : ");
        int SideC = sc.nextInt();

        if( SideA+SideB > SideC &&  SideB + SideC > SideA && SideA + SideC > SideB ){
            System.out.println("Yes! its A valid Triangle! ");
        }else{
            System.out.println("No! its not A Valid Triangle !");
        }

    }
}
