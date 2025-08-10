package JavaProgramming;

public class palindromeString {
    public static void main(String[] args){
        String str = "level";
//        String str = "crack";
        String rev = "";
        String srtCopy = str;
        for(int i = str.length()-1;
            i>= 0;
            i-- ){

            rev = rev + str.charAt(i);
        }
        if(rev.equals(srtCopy)){
            System.out.println("Its a palindrome String ");
        }else
            System.out.println("Not a palindrome String");

    }
}

//Its a palindrome String
