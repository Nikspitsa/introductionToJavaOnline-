package by.jonline.lec01.v01;

/*
 * @author Nik
 * Task:
 * given a hole with sides A and B. will the brick with the sides x,y,z pass through it?
 */

public class HomeworkLec01TaskB04Ver01 {

	public static void main(String[] args) {
		int A=4,B=5;
		int x=2,y=3,z=10;
		
		if ((A<=x || A<=y || A<=z)&&(B!=A)&&(B<=x || B<=y || B<=z))
			System.out.print("пролазит");
		else 
			System.out.print("нет");
	}

}
