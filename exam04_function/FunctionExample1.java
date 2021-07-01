package chap14.sec05_exam03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동",90,96),
			new Student("신용권",95,93)
			);
	
	public static void printString(Function<Student,String> function) {
		for(Student student : list) {
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) {
			System.out.println(function.applyAsInt(student)  + " ");
		}
		System.out.println();
	}
	
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : list) {
			sum += function.applyAsInt(student);
		}
		double avg = (double) sum/list.size();
		return avg;
	}
	
	public static int subTotal(ToIntFunction<Student> function) {
		int sum = 0 ;
		for(Student student : list) {
			sum += function.applyAsInt(student);
		}
		return sum;
	}
	
	/*
	 * public static int printSum(ToIntBiFunction<Student,Student> function) { int
	 * sum = 0; for(Student student : list) { sum +=
	 * function.applyAsInt(student,student); } return sum; }
	 */
	
			
	
	public static void main(String[] args) {
		System.out.println("[학생이름]");
		printString(t->t.getName());
		
		System.out.println("\n" + "[수학점수]");
		printInt(t->t.getMathScore());
		
		System.out.println("[영어점수]");
		printInt(t->t.getEnglishScore());

		System.out.println("[영어평균점수]");
		double englishAvg = avg(s->s.getEnglishScore());
		System.out.println(englishAvg + "\n");

		System.out.println("[수학평균점수]");
		double mathAvg = avg(s->s.getMathScore());
		System.out.println(mathAvg+ "\n");
		
		System.out.println("[전체과목점수]");
		int subjectTotal = subTotal(t -> t.getSubjectTotal());
		System.out.println(subjectTotal);
		
		/*
		 * System.out.println("[총 점수 합산]"); int sumScore =
		 * printSum((e,m)->e.getEnglishScore()+m.getMathScore());
		 * System.out.println(sumScore);
		 */
		
	}
			

}
