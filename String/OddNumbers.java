public class OddNumbers {
    public static void main(String[] args) {
        // 1. Start with an empty string to hold the numbers.
        String oddNumbersList = "";

        // 2. Loop through every number from 1 to 100.
        for (int i = 1; i <= 100; i++) {

            // 3. Check if the number is odd.
            if (i % 2 != 0) {
                // 4. If it is, add it to our list with a space.
                oddNumbersList = oddNumbersList + i + " ";
            }
        }

        // 5. Print the final list of odd numbers.
        System.out.println("The odd numbers are:");
        System.out.println(oddNumbersList);
    }
}