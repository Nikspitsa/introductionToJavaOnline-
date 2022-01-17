package by.jonline.lec01.v01;

/*
 * @author Nik
 * Task:
 * Here natural number t is number past time in seconds. Convert it to "ЧЧч MMмин ССс"
 */
public class HomeworkLec01Task05Ver01 {
	public static void main (String[] args) {
		int t=768908;
		int a = t/3600;
		int b = (t-a*3600)/60;
		int c = t-a*3600-b*60;
		System.out.println(a + "ч " + b + "мин " + c + "с " );
		
	}

}
