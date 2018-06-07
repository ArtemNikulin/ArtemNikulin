public class Main {

    public static void main(String[] args) {

        System.out.println("Redhead Duck:");
        Duck red = new RedheadDuck();
        red.performSwim();
        red.performQuack();
        red.performFly();

        System.out.println("Simple Duck:");
        Duck simple = new SimpleDuck();
        simple.performSwim();
        simple.performQuack();

    }
}
