package week07_my_solve;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class quiz04 {

	public static List<String> list = new ArrayList<>(); // 단어를 담을 리스트
	static int count = 0; //반복횟수
	
	public static void main(String[] args) throws IOException {
		/*
		1. countWordOccurrencesInDirectory(String directory, String word)라는 정적 메서드를 만들어야 합니다. 
		이 메서드는 디렉토리 경로와 검색할 단어를 인자로 받습니다.
		2. 해당 메서드는 주어진 디렉토리 내의 모든 텍스트 파일에서 단어의 등장 횟수를 반환해야 합니다.
		3. 대소문자를 구분하지 않아야 합니다. 예를 들어, "apple"과 "Apple"은 같은 단어로 처리되어야 합니다.
		4. 특수 문자는 무시되어야 합니다. 예를 들어, "apple."과 "apple"은 같은 단어로 처리되어야 합니다.
		5. 주어진 디렉토리 내의 서브 디렉토리까지 재귀적으로 탐색해야 합니다.
		6. 디렉토리나 파일이 존재하지 않거나 읽을 수 없는 경우, 
		   또는 파일을 읽는 동안 오류가 발생한 경우에는 -1을 반환해야 합니다.
		7. 주어진 파일들은 UTF-8 인코딩을 사용하며, 파일의 크기는 메모리에 충분히 로드될 수 있습니다.
		 */
		
		String directory = "C:\\Users\\hana\\Desktop\\quiz";
		String path1 = "C:\\Users\\hana\\Desktop\\quiz\\quiz1.txt";
		String path2 = "C:\\Users\\hana\\Desktop\\quiz\\quiz2.txt";
		String path3 = "C:\\Users\\hana\\Desktop\\quiz\\quiz3.txt";
		//String word; //모든 단어들		
		//List<String> list = new ArrayList<>();//단어를 담을 리스트
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		
		countWordOccurrencesInDirectory(directory, word);
		
		
		File folder = new File(directory); //탐색할 폴더
		File[] files = folder.listFiles(); //폴더 내 파일 탐색
		
		BufferedReader fileReader1 = new BufferedReader(new FileReader(path1));
		BufferedReader fileReader2 = new BufferedReader(new FileReader(path2));
		BufferedReader fileReader3 = new BufferedReader(new FileReader(path3));
		String str1;
		String str2;
		String str3;
			
		while( (str1 = fileReader1.readLine()) != null && 
			   (str2 = fileReader2.readLine()) != null && 
			   (str3 = fileReader3.readLine()) != null ) {
			
			if(str1 == null  || str2 == null || str3 == null) {
				break;
			}
			
			String[] words1 = str1.split(" "); //공백으로 분리해서 단어 저장
			String[] words2 = str2.split(" ");
			String[] words3 = str3.split(" ");
			
			for(String word1 : words1) {
				list.add(word1);
				for(String word2 : words2) {
					list.add(word2);
					for(String word3 : words3) {
						list.add(word3);
						if(word1.equalsIgnoreCase(word2) && 
						   word1.equalsIgnoreCase(word3)) { //대소문자 똑같이 처리하는 메소드
							word1.replaceAll("^[a-z]","???");
							word2.replaceAll("^[a-z]","???");
							word3.replaceAll("^[a-z]","???");							
						}
					}
				}
			}	
			
		}
		
	
	}

	public static void countWordOccurrencesInDirectory(String directory, String word) {		
		
		//디렉토리 경로와 검색할 단어를 인자로 받고, 단어의 등장횟수 반환
		
		File folder = new File(directory); //탐색할 폴더
		File[] files = folder.listFiles(); //폴더 내 파일 탐색
		
		if(list.contains(word)) {
			count++;
			System.out.println("단어 " + word +"의 등장횟수: " + count);
		} else {
			System.out.println("디렉토리를 읽는 도중 오류가 발생하였습니다.");
		}
	}
		

}
