package Practice04;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
	
	String name = "";
	int ban;
	int no;
	
	public Student(String name, int ban, int no) {
		
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}


public class Ex12_2 {
	

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("�ڹٿ�", 1, 1));
		list.add(new Student("�ڹ�¯", 1, 2));
		list.add(new Student("ȫ�浿", 2, 1));
		
		Iterator<Student> it = list.iterator();
		
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s.name);
			
		}
		
	}

}
