package week07_my_solve;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class quiz07 extends RecordProgram {	

	public static void main(String[] args) throws IOException {
		
		List<SchoolRecord> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("|--------------성적 관리 프로그램--------------|");
			System.out.println("| 1.입력 2.출력 3.삭제 4.수정 5.저장 6.열기 7.종료 |");
			System.out.println("|-----------------------------------------|");
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
			System.out.println(":");		
			String menu = br.readLine();			
			/*
			if(menu.equals("1")) {
				inputRecord();
			} else if (menu.equals("2")) {
				printRecord();
			} else if (menu.equals("3")) {
				removeRecord();
			} else if (menu.equals("4")) {
				updateRecord();
				updateRank();
			} else if (menu.equals("5")) {
				saveRecord();
			} else if (menu.equals("6")) {
				openRecord();
			} else if (menu.equals("7")) {
				System.out.println("프로그램이 종료되었습니다. 이용해주셔서 감사합니다.");			
				break;
			} else {

			}*/
		}
	}
}
