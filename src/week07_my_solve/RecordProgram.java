package week07_my_solve;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecordProgram extends SchoolRecord {
	
	List<SchoolRecord> list = new ArrayList<>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	//이름과 성적을 입력 받는 inputRecord()
	public void inputRecord() throws IOException  {

		//List<SchoolRecord> list = new ArrayList<>();
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("학생 이름 입력:");
		String name = br.readLine();
		System.out.print("국어 성적 입력:");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("수학 성적 입력:");
		int math = Integer.parseInt(br.readLine());
		SchoolRecord sr = new SchoolRecord(name, kor, math);
		list.add(sr);
		System.out.println("추가되었습니다.");			
	}
	
	//입력한 내용을 등수와 함께 출력하는 printRecord()
	public void printRecord() {
		int rank = 0;
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0; i < list.size(); i++) {
			SchoolRecord sr = list.get(i);
			int total = sr.getKor() + sr.getMath();
			//Collections.sort();
//			if(){ //저장된 list에서 이름에 해당하는 성적 total 비교하고 출력				
//			}
			
			System.out.println( sr.getName() + "님의 총점은 " + total + "점이고, 순위는 " + rank + "등입니다." );
		}

	}
	
	//입력한 정보를 삭제하는 removeRecord()
	public  void removeRecord() throws IOException {
		//List<SchoolRecord> list = new ArrayList<>();
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String del = br.readLine(); //삭제할 때 찾을 이름

		for(int i = 0; i < list.size(); i++) {
			SchoolRecord delSr = list.get(i);
			String deInfo = ((SchoolRecord) list).getName();
			if(!deInfo.equals(del)) {
				System.out.println("** 입력 후 삭제 바랍니다. **");
			} else {
				list.remove(i);
			}
		}
		System.out.println("정보가 삭제되었습니다.");
	}


	//입력한 정보를 수정하는 updateRecord()
	public void updateRecord() {
		System.out.print("변경할 이름: ");
		try {
			String name = br.readLine();

			for(int i = 0; i < list.size(); i++) {
				SchoolRecord rename = list.get(i);
				String reInfo = ((SchoolRecord) list).getName();
				if( !rename.getName().equals(name)) {
					System.out.println("이름을 다시 확인 바랍니다.");
				} else {
					System.out.print("국어 점수를 변경하세요: ");
					int kor = Integer.parseInt(br.readLine());
					System.out.print("수학 점수를 변경하세요: ");
					int math = Integer.parseInt(br.readLine());
					SchoolRecord sr = new SchoolRecord(name, kor, math);
					list.add(sr);
				}
			}

		} catch (IOException e) {			
			e.printStackTrace();
		}

	}
	
	//등수를 수정하는 updateRank()
	public  void updateRank() {


	}
	//내용을 파일로 저장하는 saveRecord()
	public  void saveRecord() {

	}
	//이전 정보를 불러오는 openRecord()
	public static void openRecord() {

	}

}