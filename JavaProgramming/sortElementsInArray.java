package JavaProgramming;

import java.util.Arrays;

public class sortElementsInArray {
    public static void main(String[] args){
        int[] a ={99,3,0,7,10,1};
        Arrays.sort(a);// inbuilt method
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
