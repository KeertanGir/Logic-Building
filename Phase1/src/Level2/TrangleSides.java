package Level2;

import java.util.Scanner;

public class TrangleSides {
    //   If the sides form a valid triangle, determine whether it is equilateral, isosceles, or
//    scalene.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Side A : ");
        int SideA = sc.nextInt();
        System.out.print("Enter Length of Side B : ");
        int SideB = sc.nextInt();
        System.out.print("Enter Length of Side C : ");
        int SideC = sc.nextInt();

        if( SideA+SideB > SideC  &&  SideB+SideC > SideA  &&  SideA+SideC > SideB){
            System.out.println("Valid Triangle !");
            if(SideA == SideB && SideB == SideC && SideA == SideC){
                System.out.println("Its A Equilateral Triangle !");
            }else if(SideA == SideB || SideB == SideC || SideC == SideA){
                System.out.println("Its A Isosceles Triangle !");
            } else if (SideA != SideB && SideB != SideC && SideC != SideA) {
                System.out.println("Its A Scalene Triangle ! ");
            }
        }else{
            System.out.println("Invalid Triangle !");
        }

    }


}
