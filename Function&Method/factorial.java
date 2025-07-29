
public class factorial {
    public static int Factori(int n ){
        int f=1;
        for(int i=1;i<=n;i++){
            f= f*i;

        }
        //System.out.print("Factorial = " + f);
        return f;
    }
    /*public static int Bincofi(int n,int r){
        int bin;
        int a=Factori(n);
        int b=Factori(r);
        int c=Factori(n-r);
         bin = a/(b*c);
        System.out.println("Bincofi =" + bin);
        return bin;
    }
        */
    public static void main(String[] args) {
    System.out.print(Factori(5));
    }
}
