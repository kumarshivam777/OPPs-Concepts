import java.util.Scanner;

public class ThisKeyword {
    public static class This_Keyword{
        String name;
        int age;
        int mobileNo;

        This_Keyword(String name, int age, int mobileNo){
            this.name = name;
            this.age = age;
            this.mobileNo = mobileNo;
        }
        void print(){
            System.out.print(name + "\n" + age + "\n" + mobileNo);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        This_Keyword this1 = new This_Keyword("Shivam", 21, 5808);
        this1.print();
    }
}
