public class Pairing {
    public static int friendPairing(int n)
    {
        //base case
        if (n == 1 || n == 2) {
            return n;
        }
        //choice
        //single
        int fnm1=friendPairing(n-1);
        //pair
        int fnm2=friendPairing(n-2);
        int pairWay = (n-1) * fnm2;
        int totway = fnm1 + pairWay;
        return totway;
    }
    public static void main(String[] args) {
        int n = 4; // Example value for n
        int ways = friendPairing(n);
        System.out.println("Total ways to pair friends: " + ways);
    }
    
}
