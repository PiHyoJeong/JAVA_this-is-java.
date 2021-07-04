package sec05.exam06_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoublePredicate;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
		new Student("ȫ�浿","����",70),
		new Student("ȫ��","����",60),
		new Student("�嵿","����",90),
		new Student("�嵿��","����",95)
		);
	
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum=0;
		for(Student student : list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
			
		}
		return (double)sum/count;
		
	}
	
	public static void main(String[] args) {
		double maleAvg = avg(t->t.getSex().equals("����"));
		System.out.println("�����л� ��� : "+ maleAvg );
		
		double femaleAvg = avg(t->t.getSex().equals("����"));
		System.out.println("�����л� ��� : " + femaleAvg);
		
	}
}
