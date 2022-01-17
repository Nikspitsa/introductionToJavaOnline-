package by.jonline.lec01.v01;

/*
 * @author Nik
 * Task
 * Find max{min(a,b),min(c,d)}
 */
public class HomeworkLec01TaskB02ver01 {

	public static void main(String[] args) {
		int a=3,b=12,c=8,d=7;
		int max,minA,minB;
		if (a<b)
			minA = a;
		else 
			minA = b;
		
		if (c<d)
			minB = c;
		else
			minB = d;
		
		if (minA>minB)
			max = minA;
		else
			max = minB;
		
		System.out.print(max);
	}

}
