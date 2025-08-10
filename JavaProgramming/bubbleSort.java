package JavaProgramming;

public class bubbleSort {
    public static void main(String[] args){
        int[] a = {3,1,7,0,5,1,67,93,198};

        for(int i=0; i< a.length; i++){
            for(int j = 0; j<a.length;j++){
                if(a[j]>a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i=0;i< a.length;i++){
            System.out.println(a[i]);
        }
    }
}

//        0
//        1
//        1
//        3
//        5
//        7
//        67
//        93
//        198
