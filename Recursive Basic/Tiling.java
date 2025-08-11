import java.util.*;
public class Tiling {
    public static int tilingProblem(int n)
    {
        //base case
        if(n==0||n==1)
        {
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1=tilingProblem(n-1);
        //horizontal choice
        int fnm2=tilingProblem(n-2);
        int totway=fnm1+fnm2;
        return totway;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int ways = tilingProblem(n);
        System.out.println("Total ways to tile the floor: " + ways);
    }
}
