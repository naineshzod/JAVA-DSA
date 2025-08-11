public class NaturalNum {
    public static int Natural(int n){
        if(n==1){
            return 1;
        }
        return Natural(n-1) + n;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(Natural(n));
    }
}
