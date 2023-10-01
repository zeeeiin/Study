package week06_my_solve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class quiz04 {

	public static void main(String[] args) {

		/* 주어진 정규표현식을 사용해 표현식에 맞춰 비밀번호 로그인하고 로또를 구매할 수 있게 
		 * Set 계열의 클래스를 이용하여 로또번호를 랜덤함수를 이용하여 생성하고 
		 * List계열의 클래스를 이용하여 정렬하여 출력하는 로또구매 프로그램을 만드세요.
		 * 
		 * 정규표현식 (최소 8자리에 대문자, 소문자, 숫자, 특수문자 각 1개 이상 포함)
		 * 특수문자 범위 ($@$! *?&)
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 로또를 구매할 아이디는: hello_world");
		System.out.println("비밀번호를 입력하세요: ");
		String pw = scan.nextLine();
		String pattern = "(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[$@$! *?&]).{8,}"; //[$@$! *?&]+[a-zA-Z0-9]{8}/[A-Z]+[a-z]+[$@$! *?&]+[0-9]+{8}							
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(pw);

		while(true) {

			if(m.find()) { 
				System.out.println("로그인 성공!");

				Set<Integer> lotto = new TreeSet<>();
				int random;

				for(int i=1; i < 6; i++) {
					lotto.clear(); //비우고 다시 로또번호 채우기
					while(lotto.size() < 6) {
						random = (int)(Math.random()*45) +1 ;
						lotto.add(random);
					}		
					//System.out.println(lotto.toString());	

					List<Integer> list = new ArrayList<>(lotto);
					Collections.sort(list);					

					System.out.println("로또 구매"+ i + "번째:");
					System.out.println("로또 번호: " + list);
				}
				break;
			} else {
				System.out.println("로그인 실패! 다음 주에 사세요~!");
				break;
			}

		}
	}

}
