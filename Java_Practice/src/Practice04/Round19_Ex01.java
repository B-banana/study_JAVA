package Practice04;

import java.awt.*;
import java.awt.event.*;	//꼭 별도록 입력

public class Round19_Ex01 {

	public static void main(String[] args) {
		
		Round19_Ex01_Sub round = new Round19_Ex01_Sub();
	}

}

class Round19_Ex01_Sub extends Frame {
	
	private Button bt = new Button("닫기");	//인스턴스 생성
	
	public Round19_Ex01_Sub() {	//생성자
		super("Event!");	//상위 클래스 Frame, Frame(String)
		this.init();
		this.start();
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public void init() {
		
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints gc = new GridBagConstraints();
		
		this.setLayout(gridbag);
		
		gridbag.setConstraints(bt, gc);
		this.add(bt);
	}
	
	public void start() {
		//Event나 쓰레드 처리할 부분
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
