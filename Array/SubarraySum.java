
public class SubarraySum {
    public static void kadanes(int Number[]){
        int MaxSum=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<Number.length;i++){
            curr+=Number[i];
            if(curr<0){
                curr=0;
            }
            MaxSum= Math.max(curr,MaxSum);
        }
        System.out.println("Our Maximum Sub Array Sum is "+ MaxSum);
          
    }
    public static void main(String[] args) {
        int Number[] ={-2,-3,4,-1,-2,1,5,-3};
        kadanes(Number);
    }
}