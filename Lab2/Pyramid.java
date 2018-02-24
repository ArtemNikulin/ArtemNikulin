
public class Pyramid extends Triangle{
     
     protected int height;
     public Pyramid(int height, int a){
        super(a);
        this.height = height;     
     }
     @Override
     public float square(){
        float square = (float) ((a*a*1.732)/4 + (a+a+a)/2);
        return square;
     }
}

