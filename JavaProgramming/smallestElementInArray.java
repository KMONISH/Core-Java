package JavaProgramming;

public class smallestElementInArray {
    public static void main(String[] args){
        int[] a = {20,3,67,32,-1};
        int Smallest = a[0];

        for(int i=0;i< a.length;i++){
            if(a[i] < Smallest){
                Smallest = a[i];
            }
        }
        System.out.println("The smallest number in array : "+ Smallest);
    }
}

//The smallest number in array : -1
