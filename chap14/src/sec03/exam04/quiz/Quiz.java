package sec03.exam04.quiz;

import java.io.File;
import java.util.UUID;

public class Quiz {
//	Quiz
//	디렉터리 이름으로 UUID 사용하기
//	임시 작업 디렉터리, 사용자 세션 디렉터리 등을 만들 때 UUID를 사용하면 
//	충돌 없는 고유 디렉터리를 쉽게 만들 수 있습니다.
	
//	C:/test/sub 폴더 아래에 새로운 임시 폴더를 생성하세요.
//	폴더명은 UUID를 활용하여 구성하세요.
//	단, 폴더명에 -(하이픈)은 없어야 합니다.
	
//	[출력]
//	임시 폴더 생성: C:\test\sub\4e9719b5f849425cb62cfc2711772a6b
	public static void main(String[] args) {
		UUID uuid = UUID.randomUUID();
		
		String uploadDirpath = "C:/test/sub/";
		File uploadDir = new File(uploadDirpath);
		
		if (!uploadDir.exists()) {
			boolean dorCreated = uploadDir.mkdirs();
			if (!dorCreated) {
				System.out.println("업로드 폴더 생성 실패");
				return;
			}
		}
		
		String savedName = uploadDirpath + UUID.randomUUID().toString().replace("-", "");
		File uploadFile = new File(savedName);
		
		try {
			boolean created = uploadFile.mkdirs();
			
			if (created) {
				System.out.println("저장 파일명: " + uploadFile.getName());
			} else {
				System.out.println("파일 생성 실패(이미 존재)");
			}
		} catch (Exception e) {

		}
	}

}
