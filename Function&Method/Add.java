import java.util.*;
public class Add {
    public static int calculate(int num1 , int num2){//parameter or formal parameter
        int sum = num1+num2; 
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculate(a,b);//argument or actual parameter
        System.out.println("sum is "+ sum);

        sc.close();
    }
    
}
