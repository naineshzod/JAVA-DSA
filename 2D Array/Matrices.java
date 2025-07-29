import java.util.*;
public class Matrices{
    public static boolean Search(int matrix[][], int key)
    {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key)
                {
                    System.out.println("Key is found at index : ("+i+","+j+")");
                    return true;
                }
        }
    }
    System.out.println("Key is not found");
    return false;
}
    public static void main(String[] args) {
        int matrix[][] = new int[5][5];
        int key;
        int n=matrix.length,m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j] + " ");
                
            }
            System.out.println();
        }
        Search(matrix, 7);
        sc.close();
    }
    
}