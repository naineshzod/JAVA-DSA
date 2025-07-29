import java.util.*;
public class LinearSearch {
    public static int linear(int Number[],int key){
        for(int i=0;i<Number.length;i++)
        {
            if(Number[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int Number[]= new int[10];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        Number[0] = sc.nextInt();
        Number[1] = sc.nextInt();
        Number[2] = sc.nextInt();
        Number[3] = sc.nextInt();
        Number[4] = sc.nextInt();
        Number[5] = sc.nextInt();
        Number[6] = sc.nextInt();
        Number[7] = sc.nextInt();
        Number[8] = sc.nextInt();
        Number[9] = sc.nextInt();
        System.out.println("Enter the key to search ");
        int key = sc.nextInt();
        //int index=
         System.out.println(linear(Number,key));
        //if(index==-1){
         //   System.out.println("NOT found");
        //}
        //else{
        //    System.out.println("Key Found at index "+ index);
        //}
        sc.close();

    }
}
