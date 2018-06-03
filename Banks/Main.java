import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Bank banks [] = new Bank[3];
        banks [0] = new Privatbank();
        banks [1] = new Alfabank();
        banks [2] = new Pumb();
        System.out.println("Enter your deposit: ");
        int deposit = input.nextInt();
        for(int i = 0;i < 3; i++){
            banks[i].deposit(deposit);        
            banks[i].withdraw(deposit);
            banks[i].deposit(deposit);
            System.out.println(banks[i].account());
        }
    }
}