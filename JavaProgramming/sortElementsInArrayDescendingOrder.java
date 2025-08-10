package JavaProgramming;

public class sortElementsInArrayDescendingOrder {
    public static void main(String[] args){
        int[] a ={2,8,1,0,7};

        for(int i=0; i<a.length; i++){
            for(int j= i+1; j<a.length; j++){
                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i =0;i <a.length; i++){
            System.out.println(a[i]);
        }
    }
}

//        8
//        7
//        2
//        1
//        0
