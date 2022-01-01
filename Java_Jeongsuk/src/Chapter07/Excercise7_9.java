package Chapter07;

import java.awt.Frame;
import java.awt.event.*;

//�Ʒ��� EventHandler�� �͸� Ŭ������ ����

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

//������
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