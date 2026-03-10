package staticExample;

public class InnerClasses {
    static class Name{
        String name;
        Name(String name)
        {
            this.name = name;
        }

    }

    public static void main(String[] args) {
        Name a = new Name("bikram");
        System.out.println(a.name);
    }
}
