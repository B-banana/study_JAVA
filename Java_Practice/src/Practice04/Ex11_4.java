package Practice04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.*;

public class Ex11_4 {

	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;

	public static void main(String[] args) {

		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

		while (true) {

			System.out.println(">>");

			try {
				// 화면으로부터 라인단위로 입력받는다.
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim(); // trim : 공백 제거

				if ("".equals(input))
					continue;

				if (input.equalsIgnoreCase("q")) { // equlasIgnoreCase : 대소문자 구별없이 비교
					System.exit(0);
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다.");
					System.out.println(" Q 또는 q - 프로그램을 종료합니다.");
					System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
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
				System.out.println("입력오류입니다.");
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
