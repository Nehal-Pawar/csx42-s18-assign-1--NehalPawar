package myArrayList.util;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileProcessor {
	FileReader F = null;
	BufferedReader BR = null;

	public void openFile(String InputFileName) {
		try {
			F = new FileReader(InputFileName);
			BR = new BufferedReader(F);
		}
		catch (Exception e) {
		 System.out.println("Error" + e.toString());
		System.exit(1);
		 }
	}
	public String readLine() {
		String line = null;
		try {
			line = BR.readLine();
		}
		catch (Exception e) { 
		System.out.println("Error while reading file");
		System.exit(1);
		 }
		return line;
	}
}
