package Practice04;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Test3 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test3 frame = new Test3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Test3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		// JPanel panel = new JPanel();
		// panel.setBackground(Color.LIGHT_GRAY);
		// contentPane.add(panel, BorderLayout.CENTER);

		// ���� �� ������ �ҷ�������� �̿��ؼ� notice �κ� ������ ��������

		// ������
		//String header[] = { "Name", "Tilte", "Date" };
		/*
		 * String[][] notice = { { "ȫ�浿", "17��ġ Ÿ�̾� ���� ���� �����ȹ ���� �ȳ�", "4124" }, {
		 * "��ƹ���", "CASPER STUDIO �ؿ�� � ���� �ȳ�", "12414" }, { "�̾ƹ���",
		 * "ĳ���� ��Ƽ�� ���� ������ ���� �����ȹ ���� �ȳ�", "124124" } };
		 */

		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(new PersonDTO("ȫ�浿", "17��ġ Ÿ�̾� ���� ���� �����ȹ ���� �ȳ�", "4124"));
		list.add(new PersonDTO("��ƹ���", "CASPER STUDIO �ؿ�� � ���� �ȳ�", "12414"));
		list.add(new PersonDTO("�̾ƹ���", "ĳ���� ��Ƽ�� ���� ������ ���� �����ȹ ���� �ȳ�", "124124"));

		Vector<String> vector = new Vector<String>();
		vector.addElement("Name");
		vector.addElement("Title");
		vector.addElement("Date");

		DefaultTableModel model = new DefaultTableModel(vector, 0) {

			public boolean isCellEditable(int r, int c) {

				return (c != 0) ? true : false;
			}
		};

		// ���̺� ����
		table = new JTable(model);

		// �� ���� ����
		DefaultTableCellRenderer cellAlignCenter = new DefaultTableCellRenderer();
		cellAlignCenter.setHorizontalAlignment(JLabel.CENTER);
		DefaultTableCellRenderer cellAlignRight = new DefaultTableCellRenderer();
		cellAlignRight.setHorizontalAlignment(JLabel.RIGHT);
		DefaultTableCellRenderer cellAlignLeft = new DefaultTableCellRenderer();
		cellAlignRight.setHorizontalAlignment(JLabel.LEFT);
		
		// �� �ʺ�� ���� ����
		table.getColumn("Name").setPreferredWidth(200);
		table.getColumn("Name").setCellRenderer(cellAlignCenter);

		table.getColumn("Title").setPreferredWidth(400);
		table.getColumn("Title").setCellRenderer(cellAlignLeft);

		table.getColumn("Date").setPreferredWidth(200);
		table.getColumn("Date").setCellRenderer(cellAlignCenter);

		table.setRowHeight(50);

		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		table.setLayout(null);
		
		for(PersonDTO data:list){
			Vector<String> v= new Vector<String>();
			v.add(data.getName());
			v.add(data.getTitle());
			v.add(data.getDate());
			model.addRow(v);
		}
		
		
		

		// ���̺� ��ũ�����̺� ��ȯ(Į���� �̷��� ����� �ߵ���)
		JScrollPane scrolledTable = new JScrollPane(table);
		// scrolledTable.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		scrolledTable.setBounds(0, 0, 600, 400);
		contentPane.add(scrolledTable);

		JPanel panel_1 = new JPanel();

		contentPane.add(panel_1, BorderLayout.SOUTH);

		JLabel lblNewLabel = new JLabel("Keyword search");
		panel_1.add(lblNewLabel);

		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);

		JButton searchButton = new JButton("Search!");

		panel_1.add(searchButton);

		// -------------------------------------------------

		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�˻�� �Է��ϼ���");
					textField.requestFocus();
				} else {
					// �˻� ����
					// db�� 2�� �ʿ������� ���� �ǹ��� ��

				}

			}
		});

		// Ư�� �� ���ý� �̺�Ʈ (���콺 ������)
		// �������̵� �� db�� �ִ� ���� �ѷ��ִ� �ڵ� �ʿ�.
		// https://kimsaemjava.tistory.com/58
		// �ش� �ּ� ����

	}
}

public class JTableCellEventTest extends JFrame implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {

		int row = table.getSelectedRow();
		int col = table.getSelectedColumn();
		for (int i = 0; i < table.getColumnCount(); i++) {
			System.out.print(table.getModel().getValueAt(row, i) + "\t");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}


class PersonDTO {
	private String name;
	private String title;
	private String date;

	public PersonDTO(String name, String title, String date) {
		this.name = name;
		this.title = title;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public String getTitle() {
		return title;
	}

	public String getDate() {
		return date;
	}

}
