public class BinToDec {
    public static void BinToDecimal(int BinNum){
        int myNum=BinNum;
        int pow=0;
        int DecNum=0;
        while(BinNum>0){
            int lastNumber=BinNum%10;
            DecNum=DecNum + (lastNumber *(int) Math.pow(2,pow));
            pow++;
            BinNum /=10;
        }
        System.out.println("decimal of "+ myNum +" = "+ DecNum);
    }
   public static void main(String[] args) {
    BinToDecimal(10111);
   }
}
