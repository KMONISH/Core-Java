package JavaProgramming;

import javax.swing.*;

public class fibonacciSeries {
    public static void main(String[] args){
        int num1= 0;
        int num2= 1;
        int range = 10;
        for(int i=0;i<range;i++){
            int num3 = num1 + num2;
            System.out.println(num1);
            num1 = num2;
            num2 = num3;
        }
    }
}


// Function to print N Fibonacci Number
//0
//        1
//        1
//        2
//        3
//        5
//        8
//        13
//        21
//        34