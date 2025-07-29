
//Brute Force
public class MaxSubarray {
    public static void Subarray(int Number[]){
        
        int Maxarray=Integer.MIN_VALUE;
        for(int i=0;i<Number.length;i++){
            int start=i;
            for(int j=i;j<Number.length;j++)
            {
                int curr=0;
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(Number[k]+ " ");
                    curr+=Number[k];
                }
                    System.out.print("= "+curr);
                    if(Maxarray<curr){
                        Maxarray=curr;
                    
                    
                }
                System.out.println();
            }
           // System.out.println();
        }
        System.out.println("Maximum sum of subarray = " + Maxarray);
    }
    public static void main(String[] args) {
        int Number[]={2,4,6,8,10};
        Subarray(Number);
    }
}
