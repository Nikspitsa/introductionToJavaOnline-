package by.jonline.lec01.v01;

/*
 * @author Nik
 * Task:
 * calculate 1/(x^3+6) if x>3, else x^2-3*x+9
 */
public class HomeworkLec01TaskB05ver01 {

	public static void main(String[] args) {
		double F,x=2;
		
		if (x>3)
			F=1/(Math.pow(x,3)+6);
		else 
			F=Math.pow(x,2)-3*x+9;
		
		System.out.println(F);

	}

}
