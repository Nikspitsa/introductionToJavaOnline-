package by.jonline.lec01.v01;

/* 
* @author Nik
* Task:
* given a real number nnn.ddd. swap whole and fractional parts (ddd.nnn)
*/

public class HomeworkLec01Task04Ver01 {
	public static void main (String[] args) {
		double temp2,temp1,resoult,x = 123.456;
		
		int temp;
		
		//cut whole part (explicit type conversion)
		temp = (int)x;
		
		//move whole part to fractional (Implicit type conversion)
		temp2 =temp*0.001;
		
		//move fractional part to whole and cut whole
		temp1=(int)((x-temp)*1000);
		
		//collect new whole and fractional parts
		resoult = temp1+temp2; 
		System.out.println(resoult);
		
		
		resoult =(x*1000)%1000 + (int)x/1000.0;
	    System.out.println(resoult);
		
	}

}
