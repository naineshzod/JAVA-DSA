import java.util.*;
public class ArrayCC {
    public static void main(String[] args) {
        int marks[]=new int[50];
        Scanner sc =new Scanner(System.in);
        System.out.println("Lengthn of array = " +marks.length);
        System.out.println("Enter the marks[0]");
        marks[0] = sc.nextInt();
        System.out.println("Enter the marks[1]");
        marks[1] = sc.nextInt();
        System.out.println("Enter the marks[2]");
        marks[2] = sc.nextInt();
        System.out.println("Marks of physic " + marks[0]);
        System.out.println("Marks of chemisty " + marks[1]);
        System.out.println("Marks of math " + marks[2]);
        sc.close();
    }
}
