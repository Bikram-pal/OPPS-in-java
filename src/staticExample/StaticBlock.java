package staticExample;

//this is a demo to show initialization of static variables
public class StaticBlock {
    static int a = 4;
    static int b;

    static{
        System.out.println("I ma in static block");
        b = a*4;
    }


    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.b);
    }
}
