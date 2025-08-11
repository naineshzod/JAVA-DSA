public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolname = "ABC High School";
         s1.Percentage(23,34 ,45 );
        Student s2 = new Student();
        System.out.println("School Name: " + s1.schoolname);
        Student s3 =new Student();
        //s3.Percentage(23,34 ,45 );
        System.out.println(s3.Percentage(80,90 ,70 ));
    }
}
class Student{
    String name; 
    int roll;
    static int Percentage(int math,int phys,int chem){
        return (math + phys + chem) / 3;
    }
    static String schoolname;
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return this.name;
    }
}
