import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("��� ��� �� ������?\n 1 - �������� \n 2 - ������ \n ");
        Factory smallPizza = new SmallPizza();
        Factory bigPizza = new BigPizza();
        switch (input.nextInt()){
        case 1: System.out.print("��� ��� �� ������?\n 1 - �������������\n 2 - � ����� \n ");
        if (input.nextInt() == 1)
           smallPizza.makePizza("�������������");
        else
           smallPizza.makePizza("� �����");
        break;
        case 2: System.out.print("��� ��� �� ������?\n 1 - �������������\n 2 - � ����� \n ");
        if (input.nextInt() == 1)
           bigPizza.makePizza("�������������");
        else
           bigPizza.makePizza("� �����");
        break;
        }
    }
}