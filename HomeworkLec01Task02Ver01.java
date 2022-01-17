package by.jonline.lec01.v01;

/*
 * @author Nik
 * Task:
 * Calculate z=(b+Sqrt(b^2+4ac))/2a-a^3*c+b^-2
 */
public class HomeworkLec01Task02Ver01 {
	public static void main (String[] args) {
		double a=1,b=1,c=1,z;
		
		// Math.pow(a,b)
		// first argument raised to the power of the second argument
	// calculate b^2
		double pow1 = Math.pow(b,2);
	// calculate b^-2
		double pow2 = Math.pow(b,-2);
	// calculate a^3
		double pow3 = Math.pow(a,3);
		double sqrt = Math.sqrt(pow1+4*a*c);
			
			z=(b+sqrt)/2*a-pow3*c+pow2;
			
		System.out.print(z);
	}

}
