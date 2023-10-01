package week07_my_solve;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class quiz03 {

	public static void main(String[] args) throws IOException {
		/*
		- 첨부된 text 파일을 다운 받아 현재 폴더에 저장 , 읽어옵니다 
		(저는 경로 System.getProperty("user.dir") 활용 했습니다!)
		- Person 클래스 선언 (멤버변수 name, age) , person 객체를 담을 list 생성
		- 읽어온 문장에서 정규표현식을 사용해서 이름과 나이를 구해서 person객체에 담아준 뒤 list에 넣어줍니다
		- 마지막으로 스트림을 활용해 list에 나이가 50세 이상인 사람들만 추려줍니다
		- 첨부한 이미지 같이 출력해주세용(이름 + 태어난년도)
		*/
		
		List<Person> list = new ArrayList<>();
		
		String path = "C:\\Users\\hana\\Desktop\\text.txt";
		
		BufferedReader br = new BufferedReader(new FileReader(path));
		String str = br.readLine();		
		
		while((str = br.readLine()) != null) { //m.find()?
			Pattern p = Pattern.compile("[가-힣]+는+[0-9]\\s*(\\d+)+[가-힣]+입니다"); //[^가-힣]+는+[0-9]+살입니다+세입니다+\\s]
			Matcher m = p.matcher(str);
			if(m.find()) {
				String name = m.group();//이름 찾기			
				int age = Integer.parseInt(m.group()); //나이 찾기
				Person person = new Person(name, age); //이름,나이 저장
				list.add(person);
			}
		}
		Stream<Person> stream = list.stream().filter(person -> person.age >= 50);
		stream.forEach( (person) -> System.out.println(person));		
	}
}
