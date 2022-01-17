package by.jonline.lec01.v01;

/* 
 * @author Nik
 * Task:
 * Does the point belong to the given area? if yes print "true" and "false" if not
 * x1= -2;2
 * y1= 0;4
 * x2= -4;4
 * y2= -3;0
 */ 

public class HomeworkLec01Task06ver01 {

	public static void main(String[] args) {
		 int x = 0,y = -1;
		 if (x >= -2 && x <=2 && y >=0 && y <=4)
			 System.out.println("true");
		 	else if (x >= -4 && x <= 4 && y >= -3 && y <= 0)
		 			System.out.println("true");
		 		else
		 			System.out.println("false");
		

	}

}
