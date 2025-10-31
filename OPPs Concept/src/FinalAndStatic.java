class Teacher{
    final String subject = "Science"; //this can not be changed

    void printThis(){
        System.out.println(subject);
    }
}
public class FinalAndStatic {
    public static void main(String[] args) {
        Teacher t = new Teacher();
//        t.subject = "Hindi"; //this will give an error because subject assign by final keyword
        t.printThis();

        Teacher t2 = new Teacher();
        t2.printThis(); //this will also print same subject because it's already define
    }
}
