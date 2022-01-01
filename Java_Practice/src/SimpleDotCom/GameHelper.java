package SimpleDotCom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
	
	public String getUserInput(String prompt) {
		
		// 참조 : https://st-lab.tistory.com/41
		
		String inputLine = null;
		System.out.print(prompt + " ");
		
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = Integer.valueOf(str);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		/*
		int inputLine = 0;
		String str="";
		
		System.out.print(prompt + " ");
		
		
		
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			str = is.readLine();
			inputLine = Integer.valueOf(str);
			System.out.println("inputLine:"+inputLine);
			if (str==null&&str=="") 
				//return null;
				throw new Exception();
			
		} catch (Exception e) {
			System.out.println("IOException : 나오는건가" + e);
		}
		return str;
		
		*/
	}

}
