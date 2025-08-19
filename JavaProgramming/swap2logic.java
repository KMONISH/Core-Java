package JavaProgramming;

public class swap2logic {
    public static void main(String[] args){
        int a= 2;
        int b= 3;
        b=a-b;
        a=a-b;
        b=a+b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
//Without using temp ver
//a = 3
//b = 2