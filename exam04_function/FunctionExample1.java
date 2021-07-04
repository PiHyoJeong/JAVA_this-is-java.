package sec05.exam04_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동",90,80),
			new Student("홍동",95,85)
			);
	
	private static void printString(Function<Student,String> function) {
		for(Student student : list) {
			System.out.print(function.apply(student)+" ");
		}
		System.out.println();
	}
	
	private static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) {
			System.out.print(function.applyAsInt(student)+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] Args) {
		System.out.println("[이름]");
		printString(t-> t.getName());
		
		System.out.println("[영어점수]");
		printInt(t-> t.getEnglishScore());
		
		System.out.println("[수학점수]");
		printInt(t->t.getMathScore());
	}

	
}
