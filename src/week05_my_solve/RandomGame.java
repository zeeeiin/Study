package week05_my_solve;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RandomGame {
	
	public static void main(String[] args) { //throws Exception 
		
		//랜덤 숫자 맞추기 게임
		Scanner scan = new Scanner(System.in);
		
		System.out.println("======== 숫자 맞추기 게임! ========");
		System.out.println("1부터 50까지의 숫자를 맞춰보세요! ");
		
		int number = (int)(Math.random()*50)+1; //1부터 50까지 범위 설정
		int count = 0;	//시도횟수	
		
		while(true) {
			
			try {
				int guessNum = scan.nextInt(); //숫자 입력받기
				
				if( guessNum > 50 ) { //숫자 범위를 벗어난 경우 예외처리
					throw new IllegalArgumentException(); //예외 직접 생성해서 처리				
				}				
				count++;
				
				if(number == guessNum) { //랜덤 숫자 맞춘 경우
					System.out.println("숫자를 맞췄습니다! 정답은 " + number);
					System.out.println("시도횟수" + count);
					break; //숫자를 맞추면 탈출
				} else {
					System.out.println("틀렸습니다! 다시 맞춰보세요!");
					System.out.println("시도횟수" + count);
				}
				
			} catch (InputMismatchException e) { //숫자가 아닌 문자를 입력한 경우 예외처리  NumberFormat는 무한루프에 빠짐.  InputMismatch 사용.
				System.out.println("숫자만 입력해주세요.");
				scan.nextLine(); //처리가 안 된 문자 + 엔터값을 대신 처리해준다.
			} catch (IllegalArgumentException e) { //범위를 벗어난 경우 예외처리
				System.out.println("숫자의 범위를 벗어났습니다. 다시 입력하세요.");
			}
				
		}
		scan.close();
		
	}

}
// catch (IllegalArgumentException e) { //범위를 벗어난 경우 예외처리
// System.out.println("숫자의 범위를 벗어났습니다. 다시 입력하세요.");