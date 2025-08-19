package JavaProgramming;

public class digitCountInString {
    public static void main(String[] args){
        String str = "JGCYTbcc12327651363";
        int count = 0;
        for(int i=0;i<str.length();i++){
            char B =str.charAt(i);
            if(B>='0' && B<='9'){
                count = count + 1;
                System.out.println(B);
            }
        }
        System.out.println("Count is -  "+count);
    }
}
