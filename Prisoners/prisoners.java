package Prisoners;

public class prisoners {
    /// Method to generate the array representing the prisoners
    public static int[] generatepris() {
        // Create an array of size 100 to represent 100 prisoners
        int[] arr = new int[100];
        // Fill the array with prisoner numbers (0 to 99)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        // Return the array of prisoners
        return arr;
    }
    /// Method to generate the random arrangement of numbers in the boxes
    public static int[] generatebox() {
        // Create an array to represent the boxes (100 boxes)
        int[] arr = new int[100];
        // Create a boolean array to keep track of the numbers already used
        boolean[] test = new boolean[100];
        // Fill the array arr with random numbers without duplicates
        for (int i = 0; i < arr.length;) {
            // Randomly assign a number (between 0 and 99) to the box
            arr[i] = (int) (100 * Math.random());
            // Check if the number has already been used (to avoid duplicates)
            if (!test[arr[i]]) {
                // Mark the number as used
                test[arr[i]] = true;
                // Move to the next box
                i++;
            }
        }
        // Return the array of boxes with random numbers
        return arr;
    }
    /// Method to simulate the search process for each prisoner
    public static int searching(int[] pris, int[] box) {
        // Declare a variable to track the current box number
        int boxnum;
        // Loop through each prisoner
        for (int i = 0; i < pris.length; i++) {
            // Start by opening the box corresponding to the prisoner's number
            boxnum = i;
            // Each prisoner can open up to 50 boxes
            for (int j = 1; j <= 51; j++) {
                // If the prisoner fails to find their number after 50 boxes, return 0 (failure)
                if (j == 51) {
                    return 0;
                }
                // If the prisoner finds their number, stop searching
                if (pris[i] == box[boxnum]) {
                    break;
                }
                // Otherwise, move to the box that contains the number found in the current box
                boxnum = box[boxnum];
            }
        }
        // If all prisoners find their numbers, return 1 (success)
        return 1;
    }
}