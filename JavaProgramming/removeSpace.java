package JavaProgramming;

public class removeSpace {
    public static void main(String[] args){
        String str = "this is crack ethos";
        String S = "";
        for(int i=0;i<str.length();i++){
            char C = str.charAt(i);
            if (C != ' ') {
                S = S + C;
            }
        }
        System.out.println(S);
    }
}
