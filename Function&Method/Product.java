public class Product {
    public static int multiply(int a,int b)
    {
        int product=a*b;
        System.out.println("Product =" + product);
        return product;
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        multiply(a, b);
        multiply(3, 2);
        multiply(89, 9);
        
    }
}
