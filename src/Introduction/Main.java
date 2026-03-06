package Introduction;

public class Main {
    public static void main(String[] args) {
//        Student bikram = new Student();
//        System.out.println(bikram);
//        bikram.marks = 20.3f;
//        bikram.rno = 30;
//        bikram.name = "Bikram Pal";

        Student bikram = new Student(12,"bikram", 30.5f);

        System.out.println(bikram.marks);
        System.out.println(bikram.rno);
        System.out.println(bikram.name);

        Student hello = new Student();

        System.out.println(hello.marks);
        System.out.println(hello.rno);
        System.out.println(hello.name);
    }
}

class Student{
    int rno;
    String name;
    float marks;

    Student(int rno, String name, float marks)
    {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student()
    {
        this(12,"hello", 34.0f);
    }
}
