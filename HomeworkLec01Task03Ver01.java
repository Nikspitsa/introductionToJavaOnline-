package by.jonline.lec01.v01;

/**
 * @author Nik
 * task:
 * calculate z=(sin(x)+cos(y))/(cos(x)-sin(y))*tg(x*y)
 */

public class HomeworkLec01Task03Ver01 {
	public static void main(String[] args) {
		// value angles x,y in radians
		double x =0.523599;
		double y =0.523599;
		double z;
		double sinX = Math.sin(x);
		double cosY = Math.cos(y);
		double cosX = Math.cos(x);
		double sinY = Math.sin(y);
		double tgXY = Math.tan(x*y);
			
		z=(sinX+cosY)/(cosX-sinY)*tgXY;
		
		System.out.println(z);
	}

}




		
		
	
