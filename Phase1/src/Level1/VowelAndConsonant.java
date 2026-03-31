package Level1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VowelAndConsonant {
//    Take a character and check if it’s a vowel or consonant.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Character : ");
        char ch = sc.next().trim().charAt(0);

        if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u' ){
            System.out.println("Its a Vowel");
        }else{
            System.out.println("Is Consonant");
        }

//        ----------------------------------------------------
        String vowels = "AaEeIiOoUu";
        if(vowels.contains(String.valueOf(ch))){
            System.out.println("Its a Vowel");
        }else{
            System.out.println("Is Consonant");
        }

    }
}
