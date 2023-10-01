package week05_my_solve;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class quiz07 {

	/*
	 * 	StringTokenizer 를 이용하여 사칙연산(+, -, *, /) 계산기 만들기
	 * 
		숫자와 사칙연산 한번에 입력을 받아 사칙 연산의 결과를 출력해봅시다.		
		(연산자의 우선순위는 고려하지 않음,  좌측부터 순서대로 연산)

		#조건		
		: 올바른 수식을 입력할 때까지 계속 반복합니다. (try~catch 사용함)		
		 숫자, 사칙연산을 확인(문자를 입력하게되면 오류 문구 출력)

	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		

		System.out.print("수식 입력 => ");		
		String cal = scan.nextLine();		
		System.out.println();

		StringTokenizer token = new StringTokenizer(cal, "-*+/", true);
		String oper = "";
		int result = 0;

//		while(token.hasMoreTokens()) {
//		}
		String str = "";
		
		for(int i = 0; i < token.countTokens(); i++) {
			str = token.nextToken();
			System.out.print(str);
		}
		
		//oper = str.split("\\d+");
		System.out.println();
		System.out.print("수식 결과값 : " );
	}

}
