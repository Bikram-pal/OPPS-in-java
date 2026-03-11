package properties.inheritance;

public class BoxWeight extends Box{
    int weight;
    BoxWeight(){
        weight = -1;
    }
    BoxWeight(int l, int w, int h, int weight)
    {
        super(w,l,h);
        this.weight = weight;
    }
    BoxWeight(int side, int weight)
    {
        super(side);
        this.weight = weight;

    }
}
