package staticExample;

public class Human {
    String name;
    int age;
    static int population;
    int salary;

    static void hero(){
        System.out.println("Ironman");
//        this.age; // dont use this over here because static dont make any obj
    }

    public Human(int age, String name, int salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.population++;
        Human.hero(); // dont use this use classname
    }
}
