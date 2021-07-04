package sec05.exam04_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	private static List<Student> list = Arrays.asList(
			new Student("È«±æµ¿",90,80),
			new Student("È«µ¿",95,85)
			);
	
	private static double avg(ToIntFunction<Student> function) {
		int sum = 0; 
		for(Student student:list) {
			sum += function.applyAsInt(student);
		}
		double avg = (double)sum/list.size();
		return avg;
	}
	
	public static void main(String[] Args) {
		double englishAvg = avg(t->t.getEnglishScore());
		System.out.println("¿µ¾îÆò±ÕÁ¡¼ö : " + englishAvg);
		
		double mathAvg = avg(t->t.getMathScore());
		System.out.println("¼öÇÐÆò±ÕÁ¡¼ö : " + mathAvg);
		
	}

	
}
