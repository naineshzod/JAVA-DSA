public class Count {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if((n & 1) !=0)
            {
                count++;
            } 
            n=n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 16; // Example usage
        System.out.println("Number of set bits in " + number + " is: " + countSetBits(number));
    }
}
