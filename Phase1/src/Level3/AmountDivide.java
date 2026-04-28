package Level3;

import java.util.Scanner;

public class AmountDivide {
    public static void main(String[] args) {

//        Check if an amount can be evenly divided into 2000, 500, and 100 currency notes
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Amount : ");
        int Amount = sc.nextInt();

        int two_thousand = Amount/2000;
        int rest_Amount = Amount % 2000;
        int five_hundred = rest_Amount / 500;
        int rest_Amount2 =  rest_Amount % 500;
        int one_hundred = rest_Amount2 / 100;


        if(two_thousand > 0){
            System.out.println(two_thousand + " : Two Thousand Rupees Notes ");
        }

        if(five_hundred > 0){
            System.out.println(five_hundred + " : Five Hundred Rupees Notes");
        }

        if(one_hundred > 0) {
            System.out.println(one_hundred + " : One Hundred Rupees Notes");
        }

    }
}
