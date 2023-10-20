package lab2.ex1;

public class Lab2Ex1 {
    public static int getSecondSmallest(int[] arr) {
        if (arr.length < 2) {
           
            return Integer.MIN_VALUE;
        }

        int smallest = Integer.MAX_VALUE; // Initialize the smallest to the maximum possible value.
        int secondSmallest = Integer.MAX_VALUE; // Initialize the second smallest to the maximum possible value.

        for (int num : arr) {
            if (num < smallest) {
                // If the current number is smaller than the smallest so far,
                // update the second smallest and smallest values.
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                // If the current number is smaller than the second smallest but not equal to the smallest,
                // update the second smallest.
                secondSmallest = num;
            }
        }

        return secondSmallest; // Return the second smallest element in the array.
    }
    
//     TAKING INPUT FROM USERS
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number of elements in the array: ");
//        int n = scanner.nextInt();
//        
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            System.out.print("Enter element " + (i + 1) + ": ");
//            arr[i] = scanner.nextInt();
//        }

    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 1, 6, 3};
        int secondSmallest = getSecondSmallest(arr);

        if (secondSmallest != Integer.MIN_VALUE) {
            System.out.println("The second smallest element in the array is: " + secondSmallest);
        } else {
            System.out.println("Array has less than 2 elements.");
        }
    }
}
