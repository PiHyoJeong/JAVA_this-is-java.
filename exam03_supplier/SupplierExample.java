package chap14.sec05_exam02;

import java.util.function.IntSupplier;

public class SupplierExample {

	public static void main(String[] args) {
		//람다식
		IntSupplier intSupplier = ()->{
			int num = (int)(Math.random()*6)+1;
			return num;		
		};
		
		
		int num = intSupplier.getAsInt();
		System.out.println("눈의 수 : " + num);

	}

}
