package JavaProgramming;

import java.util.Scanner;

public class primeNumber {
   public static void main(String[] args){

       int inputNum;
       int count= 0;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the number");
       inputNum = scanner.nextInt();

       for(int i=1;i<=inputNum;i++) {
           if (inputNum % i == 0) {
               count = count + 1;
           }
       }
       if (count == 2) {
           System.out.println("Its a Prime number");
       } else
           System.out.println("Its not a Prime number");
   }
}

//output
//11
//its a prime number

//8
//not a prime number