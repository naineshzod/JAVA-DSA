import java.util.*;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int org=num;
        int rev=0;
        while(num>0)
        {
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;

        }
        if(rev==org)
        {
            System.out.println("pallindrome");
        }
        else
        {
            System.out.println("not pallindrome");
            
        }
        sc.close();
    }
    
    
}
