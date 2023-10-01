package week06_my_solve;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class quiz05 {

	public static void main(String[] args) {
		/*
		 * 문자나 숫자를 10번 입력할때 만약 중복값이면 "중복값입니다"를 출력하고 새로 입력 받아주세요.
		 * (TreeSet을 이용합니다.)
		 * 문자나 숫자를 10번 입력 받고 정렬해서 출력하세요.
		 */

		Scanner scan = new Scanner(System.in);

		Set<Integer> set = new TreeSet<>();
		Set<String> set2 = new TreeSet<>();

		System.out.println("숫자나 문자를 10번 입력해주세요.");
		System.out.println("1.숫자  2.문자  3.종료");

		int menu = scan.nextInt();

		switch (menu) {
		
		case 1:
			System.out.println("숫자를 입력해주세요 > ");
			for(int i = 0; i < 10; i++) {
				int num = scan.nextInt();
				
				if(!set.add(num)) {					
					System.out.println("중복값입니다. 숫자를 다시 입력해주세요.");
					i--;
				}
			}
			System.out.println(set.toString());
			break;

		case 2:
			System.out.println("문자를 입력해주세요 > ");
			for(int i = 0; i < 10; i++) {
				String str = scan.nextLine();
				
				if(!set2.add(str)) {
					System.out.println("중복값입니다. 문자를 다시 입력해주세요.");
					i--;
				}
			}
			System.out.println(set2.toString());
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		default:
			break;
		}




	}

}
