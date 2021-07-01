package chap14.sec05_exam03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿",90,96),
			new Student("�ſ��",95,93)
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
		System.out.println("[�л��̸�]");
		printString(t->t.getName());
		
		System.out.println("\n" + "[��������]");
		printInt(t->t.getMathScore());
		
		System.out.println("[��������]");
		printInt(t->t.getEnglishScore());

		System.out.println("[�����������]");
		double englishAvg = avg(s->s.getEnglishScore());
		System.out.println(englishAvg + "\n");

		System.out.println("[�����������]");
		double mathAvg = avg(s->s.getMathScore());
		System.out.println(mathAvg+ "\n");
		
		System.out.println("[��ü��������]");
		int subjectTotal = subTotal(t -> t.getSubjectTotal());
		System.out.println(subjectTotal);
		
		/*
		 * System.out.println("[�� ���� �ջ�]"); int sumScore =
		 * printSum((e,m)->e.getEnglishScore()+m.getMathScore());
		 * System.out.println(sumScore);
		 */
		
	}
			

}
