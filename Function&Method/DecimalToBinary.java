public class DecimalToBinary {
    public static void DECIMALTOBINANRY(int DecNum){
        int mynum=DecNum;
        int pow=0;
        int BinNum=0;
        while(DecNum>0)
        {
            int rem=DecNum%2;
            BinNum=BinNum+rem*(int)Math.pow(10, pow);
            pow++;
            DecNum/=2;
        }
        System.out.println("Binary Num of "+ mynum + " = " + BinNum);
    }
    public static void main(String[] args) {
        DECIMALTOBINANRY(7);
    }
}
