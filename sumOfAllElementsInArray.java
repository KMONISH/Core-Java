public class sumOfAllElementsInArray {
    public static void main(String[] args){
        int[] number = {1,4,2,6,7};
        int sum =0;
        for(int i = 0; i<= number.length-1; i++){
            sum = sum + number[i];
        }
        System.out.println("The sum of array is :"+sum);
    }
}

//The sum of array is :20
