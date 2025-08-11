public class Print {
    public static void println(int n){
        if(n == 0) {
            return;
        }
      System.out.print(n+ " ");
      println(n-1);

    }
    public static void main(String[] args) {
        int n=10;
        println(n);
        //System.out.println("Done");
    }
}
