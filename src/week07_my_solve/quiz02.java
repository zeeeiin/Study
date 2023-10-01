package week07_my_solve;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class quiz02 {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\hana\\Desktop\\노래모음\\";

		String str1 = "";
		String str2 = "";

		System.out.print("첫 번째 파일 이름을 입력하세요>>");		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String file1 = br1.readLine(); //입력받은 파일명을 저장하는 문자열

		System.out.println("두 번째 파일 이름을 입력하세요>>");		
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		String file2 = br2.readLine(); //입력받은 파일명을 저장하는 문자열		

		String path1 = "C:\\Users\\hana\\Desktop\\노래모음\\" + file1 + ".txt";
		String path2 = "C:\\Users\\hana\\Desktop\\노래모음\\" + file2 + ".txt";
		BufferedReader fileReader1 = new BufferedReader(new FileReader(path1));		
		BufferedReader fileReader2 = new BufferedReader(new FileReader(path2));

		String line1, line2; //파일 복사할 때 한 줄씩 저장.

		if( (str1 = fileReader1.readLine()) != null &&
			(str2 = fileReader2.readLine()) != null ) {
			if( str1.equals(str2) ) {
				System.out.println("같습니다.");

			} else if ( !str1.equals(str2) ) {

				System.out.println("같지 않습니다. 파일 복사를 시작합니다.");
				System.out.println("------------------------------");
				System.out.println("새로운 파일 이름을 입력하세요 >> ");
				String newName = br1.readLine(); 

				//파일 복사 
				FileWriter fw = new FileWriter(path + newName + ".txt");
				//번갈아가면서 복사
				while( (line1 = fileReader1.readLine()) != null && 
						(line2 = fileReader2.readLine()) != null) {
					fw.write(line1);
					fw.write("\n");
					fw.write(line2);
					fw.write("\n");
				}
				//각각 남는 경우 그대로 출력
				while( (line1 = fileReader1.readLine()) != null) {
					fw.write(line1);
					fw.write("\n");
				}
				while( (line2 = fileReader2.readLine()) != null) {
					fw.write(line2);
					fw.write("\n");
				}

				fileReader1.close();
				fileReader2.close();
				fw.close();
				System.out.println("복사완료!");
				//System.out.println("------------------------------");
				//System.out.println("가장 큰 파일명 : "+ maxFile + ", 크기 : " + maxFileSize + "byte");
			}

			//전체 파일 비교 후 결과 출력
			File folder = new File(path);
			File[] files = folder.listFiles(); //폴더 내의 파일 가져오기
			long maxFileSize = 0;
			String maxFile = "";
			for(File file : files) {
				long fileSize = file.length();//각각의 파일 사이즈 구하기
				//System.out.println("파일명: " + file.getName() + ", 크기: " + fileSize + "byte");
				if(fileSize > maxFileSize) {
					maxFileSize = fileSize; //파일 중 가장 큰 크기 찾아서 저장
					maxFile = file.getName(); //큰 파일 이름 찾아서 저장
				}						
			}
			System.out.println("------------------------------");
			System.out.println("가장 큰 파일명 : "+ maxFile + ", 크기 : " + maxFileSize + "byte");

		}
	}
}