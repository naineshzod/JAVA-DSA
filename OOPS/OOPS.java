public class OOPS {
     public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(5);
        
        System.out.println("Pen Color: " + p1.getColor());
        System.out.println("Pen Tip: " + p1.getTip());
        p1.color = "Red"; // Directly accessing the color field
        System.out.println("Updated Pen Color: " + p1.color);
        
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 20;
        s1.calcPercentage(85, 90, 80);
        
        System.out.println("Student Name: " + s1.name);
        System.out.println("Student Age: " + s1.age);
        System.out.println("Student Percentage: " + s1.percentage);
}
}
 
class Pen
{
    String color;
    int tip;
    String getColor(){
        return color;
    }
    int getTip(){
        return tip;

    }
    void setColor(String color){
        this.color=color;
    }
    void setTip(int tip){
        this.tip=tip;
    }
}
class BankAccount{

}
class Student{
    String name;
    int age;
    float percentage;
    void calcPercentage(int phy,int chem,int math){
        percentage=(phy+chem+math)/3.0f;
    }
}

    