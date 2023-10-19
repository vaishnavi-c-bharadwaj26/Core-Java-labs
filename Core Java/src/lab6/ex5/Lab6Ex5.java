package lab6.ex5;

import java.util.*;

public class Lab6Ex5 {
    public static int getSecondSmallest(int[] arr) {
        if (arr.length < 2) {
            // Handle the case when there are not enough elements in the array.
            throw new IllegalArgumentException("The array should have at least two elements.");
        }

        // Convert the array to an ArrayList.
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : arr) {
            arrayList.add(num);
        }

        // Sort the ArrayList in ascending order.
        Collections.sort(arrayList);

        // The second smallest element will be at index 1 after sorting.
        return arrayList.get(1);
    }

    public static void main(String[] args) {
        int[] arr = {54, 21, 98, 10, 62};
        int secondSmallest = getSecondSmallest(arr);
        System.out.println("The second smallest element is: " + secondSmallest);
    }
}


 


	 


