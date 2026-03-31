package Level1;

import java.util.Scanner;

public class Temp {
//    Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions.
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Temperature *C : ");
        int temp = sc.nextInt();

        if(temp < 20){
            System.out.println("Temperature is Cold!");
        }else if(temp >= 20 && temp <= 37){
            System.out.println("Temperature is Warm - Normal!");
        }else{
            System.out.println("Temperature is Hot!");
        }
    }
}
