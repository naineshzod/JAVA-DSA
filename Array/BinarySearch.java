public class BinarySearch {
    public static int Binary(int Number[],int key){
        int star=0;
        int end=Number.length-1;
        while(star<=end){
            int mid=(star+end)/2;
        
        if(Number[mid]==key)
        {
            return mid;
        }
        if(Number[mid]<key)
        {
            star=mid+1;
        }
        else{
            end=mid-1;
        }
    }
    return -1;

    }
    public static void main(String[] arg ) {
        int Number[]= {2,4,6,8,10,12,14};
        int key=10;
        System.out.println("The Key Index of Array is " + Binary(Number, key));

    }
    
}
