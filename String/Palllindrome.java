
import java.util.*;
public class Palllindrome {
    public static boolean isPalindrom(String str){
         for(int i=0;i<str.length()/2;i++)
        {
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrom(str));
        sc.close();
    }
    
}
