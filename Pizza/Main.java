import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Яку піцу ви хочете?\n 1 - Маленьку \n 2 - Велику \n ");
        Factory smallPizza = new SmallPizza();
        Factory bigPizza = new BigPizza();
        switch (input.nextInt()){
        case 1: System.out.print("Яку піцу ви хочете?\n 1 - Вегетаріанська\n 2 - З салямі \n ");
        if (input.nextInt() == 1)
           smallPizza.makePizza("Вегетаріанська");
        else
           smallPizza.makePizza("З салямі");
        break;
        case 2: System.out.print("Яку піцу ви хочете?\n 1 - Вегетаріанська\n 2 - З салямі \n ");
        if (input.nextInt() == 1)
           bigPizza.makePizza("Вегетаріанська");
        else
           bigPizza.makePizza("З салямі");
        break;
        }
    }
}