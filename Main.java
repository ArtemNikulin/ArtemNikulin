import java.util.Scanner;
public class Main {
	private static Scanner input;
	private static Scanner scanner;
	public static void main(String[] args) {
        scanner = new Scanner(System.in);
        Drink d;
        System.out.println("������� ���� \n 1 - ����\n 2 - ���\n");        
        switch (scanner.nextInt()){

            case 1: d = new Coffee(); res(d);
                break;
            case 2: d = new Tea(); res(d);
                break;
        }
    }
    public static void res(Drink b){
        input = new Scanner(System.in);
        System.out.println("������� ������� �� �����:");
        System.out.println(" 1 - ������\n 2 - �����\n");
            switch (input.nextInt()) {
                case 1:
                    b = new Milk(b);
                    break;
                case 2:
                    b = new Sugar(b);
                    break;
                            }
        System.out.println(b.description()+", � ��� "+b.cost());
    }
}