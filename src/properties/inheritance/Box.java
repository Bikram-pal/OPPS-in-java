package properties.inheritance;

public class Box {
    int h, w, l;
    Box(){
        h = -1;
        w = -1;
        l = -1;
    }
    Box(int Side){
        h = Side;
        w = Side;
        l = Side;
    }
    Box(int h, int w, int l){
        this.h = h;
        this.w = w;
        this.l = l;
    }

}
