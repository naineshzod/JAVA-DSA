import java.util.*;
public class Classroom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //Adding operation in arraylist
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        //get operation
        int element =list.get(1);
        System.out.println(element);
        //remove
        list.remove(1);
        System.out.println(list);
        //set element operator
        list.set(2,10);
        System.out.println(list);
        //contain element
        System.out.println(list.contains(1));
        System.out.println(list.contains(4));
        //Adding the Number in index Value
        list.add(1, 6);
    }
}
