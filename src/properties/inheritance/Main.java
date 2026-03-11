package properties.inheritance;

public class Main {


    public static void main(String[] args) {
        Box b1 = new Box(12);
        Box b2 = new Box();
        System.out.println(b1.h);
        System.out.println(b2.h);

        BoxWeight b3 = new BoxWeight(12,34,45,56);
        BoxWeight b4 = new BoxWeight(12,23);

        BoxPrice b5 = new BoxPrice();
        System.out.println(b5.cost + " "+ b5.h);
        BoxPrice b6 = new BoxPrice(12,23,34,45,56);

    }
}
