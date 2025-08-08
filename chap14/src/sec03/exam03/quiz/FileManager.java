package sec03.exam03.quiz;

import java.io.File;

public class FileManager {
	
	public void deleteFile(File dir) {
		File[] contents = dir.listFiles();
		
		for (File f : contents) {
			if (f.isFile()) {
				f.delete();
				System.out.println(f.getPath() + " -> 삭제완료");
			} else {
				System.out.println(f.getPath() + " -> 삭제안됨");
			}
		}
		
	}
}

// list로 작성했을시 String으로 반환됨 하기와 같이 작성
//				String deleteName = "C:/Temp/sub"+ "/" +f.getName();
//				File deleteDir = new File(deleteName);
//				deleteDir.delete();