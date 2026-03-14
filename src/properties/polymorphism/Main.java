package properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Square sq = new Square();
        Shapes tr = new Triangle();
        Circle cr = new Circle();
        tr.area();
        cr.area();
        sq.area();
    }

}