//import java.util.*;

public class Lastoccern{
    public static int Last(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = Last(arr,key,i+1);
        if(isFound == -1 && arr[i] == key)
        {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,5};
        int key=2;
        System.out.println("The last occurrence of " + key + " is at index: " + Last(arr, key, 0));
        
    } 

}
