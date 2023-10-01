package week05_my_solve;

import java.util.Arrays;
import java.util.Scanner;

public class quiz04 {
	
	/*
	Scanner를 사용하여 사용자로부터 정수 값을 입력받고, 입력된 값들을 배열에 저장한 뒤에
	sort(), binarySearch(), toString(), equals() 메서드를 활용합니다. 
	각각의 메서드를 사용하여 배열을 정렬하고, 원하는 값을 탐색하며, 배열을 문자열로 변환하고, 
	두 개의 배열을 비교하여 아래와 같이 출력해주세요.
	*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr;
		System.out.print("입력할 정수의 개수 : ");
		int count = scan.nextInt();		
		arr = new int [count];
		
		System.out.println( count + "개의 정수 값을 입력하세요 :");
		for(int i = 0; i <= count-1 ; i++) {
			System.out.print("정수 값 #" + (i+1) + " : ");		
			int num = scan.nextInt();			
			arr[i] = num;			
		}
		
		System.out.print("탐색할 정수 값 : ");
		int search = scan.nextInt();
		
		System.out.println( search + "가 있는 인덱스 번호 : " + Arrays.binarySearch(arr, search));
		Arrays.sort(arr);
		System.out.println("정렬된 배열 : " + Arrays.toString(arr));
		
	}
}
