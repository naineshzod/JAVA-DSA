import java.util.Arrays;
import java.util.Collections;
public class Inbuilt {
    public static void insertsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding out the correct position to insert 
            while(prev>=0&& arr[prev]> curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;

        }
    }
    public static void Printarr(Integer arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        Integer[] arr = {1, 8, 6, 4, 5,};
        //Arrays.sort(arr);
       // Arrays.sort(arr,0,3);
        Arrays.sort(arr, Collections.reverseOrder());
        Printarr(arr);
    }
    
}
