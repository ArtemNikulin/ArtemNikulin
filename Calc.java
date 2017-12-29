import java.util.Scanner;
 
public class Calc {
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        int num1 = getInt();
        char operation = getOperation();
        int num2 = getInt();
        int result = calc(num1,num2,operation);
        System.out.println("Result: "+result);
    }
 
    public static int getInt(){
        System.out.println("Input number:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Error during number input. Try again");
            scanner.next();
            num = getInt();
        }
        return num;
    }
 
    public static char getOperation(){
        System.out.println("Input operation(+,-,/,*):");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Input during operation input. Input +,-,/ or *");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
 
    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Operation unidentified. Retry input");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}