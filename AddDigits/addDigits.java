public class addDigits {
    public static void main(String[] args) {
        // Test case 1: Input is 38, expected output is 2 (since 3 + 8 = 11 and 1 + 1 = 2)
        System.out.println(solution(38));
        // Expected output: 2
        // Test case 2: Input is 0, expected output is 0
        System.out.println(solution(0));
        // Expected output: 0
    }
    /// Recursive method to find the digital root of a number
    public static int solution(int num) {
        // Base case: if the number is a single-digit number, return it as is
        if (num / 10 == 0) {
            return num;
        } else {
            int sum = 0;
            // Sum the digits of the number
            while (num != 0) {
                sum += num % 10;  // Add the last digit to the sum
                num /= 10;         // Remove the last digit from the number
            }
            // Recursively call the method with the sum of digits
            return solution(sum);
        }
    }
}