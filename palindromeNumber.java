import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args){
        int orgNumber;
        int rev = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        orgNumber =  scanner.nextInt();

        while(orgNumber>0){
            int rem = orgNumber % 10;
            orgNumber = orgNumber/10;
            rev = rev *10 + rem;
        }
        System.out.println("Reversed number is : "+ rev);
    }
}

//Enter the Number
//341
//Reversed number is : 143
