package week05_my_solve;

import java.util.Scanner;

public class quiz05 {

	/*
	 * 1. 문자열을 입력받아서 회문인지 아닌지를
	 	  스트링빌더의 리버스를 이용해서 확인해주세요.
   		  회문이 아닐 경우 사진처럼 회문으로 만들어주세요
	   2. 숫자를 String타입으로 입력받아서 더해주세요
	   
	 */
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//문자열 입력받기
		System.out.println("공백없이 문자열을 입력해주세요>");
		String str = scan.nextLine();	//nextLine?
		//공백 제거 추가?
				
		StringBuilder sb = new StringBuilder(str);
		
		//회문 판별(뒤집고 문자열로 바꾸고 같은지 확인)
		String result = sb.reverse().toString().equals(str) ? "회문입니다." : "회문이 아닙니다.";
			
		//회문이 아닌 경우 reverse
		if( !sb.toString().equals(str) ) {
			System.out.println(result); 
			//sb.reverse(); 위에서 이미 reverse해서 또 하면 안 됨
			System.out.println(str + sb);
		} else { //회문인 경우
			System.out.println(result);
		}
		
		
		
		// String 타입으로 숫자입력받아 더하기		
		System.out.println("첫번째 숫자>");
		String num1 = scan.next();
		int num3 = Integer.parseInt(num1);
		System.out.println("두번째 숫자>");
		String num2 = scan.next();
		int num4 = Integer.parseInt(num2);

		System.out.println("두 수의 합은 : " + (num3 + num4) + "입니다");
		
		
	}

}
