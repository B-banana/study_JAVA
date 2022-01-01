package Practice04;

import java.awt.BorderLayout;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.util.ArrayList;



import javax.swing.ButtonGroup;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JRadioButton;

import javax.swing.JScrollPane;

import javax.swing.JTable;

import javax.swing.JTextField;

import javax.swing.table.DefaultTableModel;



public class TableTest2 extends JFrame {

	

	ArrayList<MemberVO> members = new ArrayList<MemberVO>();

	

	public TableTest2() {

				

		setTitle("ȸ�� ��� �߰����� ���α׷�");

		setDefaultCloseOperation(EXIT_ON_CLOSE);		

		setAlwaysOnTop(true);

		setBounds(200, 100, 400, 200);

		

		//ǥ ������

		String[] colNames = new String[] {"Name", "Age", "Gender"};

		//ǥ�� �� �����͵�.. /ó���� �� ���̺� ����� ����.. �����Ͱ�����ü ����

		DefaultTableModel model = new DefaultTableModel(colNames, 0);

		

		JTable table = new JTable(model);

		JScrollPane scrollPane = new JScrollPane(table);

		add(scrollPane, BorderLayout.CENTER);

		

		//���̺� �Ʒ��ʿ� ������ �Է� �Ҽ��ִ� �г�

		JPanel bottomPanel = new JPanel();

		bottomPanel.setLayout(new GridLayout(2, 1));

		

		JPanel panel = new JPanel();

		JTextField tfName = new JTextField(6);

		JTextField tfAge = new JTextField(3);

		JRadioButton rb1 = new JRadioButton("Female");

		JRadioButton rb2 = new JRadioButton("male");

		JRadioButton rb3 = new JRadioButton();

		ButtonGroup rg = new ButtonGroup();

		rg.add(rb1);	rg.add(rb2); rg.add(rb3);

		rb1.setSelected(true);

		

		panel.add(new JLabel("NAME"));

		panel.add(tfName);

		panel.add(new JLabel("AGE"));

		panel.add(tfAge);

		panel.add(rb1);		panel.add(rb2);

		bottomPanel.add(panel);

		

		JPanel panel2 = new JPanel();

		JButton btnAdd = new JButton("Add");

		JButton btnDel = new JButton("Delete");

		panel2.add(btnAdd);	panel2.add(btnDel);

		bottomPanel.add(panel2);		

		

		btnAdd.addActionListener(new ActionListener() {			

			@Override

			public void actionPerformed(ActionEvent e) {

				//�Էµ� �� ���̺� �߰��ϱ�

				//�Էµ� ������ ���� ������ ���(�迭)�� �������� ��    ����

				String[] rows = new String[3];

				rows[0] = tfName.getText();

				rows[1] = tfAge.getText();

				if(rb1.isSelected()) rows[2] = "female";

				else rows[2] = "male";

				model.addRow(rows); //���ٴ����θ� ���� �����ϹǷΡ��

				

				//�Է��� �ؽ�Ʈ �ʵ� �� ����

				tfName.setText("");

				tfAge.setText("");

				rb3.setSelected(true); //���� �ʱ�ȭ

				

				//��� ����Ʈ�� ��� ��ü �߰�

				String name = rows[0];

				int age = Integer.parseInt(rows[1]);

				String gender = rows[2];

				members.add(new MemberVO(name, age, gender));

				System.out.println("ȸ�� ����:" + members.size());

			}

		});		

		//������ �� �����

		btnDel.addActionListener(new ActionListener() {			

			@Override

			public void actionPerformed(ActionEvent e) {

				//������ ��(row)�� ��ȣ �˾Ƴ���

				int rowIndex = table.getSelectedRow();

				//���� ���ϰ� ���� ��� ���ϰ� -1

				if(rowIndex == -1) return;

				model.removeRow(rowIndex);

								

				members.remove(rowIndex); //������ �����

				System.out.println("ȸ�� ����:" + members.size());

			}

		});		

		

		add(bottomPanel,BorderLayout.SOUTH);		

		setVisible(true);

	}

	class MemberVO { //ȸ�� 1�� ���� �����ϴ� Ŭ���� : ������ ������ �����

		private String name;  //VOŬ����

		private int age;

		private String gender;

		public MemberVO(String name, int age, String gender) {

			this.name = name;

			this.age = age;

			this.gender = gender;

		}

	}



	public static void main(String[] args) {

		new TableTest2();

	}

}