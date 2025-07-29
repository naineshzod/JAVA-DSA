import java.util.*;
public class Butterfly {
    public static void Butterfly_pattern1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nubmber");
        int n = sc.nextInt();        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        }
        public static void main(String[] args) {
            Butterfly_pattern1();
        }
    }
    

