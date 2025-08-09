package JavaProgramming;

import java.util.Scanner;

public class factorial {
        public static void main(String[] args){
            int fact=1;
            Scanner scanner =new Scanner(System.in);
            System.out.println("Enter the number to calculate Palindrome -");
            int num = scanner.nextInt();
            for(int i=1;i<=num;i++){
                 fact= fact *i;
            }
            System.out.println("Factorial is: "+fact);
        }
    }

//Enter the number to calculate Palindrome -
//        5
//Factorial is: 120