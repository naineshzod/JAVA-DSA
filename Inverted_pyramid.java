

public class Inverted_pyramid {
    public static void pyramin_inverted(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pyramin_inverted(5);
    }
    
}
