package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    private static Scanner sc;

	public static void main(String[] args) {
    sc = new Scanner(System.in);



    Student_1 one = new Student_1();
    
    boolean x = true;
    while(x == true){
    String lesson; 
         System.out.println("[LIST]");
         System.out.println("1) Math");
         System.out.println("2) Eng");
         System.out.println("3) Prog");
         System.out.println("0) End session.");
         
    System.out.println("Enter num to add lesson from the list ");
    int numLesson = sc.nextInt();
        switch (numLesson) {
            case 1:
                lesson = "Math";
                break;
            case 2:
                lesson = "Eng";
                break;
            case 3:
                lesson = "Prog";
                break;
                case 0:
                x = false;
                lesson = " ";
                break;
            default:
                System.out.println("Error");
                lesson = " ";
                break;
        }
    System.out.println("Enter num of hours: ");
    int hours = sc.nextInt();
    one.addLesson(lesson, hours);
    one.ShowSch();
    }
        
    
    
    
    
    
    
    }
        

}
