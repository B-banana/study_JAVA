package Chapter16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Jukebox1 {
	
	ArrayList<String> songList = new ArrayList<String>();

	public static void main(String[] args) {
		
		new Jukebox1().go();
	}
	
	public void go() {
		
		getSongs();
		System.out.println(songList);
	}
	
	void getSongs() {
		
		try {
			File file = new File("E:/document/LKC_Workspace/JAVA/Java_HeadFirstJava/src/Chapter16/SongList.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				addSong(line);
			}
			reader.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	void addSong(String lineToParse) {
		
		String[] tokens = lineToParse.split("/");
		songList.add(tokens[0]);
	}

}
