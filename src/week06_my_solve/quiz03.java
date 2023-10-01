package week06_my_solve;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class quiz03 {

	public static void main(String[] args) {
		/*
		String quiz = "단비 학생은 60점입니다 짱구 학생은 55점입니다 짱아 학생은 70점입니다 
		맹구 학생은 80점 입니다 훈이 학생은 시험을 치루지 않아 0점입니다 유리 학생은 86점입니다 
		김철수 학생은 저번 시험에서 우수한 성적을 거둬 100점입니다!";
		/*
		 * 주어진 문자열을 이용해 다음과 같이 문제를 풀어보세요!! (정규표현식 ,map 필수사용)
		 * 1. 정규 표현식을 이용해서 quiz 문자열을 첨부한 이미지와 같이 나눠주고 출력해줍니다
		 * 2. 나눠진 문자열에서 이름과 점수를 <String,Integer> 형태로 map에 담아줍니다
		 * 3. 점수가 높은 친구를 순서대로 출력해줍니다 (map 사용)
		 * 저는 map에 담아줄 때 list 에 점수 따로 넣어주고 , array 클래스 같이 사용했습니다! 
		 * (다른 방법으로도 가능합니다!)
		 */

		Map<String, Integer> map = new HashMap<>();

		String quiz = "단비 학생은 60점입니다 짱구 학생은 55점입니다 짱아 학생은 70점입니다 "
				+ "맹구 학생은 80점입니다 훈이 학생은 시험을 치루지 않아 0점입니다 유리 학생은 86점입니다 "
				+ "김철수 학생은 저번 시험에서 우수한 성적을 거둬 100점입니다!";

		String pattern1 = "(.*?[0-9]+점입니다[!]?\\s*)";
		Pattern p1 = Pattern.compile(pattern1);
		Matcher m1 = p1.matcher(quiz);
		
//		String name;
		
		String pattern2 = "([가-힣]+) 학생은 ([0-9]+)점입니다[!]?\\s*"; //(.*?[0-9]+점입니다[!]?\\s*)		
		Pattern p2 = Pattern.compile(pattern2);
		Matcher m2 = p2.matcher(quiz);

		while (m1.find()) {
			String sentence = m1.group(1);
			System.out.println(sentence);
			System.out.println("------------------------------");
		}

		while(m2.find()) {			
			String name = m2.group(1);
			int score = Integer.parseInt(m2.group(2));
			map.put(name, score); //map에 저장
			System.out.println(name);
			System.out.println("------------------------------");
		}

		map.get(m2);
		System.out.println(map.get("단비"));
		
		//내림차순
		//Collections.sort(map, (name, score));



	}
}
