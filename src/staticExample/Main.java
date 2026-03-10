package staticExample;

public class Main {
    public static void main(String[] args) {
        Human rohit = new Human(20, "Bikram", 12000);
        System.out.println(Human.population);
//        display();
        Main obj = new Main();
        obj.display();
    }
    void display()
    {
        System.out.println("Display");
    }
}
