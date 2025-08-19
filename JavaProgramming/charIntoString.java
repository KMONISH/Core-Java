package JavaProgramming;

public class charIntoString {
    public static void main(String[] args){
        char[] ch ={'s','a','n','d'};
        String s = "";
        for(int i=0;i<ch.length;i++){
            s =s + ch[i];
        }
        System.out.println(s);
    }
}
