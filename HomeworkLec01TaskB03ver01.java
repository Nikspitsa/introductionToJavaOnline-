package by.jonline.lec01.v01;

/*
 * @author Nik
 * Task:
 * A(x1,y1),B(x2,y2),C(x3,y3)
 * Dose A,B,C on the same line?
 */

public class HomeworkLec01TaskB03ver01 {
	public static void main (String[] args) {
		int x1=1,x2=2,x3=4;
		int y1=1,y2=2,y3=4;
		
		boolean z=((x3-x1)/(x2-x1))==((y3-y1)/(y2-y1));
		
		if (z)
			System.out.println("A,B,C on the same line");
			else 
			System.out.println("A,B,C is not on the same line");
		
				
	}

}
