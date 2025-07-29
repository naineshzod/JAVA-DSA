public class BuySell {
    public static int StockPrice(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int Maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(buyprice<prices[i])
            {
                int p=prices[i]-buyprice;
                Maxprofit=Math.max(p,Maxprofit);
            }
            else
            {
                buyprice=prices[i];
            }
        }
        return Maxprofit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(StockPrice(prices));
    }
}
