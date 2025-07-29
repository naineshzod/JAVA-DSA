public class MaxPrefixSum {
    public static void prefixsum(int Number[]){
        int curr=0;
        int Maxvalue=Integer.MIN_VALUE;
        int prefix[] =new int[ Number.length];
        prefix[0]=Number[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+Number[i];
        }
        for(int i=0;i<Number.length;i++)
    {
        int start=i;
        for(int j=i;j<Number.length;j++){
            int end=j;
            curr= start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
             if(Maxvalue<curr){
                Maxvalue=curr;
             }
             
        }
    }   
    System.out.println(" maximum sum of array is " + Maxvalue); }
    public static void main(String[] args) {
        int Number[]={1,-2,6,-1,3};
        prefixsum(Number);

    }
}
   