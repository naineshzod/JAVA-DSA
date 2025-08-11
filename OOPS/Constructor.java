public class Constructor {
    public static void main(String[] args){
        Student s1 =new Student();
        Student s2 = new Student("Nainesh");
        Student s3 =new Student(123);
        Student s4 = new Student("Dishant",124); 
    }
}
    class Student {
        String name;
        int roll;
        //non parameterized constructor
    Student()
    {
        System.out.println("Constructor called ...");
    }
    //parameterized constructor
    Student(String name)
    {
        this.name = name;
    }
    Student(int roll)
    {
        this.roll = roll;
    }
    Student(String name,int roll)
    {
        this.name=name;
        this.roll=roll;
    }
}

