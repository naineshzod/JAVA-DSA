public class Power {
    
    public static void main(String[] args){
        int n =15;
        if((n & (n-1)) == 0)
        {
            System.out.println((n + " is a power of 2"));
        }
        else
        {
            System.out.println((n + " is not a power of 2"));
        }

    }
}
