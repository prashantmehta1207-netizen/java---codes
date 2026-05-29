// write a program to demonstrate constructor overloading using student class
class student
{
    int id;
    String name;
    student()
    {
        id = 0;
        name = "UNKNOWN";
    }
    student(int i)
    {
        id = i;
        name = "NOT ASSIGN";
    }
    student(int i,String n){
        id =i;
        name = n;
    }
    void display()
    {
        System.out.println(id+ " " +name);
    }
}
public class Main_1
{
    public static void main(String[] args){
        student s1 = new student();
        student s2 = new student(101);
        student s3 = new student(102, " jay");
        s1.display();
         s2.display();
          s3.display();
    }
}
