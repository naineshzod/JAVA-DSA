public class Subarray {
    public static void subarray(int Number[]){
        for(int i=0;i<Number.length;i++){
            int start=i;
            for(int j=i;j<Number.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(Number[k]+ " ");
                }
                System.out.println();
                
            }
            System.out.println();
        }
    
    }
    public static void main(String[] args) {
        int Number[]={2,4,6,8,10};
        subarray(Number);
    }
}
