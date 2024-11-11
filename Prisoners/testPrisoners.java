package Prisoners;

public class testPrisoners {
    public static void main(String[] args) {
        // Declare arrays for prisoners and boxes
        int[] prisoners, boxes;
        // Variables to track the number of successful simulations (x) and total simulations (i)
        float x = 0, i = 0;
        // Run the simulation 100,000 times
        for (i = 1; i < 100000; i++) {
            // Generate the array representing the prisoners (from 0 to 99)
            prisoners = Prisoners.prisoners.generatepris();
            // Generate the array representing the random arrangement of numbers in the boxes
            boxes = Prisoners.prisoners.generatebox();
            // Perform the searching process and accumulate the success count (x)
            x += Prisoners.prisoners.searching(prisoners, boxes);
        }
        // Calculate the success probability (percentage)
        float prob = (x / i) * 100;
        // Print the probability with one decimal place
        System.out.printf("Prob %.1f", prob);
    }
}