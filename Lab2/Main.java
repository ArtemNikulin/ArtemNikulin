import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("������ ������� ����������");
     int a = input.nextInt();
     Triangle triangle = new Triangle(a);
     System.out.println("������ ������ ������");
     int height = input.nextInt();
     Pyramid pyramid = new Pyramid(a, height);
     System.out.println("����� ����������: " + triangle.square());
     System.out.println("\n" + "����� ������� ������: " + pyramid.square());
  }
}