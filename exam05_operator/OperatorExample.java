package sec05.exam05_operator;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = {96,94,80};
	
	private static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(score, result);
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		int max = maxOrMin(
			(a,b)->{
				if(a>b) return a;
				else return b;
			}
		);
		System.out.println("최대값 : " +max);
		
		int min = maxOrMin(
			(a,b)->{
				if(a<b) return a;
				else return b;
			}
		);
		System.out.println("최소값:" +min);
	}
	
	

}
