public class Constructors {
    public static class Student{
        String name;
        int age;
        String dob;

        Student(String n, int a, String d){ //default constructor
            name = n;
            age = a;
            dob = d;
        }
        void print(){
            System.out.println(name+"\n"+age+"\n"+dob);
        }
    }
    public static void main(String[] args) {
        Student s = new Student("Shivam",21,"02/10/2003");
        s.print();
    }
}