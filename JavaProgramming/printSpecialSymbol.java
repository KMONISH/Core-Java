package JavaProgramming;

public class printSpecialSymbol {
    public static void main(String[] args){
        String S = "Monish@%#^&^&$";
        for(int i=0;i<S.length();i++){
            char b = S.charAt(i);
            if(!(b>='a' && b<='z' ||  (b>='A' && b<='Z') || (b>=0 && b<=9))) {
                System.out.println(b);
            }
        }
    }
}

//o/p
//@
//%
//        #
//        ^
//        &
//        ^
//        &
//$
