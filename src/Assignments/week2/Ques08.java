package Assignments.week2;


    class student{
        int age;
        String name;
        student(int age, String name){
           this.age = age;
           this.name = name;
        }
        void print()
        {
            System.out.println(name +  " "+ age);
        }
    }
    public class Ques08 {
        public static void main(String[] args)
        {

            student r1 = new student(12, "bikram");
            r1.print();
        }
    }


