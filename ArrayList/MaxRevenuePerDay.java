import java.util.*;
public class MaxRevenuePerDay {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of M:");
        int M = sc.nextInt();
        System.out.println("Enter the number of N:");
        int N = sc.nextInt();
        int sales[][] = new int[M][N];
        for (int i = 0; i < M; i++) {
            System.out.println("Enter sales for day " + (i + 1) + ":");
            for (int j = 0; j < N; j++) {
                sales[i][j] = sc.nextInt();
            }
        }
        for(int j=0; j < N; j++) {
            int maxRevenue = 0;
            for (int i = 0; i < M; i++) {
                if (sales[i][j] > maxRevenue) {
                    maxRevenue = sales[i][j];
                }
            }
            System.out.println("Maximum revenue for product " + (j + 1) + " is: " + maxRevenue);
        }
        sc.close();

    }
}
