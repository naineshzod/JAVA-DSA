import java.util.*;
public class Larges {
    public static int getlargest(int Number[])
    {
        int largest = Integer.MIN_VALUE;
        int smallest =Integer.MAX_VALUE;
        for(int i=0;i<Number.length;i++){
            if(largest<Number[i])
            {
                largest=Number[i];
            }
            if(smallest>Number[i])
            {
                smallest=Number[i];
            }
        }
        System.out.println("smallest Number of array is " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int Number[]=new int[7];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number in Index");
        Number[0]=sc.nextInt();
        Number[1]=sc.nextInt();
        Number[2]=sc.nextInt();
        Number[3]=sc.nextInt();
        Number[4]=sc.nextInt();
        Number[5]=sc.nextInt();
        Number[6]=sc.nextInt();
        System.out.println("Largest Number in Array "+getlargest(Number));
        sc.close();
    }
}
