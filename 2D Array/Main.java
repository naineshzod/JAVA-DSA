public class Main {
    public static void main(String[] args)
    {
        int matrix[][]={{1,7,5,7},
                        {3,6,8,7}};
        int count7=0;
        for(int i=0;i<=matrix.length-1;i++)
        {
            for(int j=0;j<=matrix[0].length;i++)
{
    if(matrix[i][j]==7){
        count7++;
    }
}       
 }
    System.out.println("Repeated 7 is "+count7);
    }
}
