import java.util.*;
public class FirstOccurence {
    public static int Firstoccern(int arr[],int key,int i)
    {
        if(i==arr.length){
            return -1;
        }
        if (arr[i]==key) {
            return i;
        }
        return Firstoccern(arr,key,i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        System.out.println("the first occurrence of " + key + " is at index: " + Firstoccern(arr, key, 0));
        sc.close();

    }
}
