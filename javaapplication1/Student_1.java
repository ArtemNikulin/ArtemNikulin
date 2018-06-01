package javaapplication1;

import java.util.ArrayList;
public class Student_1 {
	   static int limit = 1000;
	    protected int hours;
	    ArrayList<String> Lessons = new ArrayList<>();



	public void addLesson(String lesson, int hr){
            
	                limit -= hr;
	                Lessons.add(lesson);}


	public void ShowSch() {
            System.out.println(" ");
            System.out.println("Lessons: ");
	    for(int i = 0; i != Lessons.size(); i++) {
	        System.out.println(Lessons.get(i));
	        }
	        System.out.println("Free hours left: " + limit);

	}
}
