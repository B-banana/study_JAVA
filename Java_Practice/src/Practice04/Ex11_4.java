package Practice04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.*;

public class Ex11_4 {

	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;

	public static void main(String[] args) {

		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");

		while (true) {

			System.out.println(">>");

			try {
				// ȭ�����κ��� ���δ����� �Է¹޴´�.
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim(); // trim : ���� ����

				if ("".equals(input))
					continue;

				if (input.equalsIgnoreCase("q")) { // equlasIgnoreCase : ��ҹ��� �������� ��
					System.exit(0);
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println(" help - ������ �����ݴϴ�.");
					System.out.println(" Q �Ǵ� q - ���α׷��� �����մϴ�.");
					System.out.println(" history - �ֱٿ� �Է��� ��ɾ " + MAX_SIZE + "�� �����ݴϴ�.");
				} else if (input.equalsIgnoreCase("history")) {

					int i = 0;

					save(input);

					LinkedList tmp = (LinkedList) q;
					ListIterator it = tmp.listIterator();

					while (it.hasNext())
						System.out.println(++i + "." + it.next());

				} else {
					save(input);
					System.out.println(input);
				}

			} catch (Exception e) {
				System.out.println("�Է¿����Դϴ�.");
			}
		}
	}

	public static void save(String input) {

		if (!"".equals(input)) {
			q.offer(input);
		}

		if (q.size() > MAX_SIZE) {
			q.remove();
		}
	}

}
