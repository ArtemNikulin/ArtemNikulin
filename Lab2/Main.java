import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("¬вед≥ть сторону трикутника");
     int a = input.nextInt();
     Triangle triangle = new Triangle(a);
     System.out.println("¬вед≥ть висоту п≥рам≥ди");
     int height = input.nextInt();
     Pyramid pyramid = new Pyramid(a, height);
     System.out.println("ѕлоща трикутника: " + triangle.square());
     System.out.println("\n" + "ѕлоща поверхн≥ п≥рам≥ди: " + pyramid.square());
  }
}