	import java.util.Scanner;
	public class Main {
    private static Scanner input;
	private static int order;
	private static int cond;
	public static void main(String[] args) {
        input = new Scanner(System.in);
	    Command lightOff = new LightOff(new Light());
        Command lightOn = new LightOn(new Light());
        Command CondRun = new CondRun(new Condition());
        Command CondStop = new CondStop(new Condition());
        System.out.println("1 -- �������� �����, 2 -- ��������");
        order = input.nextInt();
        if(order == 1){
        lightOn.execute();
        }
        else if(order == 2){
        lightOff.execute();
        }
        System.out.println("1 -- �������� �����������, 2 -- �������� �����������");
        cond = input.nextInt();
        if(cond == 1){
        CondRun.execute();
        }
        else if(cond == 2){
        CondStop.execute();
        }
    }
}
