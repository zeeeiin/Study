package week06_my_solve;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class quiz02 {
	
	class Person<String> {
		public int count;
		public String phoneNumber;
		
		public Person(int count, String phoneNumber){
			this.count = count;
			this.phoneNumber = phoneNumber;
		}
		
		public int getCount() {
			return count;
		}
		
	}
	
	public static void main(String[] args) {
		/*
		 * 	전화번호부를 만들고 이름을 검색해서 해당 이름의 번호를 출력하는 시스템을 만들어 봅시다.

			** HashMap사용하기
			1. Person이름으로 제네릭 클래스를 정의합니다. 
			클래스에 저장되는 멤버변수는 <전화번호부에 저장되는 순서, 폰 번호> 입니다.
			
			2. 5명의 사람에 대해 이름과 번호를 입력받고, map에 차례대로 저장합니다.  
			map은 <String, Person> 타입입니다. 
			
			3. exit을 입력할 때까지 전화번호부에 저장된 사람을 검색합니다.
			- 검색한 이름이 있으면, 저장된 순서와 번호 출력
			- 검색한 이름이 없으면 exception처리
			- exit 입력하면 프로그램 종료
		 */
	
		Scanner scan = new Scanner(System.in);
		
		Map<String, Person> map = new HashMap<>();

		System.out.println("전화번호 저장");
		
		for(int i = 1; i <= 5; i++) {
			
			System.out.println("이름 >> ");
			String name = scan.nextLine();
			System.out.println("번호 >> ");
			String phoneNum = scan.nextLine();
			System.out.println("-----------------------------------------------");
			
			//Person<String> person = new Person<>(i, phoneNum);
			//map.put(name, person);
		}
		
		System.out.println("=================================================");
		
		while(true) { //name.equals exit-> !searchName.equals("exit")
			System.out.println("검색할 이름 >> ");
			String searchName = scan.nextLine();
			
			if(map.containsKey(searchName)) {
				Person<String> person = map.get(searchName);
				System.out.println(person.getCount() + "번째, 전화번호 : " + person.phoneNumber);
				
			} else if (!searchName.equals("exit")) {
				System.out.println("프로그램 종료");
				scan.close();
				break;
			} else { //찾는 이름이 없는 경우
				System.out.println("없는 사람입니다.");
			}
						
			System.out.println("-----------------------------------------------");
		}
		
		
		
		
	}
}
