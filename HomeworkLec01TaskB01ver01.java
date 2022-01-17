package by.jonline.lec01.v01;

/*
 * @author Nik
 * Task:
 * Here two angels. Does a triangle exist? Does a triangle is right triangle?
 */
public class HomeworkLec01TaskB01ver01 {

	public static void main(String[] args) {
		double a=10 , b = 80;
		//sum of all corners in triangle =180 degrees
		if ((a+b)<180) {
			System.out.println("triangle exist");
			
		// if one of angle is 90 degrees triangle is right triangle
		if (a == 90 || b ==90)
			System.out.println("right triangle");
		else if ((180-(a+b))== 90)
			System.out.println("right triangle");
		else 
			System.out.println("not a right triangle");
		}
		else
			System.out.println("triangle not exist");
			
		
	}

}
