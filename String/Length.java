import java.util.*;
public class Length {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        for(int i = 0; i <str.length(); i++) {
            if(str.charAt(i) == ' '){
                continue;
            }
            System.out.print(i + " ");
            


    }
    sc.close();
}
    
}
