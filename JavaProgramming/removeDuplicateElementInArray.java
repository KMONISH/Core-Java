package JavaProgramming;

public class removeDuplicateElementInArray {
    public static void main(String[] args){
        int[] a = {1,2,2,3,3,3,4,4,8,8};
        int j=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                a[j] = a[i];
                j++;
            }
        }
        for(int i=0;i<j;i++){
            System.out.println(a[i]);
        }
    }
}
