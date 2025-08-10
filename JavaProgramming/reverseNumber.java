package JavaProgramming;

public class reverseNumber {

    public static void main(String[] args){
        int reverseNumber = 0;
        int number = 2312;
        int rem;
        while(number>0){
            rem = number % 10;
            number = number / 10;
            reverseNumber = reverseNumber * 10+rem;
        }
        System.out.println("Reversed Number is - "+ reverseNumber);
    }
}

//Reversed Number is - 2132
