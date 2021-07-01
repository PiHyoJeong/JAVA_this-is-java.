package chap14.sec05_exam03;

public class Student {

	private String Name;
	private int englishScore;
	private int mathScore;
	private int subjectTotal;
	
	
	public Student(String name, int englishScore, int mathScore) {
		super();
		Name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}


	public String getName() {
		return Name;
	}


	public int getEnglishScore() {
		return englishScore;
	}


	public int getMathScore() {
		return mathScore;
	}
	
	public int getSubjectTotal() {
		subjectTotal = englishScore + mathScore; 
		return subjectTotal;
	}
	
	
	
}
