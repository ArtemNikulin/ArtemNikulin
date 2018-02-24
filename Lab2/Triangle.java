public class Triangle{

     protected int a;
     public Triangle(int a){
        this.a = a;     
     }
     
     public float square(){
      float square = (float)(a*a*1.732)/4;
      return square;
     }
}
   