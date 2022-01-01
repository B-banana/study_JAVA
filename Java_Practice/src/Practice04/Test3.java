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

		// 벡터 및 데이터 불러오기들을 이용해서 notice 부분 데이터 가져오기

		// 셀정의
		//String header[] = { "Name", "Tilte", "Date" };
		/*
		 * String[][] notice = { { "홍길동", "17인치 타이어 공급 관련 생산계획 조정 안내", "4124" }, {
		 * "김아무개", "CASPER STUDIO 해운대 운영 종료 안내", "12414" }, { "이아무개",
		 * "캐스퍼 액티브 수요 증가에 따른 생산계획 조정 안내", "124124" } };
		 */

		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(new PersonDTO("홍길동", "17인치 타이어 공급 관련 생산계획 조정 안내", "4124"));
		list.add(new PersonDTO("김아무개", "CASPER STUDIO 해운대 운영 종료 안내", "12414"));
		list.add(new PersonDTO("이아무개", "캐스퍼 액티브 수요 증가에 따른 생산계획 조정 안내", "124124"));

		Vector<String> vector = new Vector<String>();
		vector.addElement("Name");
		vector.addElement("Title");
		vector.addElement("Date");

		DefaultTableModel model = new DefaultTableModel(vector, 0) {

			public boolean isCellEditable(int r, int c) {

				return (c != 0) ? true : false;
			}
		};

		// 테이블 생성
		table = new JTable(model);

		// 셀 정렬 여부
		DefaultTableCellRenderer cellAlignCenter = new DefaultTableCellRenderer();
		cellAlignCenter.setHorizontalAlignment(JLabel.CENTER);
		DefaultTableCellRenderer cellAlignRight = new DefaultTableCellRenderer();
		cellAlignRight.setHorizontalAlignment(JLabel.RIGHT);
		DefaultTableCellRenderer cellAlignLeft = new DefaultTableCellRenderer();
		cellAlignRight.setHorizontalAlignment(JLabel.LEFT);
		
		// 셀 너비와 정렬 선택
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
		
		
		

		// 테이블 스크롤테이블 전환(칼럼이 이래야 제대로 잘동함)
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
					JOptionPane.showMessageDialog(null, "검색어를 입력하세요");
					textField.requestFocus();
				} else {
					// 검색 구현
					// db가 2개 필요한지에 대한 의문이 듬

				}

			}
		});

		// 특정 셀 선택시 이벤트 (마우스 리스너)
		// 오버라이딩 후 db에 있는 내용 뿌려주는 코딩 필요.
		// https://kimsaemjava.tistory.com/58
		// 해당 주소 참고

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
