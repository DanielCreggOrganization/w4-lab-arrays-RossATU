package ie.atu.arrays;

public class ArrayDeclaration {
    public static void main(String[] args) {
        // Method 1: Declaration without initialization
        double[] array1;
        array1 = new double[3]; // Now initialized with default values (0, 0, 0)

        // Method 2: Declaration with size
        int[] array2 = new int[3]; // Initialized with default values

        // Method 3: Inline initialization
        int[] array3 = {1, 2, 3};

        // Method 4: Using new keyword with initialization
        int[] array4 = new int[]{4, 5, 6};

        // Displaying array elements
        for (int num : array3) {
            System.out.print(num + " ");
        }
        double[] arrayDouble = {1.5, 2.5, 3.5, 4.5};
        for (double doub : arrayDouble) {
            System.out.print(doub + " ");
        
    }
}}
