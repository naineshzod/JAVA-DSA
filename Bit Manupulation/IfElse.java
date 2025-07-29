import java.util.*;
public class IfElse {
    public static void OddOrEven(int n){
        int bitMask=1;
        if((n & bitMask) == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        OddOrEven(n);
        sc.close();
    }
}
  