class Students{
    String name;
    private int rNo;
    double cgpa;
    void print(){ //It's by default public (It's knows as getter)
        System.out.println(name + "\n" + rNo + "\n" + cgpa);
    }
    void setRno(int r){
        rNo = r;
    }
}
public class OPPsPrivetKeyword {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.cgpa = 8.9;
        s1.name = "Shivam";
        s1.print();
        s1.setRno(5);
        s1.print();
    }
}
