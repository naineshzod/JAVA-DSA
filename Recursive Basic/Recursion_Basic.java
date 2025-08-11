public class Recursion_Basic {
    public static void PrintInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        PrintInc(n-1);
        System.out.print(n+" ");
        
    }
    public static boolean isSorted(int arr[],int i)
    {
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        //int n=10;
        //PrintInc(n);
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Is the array sorted? " + isSorted(arr, 0));
    }
}
