package Practice04;

import java.awt.*;
import java.awt.event.*;	//�� ������ �Է�

public class Round19_Ex01 {

	public static void main(String[] args) {
		
		Round19_Ex01_Sub round = new Round19_Ex01_Sub();
	}

}

class Round19_Ex01_Sub extends Frame {
	
	private Button bt = new Button("�ݱ�");	//�ν��Ͻ� ����
	
	public Round19_Ex01_Sub() {	//������
		super("Event!");	//���� Ŭ���� Frame, Frame(String)
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
		//Event�� ������ ó���� �κ�
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
