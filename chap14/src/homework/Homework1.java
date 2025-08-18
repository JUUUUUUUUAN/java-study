package homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Homework1 {

	public static void main(String[] args) {
		
		
		
	}

	static void method1 (String song) throws Exception {
		String path = "C:\\\\test\\\\sub/";
		File dir = new File(path);
		File txtFile = new File(path + "나비야1.dat");
		
		if (!dir.exists()) dir.mkdirs();
		
		OutputStream os = new FileOutputStream("C://test//sub");
		
		
	}
}
