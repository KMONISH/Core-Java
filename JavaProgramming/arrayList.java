package JavaProgramming;

import java.util.*;

public class arrayList {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Monish");
        arr.add("");
        arr.add("Somu");
        arr.add("Vishal");
        System.out.println(arr.get(2));
        System.out.println(arr.contains("Somu"));
        System.out.println(arr);
    }
}
