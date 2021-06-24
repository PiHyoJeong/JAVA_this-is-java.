package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepThread extends Thread{
	@Override
	public void run() {
		//비프음을 5번 반복하는 소리
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0 ; i < 5 ; i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
