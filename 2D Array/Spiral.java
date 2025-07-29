import java.util.*;

public class Spiral {
    public static void spi(int matrix[][]) {
        int SR = 0;
        int SC = 0;
        int ER = matrix.length - 1;
        int EC = matrix[0].length - 1;

        while (SR <= ER && SC <= EC) {

            // Traverse from left to right
            for (int i = SC; i <= EC; i++) {
                System.out.print(matrix[SR][i] + " ");
            }

            // Traverse from top to bottom
            for (int i = SR + 1; i <= ER; i++) {
                System.out.print(matrix[i][EC] + " ");
            }

            // Traverse from right to left (if more than one row remaining)
            //if (SR < ER) {
                for (int i = EC - 1; i >= SC; i--) {
                    if(SR==ER){
                        break;
                    }
                    System.out.print(matrix[ER][i] + " ");
                }
            

            // Traverse from bottom to top (if more than one column remaining)
            //if (SC < EC) {
                for (int i = ER - 1; i > SR; i--) {
                    if(SC==EC){
                        break;
                        }
                    System.out.print(matrix[i][SC] + " ");
                }
            

            SR++;
            SC++;
            ER--;
            EC--;
        }
        }
        public static int diagonalSum(int matrix[][])
        {
            int sum=0;
            for(int i=0;i<matrix.length;i++)
            {
               for(int j=0;j<matrix[0].length;j++)
               {
                if(i==j)
                {
                    sum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1)
                {
                    sum+=matrix[i][j];
                }
               }
            }
            return sum;
        }
        public static boolean staire(int matrix[][],int key){
            int row=0,col=matrix[0].length-1;
            while(row<matrix.length && col >= 0){
                if(matrix[row][col]==key){
                    System.out.println("The key is found at ("+row+","+col+")");
                    return true;
                }
                else if(key<matrix[row][col]){
                    col--;

                }
                else
                {
                    row++;
                }
            }
            System.out.println("Key is not found");
            return false;
        }
    

    public static void main(String[] args) {
        int matrix[][] = {
            {10,  20,  30,  40},
            {15,  25,  35,  45},
            {27, 29, 37, 48},
            {32, 33, 49, 50},};
            //spi(matrix);
            int key=29;
            //System.out.println(diagonalSum(matrix));
            staire(matrix,key);
        }
}