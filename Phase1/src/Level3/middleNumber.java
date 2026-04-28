package Level3;

import java.util.Scanner;

public class middleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 3 digit No!");
        int digit = sc.nextInt();

        int digit1 = digit / 100;
        int middle = digit / 10 % 10;
        int digit3 = digit % 10;

        if(middle > digit1 && middle > digit3){
            System.out.println(middle +" is Greater than "+ digit1 + " and " + digit3);
        }else if(middle < digit1 && middle < digit3){
            System.out.println(middle +" is Lesser than "+ digit1 + " and " + digit3);
        } else if (middle < digit1 && middle > digit3 ) {
            System.out.println(middle +" is Lesser than "+ digit1);
            System.out.println(middle +" is Greater than "+ digit3);
        } else if (middle > digit1 && middle < digit3) {
            System.out.println(middle +" is Greater than "+ digit1);
            System.out.println(middle +" is lesser than "+ digit3);
        }  else if (digit1 == middle && digit3 != middle) {
            System.out.println("There are two --> "+ middle );
            System.out.println("And one -> "+ digit3 );
        } else if (digit1 != middle && digit3 == middle) {
            System.out.println("There are two --> "+ middle);
            System.out.println("And one -> "+ digit1 );
        } else{
            System.out.println(middle +" is nither Greater and lesser than  "+ digit1 + " and " + digit3);
            System.out.println("All Digits are same --> " + middle);
        }



    }
}
