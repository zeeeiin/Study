package week06_my_solve;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class quiz07 {

	public static void main(String[] args) {
		/*
		* 사용자 입력으로 정수 데이터를 받아 ArrayList 에 저장 후,
		ArrayList에 저장된 모든 정수(중복 허용)의 합을 구하여 출력한다.
		**<조건>**
		1. 사용자 입력은 공백으로 구분하여 한줄로, 한 번만 사용한다.
		2. 정수만 받는다.
		3. 만약, 정수 외 입력이 있다면,
		경고문 “주의! 정수만 입력하세요, 다시 입력바랍니다.” 출력 후, 배열 내 요소 없애고,
		다시 입력받는다.
		4. 정상적인 값을 입력받았을때에만 결과값을 출력하고 종료
		*
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("저장시킬 정수를 입력하세요 (공백으로 구분) => ");

		List<Integer> list = new ArrayList<>();

		while(true) {
			
			if(scan.hasNextInt()) { //정수인지 아닌지 확인
				int num = scan.nextInt();
				list.add(num);	//정수라면 리스트에 저장										
			} else {
				String exit = scan.next(); //탈출 
				if(exit.equals("q")) {
					break;
				} else {
					System.out.println("***주의! 정수만 입력하세요, 다시 입력바랍니다.***");				
					scan.nextLine();	
				}
			}
		}
	
		Collections.sort(list);
		int sum = 0;
		for(int a : list ) {
			sum += a;
		}
	
		System.out.println("====================[결과]=======================");			
		System.out.println("저장한 배열 값 : " + list.toString());
		System.out.println("배열에 있는 정수들의 합 : " + sum );

	}
}
