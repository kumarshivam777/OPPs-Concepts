import java.util.Scanner;
class Student{
    String name;
    int age;
    String fName;
    String mName;
    int rNo;

    void print(){
        System.out.println(name + "\n" + age + "\n" + fName + "\n" + mName);
    }
}
public class OPPsConcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.println("Please Enter Your Name :");
        s1.name = sc.nextLine();
        System.out.println("Please Enter Your Age :");
        s1.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Please Enter Your Father Name :");
        s1.fName = sc.nextLine();
        System.out.println("Please Enter Your Mother Name :");
        s1.mName = sc.nextLine();
        s1.print();
    }
}
