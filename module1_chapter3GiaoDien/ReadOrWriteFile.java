package module1_chapter3GiaoDien;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ReadOrWriteFile {
	
public static void writeTXT(String strInput) {
		
	}
	
	public static String readTXT(File myFile) throws IOException {
		String strOutput = "";
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(myFile.getPath());
			br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine()) != null) {
				strOutput = strOutput + line + "\n";
			}
		}
		catch(FileNotFoundException e) {
			
		}
		catch(IOException e) {
			JOptionPane.showMessageDialog(null, "IOException occurred!", "Error!", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Exception occurred!", "Error!", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		finally {
			if(fr != null) fr.close();
			if(br != null) br.close();
		}
		return strOutput;
	}

}
