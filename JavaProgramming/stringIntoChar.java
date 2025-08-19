package JavaProgramming;

public class stringIntoChar {
    public static void main(String[] args){
        String s = "Rango";
        char c;
        for(int i=0;i<s.length();i++){
            c= s.charAt(i);
            System.out.println(c);
        }
    }
}
