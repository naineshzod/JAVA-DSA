public class BToD {
    public static void BINARYTODECIMAL(int BinNum){
        int myNum=BinNum;
        int pow=0;
        int DecNum=0;
        while(BinNum>0)
        {
            int LastNum=BinNum%10;
            DecNum=DecNum+(LastNum*(int)Math.pow(2, pow));
            pow++;
            BinNum /=10;

        }
        System.out.println("Decimal of "+ myNum + " = "+DecNum);
    }
    public static void main(String[] args) {
        BINARYTODECIMAL(1111);
    }
}
