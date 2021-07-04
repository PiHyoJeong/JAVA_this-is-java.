package sec05.exam06_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoublePredicate;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
		new Student("홍길동","남자",70),
		new Student("홍동","여자",60),
		new Student("장동","남자",90),
		new Student("장동동","여자",95)
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
		double maleAvg = avg(t->t.getSex().equals("남자"));
		System.out.println("남자학생 평균 : "+ maleAvg );
		
		double femaleAvg = avg(t->t.getSex().equals("여자"));
		System.out.println("여자학생 평균 : " + femaleAvg);
		
	}
}
