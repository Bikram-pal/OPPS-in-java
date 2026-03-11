package properties.inheritance;

public class BoxPrice extends BoxWeight {
    double cost;
    BoxPrice(){
        super();
        cost = -1;
    }
    BoxPrice(int l, int w, int h, int we, double cost){
        super(l,w,h,we);
    }
}
