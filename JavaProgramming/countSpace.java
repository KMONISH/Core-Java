package JavaProgramming;

public class countSpace {
    public static void main(String[] args){
        String str = "count the spa ce in s t r";
        int count = 0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c == ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
