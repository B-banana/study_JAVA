package Chapter07;

import java.awt.Frame;
import java.awt.event.*;

//아래의 EventHandler를 익명 클래스로 변경

public class Excercise7_9 {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});

	}
	
}

//변경전
/*
public class Excercise7_9 {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.addWindowListener(new EventHandler());
	}
	
}

class EventHandler extends WindowAdapter {
	
	public void windowClosing(WindowEvent e) {
		
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);
	}
}
*/