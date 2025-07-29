public class prime {
    public static void Prime(int n){
        int div=2;
        if(div<=n-1){
            if(n%div==0){
                System.out.println("Not prime number");
            }
            else{
                div=div+1;
            }
        }
        else{
        System.out.println("Prime number");
        }

    }
    public static void main(String[] args) {
     Prime(5);
    }
}
