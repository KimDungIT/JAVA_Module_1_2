package module1_chapter9IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadFileByByte {

	public static void main(String[] args) throws FileNotFoundException {
		InputStream in = new FileInputStream("./src/test.txt");
		
		Byte b[] = new Byte[3];
		//int ch;
		/*while(in.read(b)!=-1)
		{
			
		}*/

	}

}
