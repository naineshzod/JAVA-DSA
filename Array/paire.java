public class paire {
    public static void Paireinarray(int Number[]){
        int tp=0;
        for(int i=0;i<Number.length;i++){//iter1 i=2
            int curr=Number[i];//curr2
            for(int j=i+1;j<Number.length;j++){//j=4
                System.out.print("("+ curr + ","+ Number[j]+ ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pair is "+tp);
    }
    public static void main(String[] args) {
        int Number[]={2,4,6,8,10};
        Paireinarray(Number);

    
    }
}
