package week07_my_solve;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz01 {

	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\hana\\Desktop\\saying.txt"; //C:\\Users\\user\\Desktop\\saying.txt
		String str = "";

		System.out.println("속담 퀴즈입니다! 빈 칸에 알맞은 말을 입력하세요.");

		try {
			//txt 파일 경로
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			//파일에서 한 줄씩 읽어오기
			while( (str = br.readLine()) != null) { //읽을 게 없다면 종료
				System.out.print("(문제)");
				System.out.println(str);
				System.out.println("정답을 입력해주세요 => ");

				//정답 입력받을 코드
				BufferedReader answer = new BufferedReader(new InputStreamReader(System.in));

//				if () {

			

			}

			br.close();

		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}


	}

}
