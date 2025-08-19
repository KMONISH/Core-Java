package JavaProgramming;

public class reverseString {
    public static void main(String[] args){
        String str = "guilt";
        String reversedString = "";
        for(int i=str.length()-1;i>=0;i--){
            char C =str.charAt(i);
            reversedString = reversedString +C;
        }
        System.out.println(reversedString);
    }
}
