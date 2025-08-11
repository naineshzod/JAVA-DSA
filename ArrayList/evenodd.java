import java.util.ArrayList;
import java.util.Scanner;

public class evenodd {
    
    public static void main(String[] args) {
        //Scanner sc =new Scanner(System.in);
        ArrayList<Integer> game=new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no. elements:");
        int no_of_elements=sc.nextInt();
        int index;

        for(index=0;index<no_of_elements;index++){
            System.out.println("Enter "+index+" element");
            game.add(sc.nextInt());
        }

        //System.out.println(game);

        ArrayList<Integer> newgame=new ArrayList<Integer>();
        for(index=0;index<no_of_elements;index++){
            if(game.get(index)%2==0){
                newgame.add(game.get(index));
            }

        }
          for(index=0;index<no_of_elements;index++){
            if(game.get(index)%2!=0){
                newgame.add(game.get(index));
            }
            
        }

        System.out.println(newgame);
        
        sc.close();
    }

}