class Teacher{
    final String subject = "Science"; //this can not be changed (final is not changeable)
    static String work = "Teaching"; //static is common for every object (static is changed by any object global)

    void printThis(){
        System.out.println(subject);
    }
    void printStatic(){
        System.out.println(work);
    }
}
public class FinalAndStatic {
    public static void main(String[] args) {
        Teacher t = new Teacher();
//        t.subject = "Hindi"; //this will give an error because subject assign by final keyword
        t.printThis();

        Teacher t2 = new Teacher();
        t2.printThis(); //this will also print same subject because it's already define
        t2.printStatic();
        t.work = "reading"; //here static changed for every objects
        System.out.println(t.work);
        System.out.println(t2.work);
    }
}
