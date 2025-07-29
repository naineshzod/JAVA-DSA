public class ClearBit {
    public static int clearBit(int n, int i){
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }
    public static void main(String[] args)
    {
        System.out.println(clearBit(10, 2)); // Example usage, clearing the bit at position 2 of 10
    }
}