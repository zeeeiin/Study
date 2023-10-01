package week05_my_solve;

import java.util.Arrays;
import java.util.InputMismatchException;

public class quiz03 {

	/*
	 * 숫자와 영문자(소문자)로 이루어진 arr스트링 배열이 있습니다.
	 * 배열의 각 요소에서 숫자만을 빼와서 새로운 int 타입 배열에 넣어주려고 합니다.
	 * 
	 * arr과 같은 길이의 int 타입 arr2배열을 선언하고,
	 * 각 요소의 문자를 (StringBuffer or StringBuilder 사용) 
	 * int로 변환해서 arr2에 넣어주는 코드를 작성하시오 (예외 1 발생)
	 * 
	 * 예외가 발생되면 요소에서 소문자를 제외한 숫자값을 배열에 !!두번!! 넣어줍니다 (예외 2 발생)
	 * 예외가 발생되면 배열의 길이를 1개 늘려서 넣어줍니다
	 * 예외를 처리하여 결과를 출력하세요!
	 *
	 * 단 if문은 catch문 안에서만 사용 가능합니다.
	 * ArrayList , 정규표현식 사용 X
	 */

	public static void main(String[] args) {

		String[] arr = {"75h", "123", "457", "a789", "ggg0", "fgd49", "ddd", "444"};		
		int[] arr2 = new int[8];
		String str2 = "";
		int[] newArr = new int[arr2.length];
		StringBuilder sb = new StringBuilder();
		int num = 0;
		for( String str : arr) {

			//배열 요소를 먼저 StringBuilder 에 넣기
			sb.append(str);
			//System.out.println(sb.toString());
			
			try {
				//int로 변환해서 arr2에 넣기 - 값이 들어가지 않음.
				//NumberFormatException 에서 처리.
				
				arr2[num] = Integer.parseInt(arr[num]);
				num++;
				
			} catch (NumberFormatException e) {
				
				
				
				
			} catch (InputMismatchException e) {		
				arr2[num] = Integer.parseInt(arr[num]);
				Arrays.copyOf(arr2, arr2.length+1);
				arr2[num] = Integer.parseInt(arr[num]);	
				num++;
				
			}	
				/*
				for (int i = 0; i < arr.length; i++) {
					
					if( str.contains("h") || str.contains("a") || 
						str.contains("ggg") || str.contains("fgd") || str.contains("ddd") ) {

						str2 = str.replace("h", "");
						arr2[i] = Integer.parseInt(str);
						str2 = str.replace("a", "");
						arr2[i+3] = Integer.parseInt(str);
						str2 = str.replace("ggg", "");
						arr2[i+4] = Integer.parseInt(str);
						str2 = str.replace("fgd", "");
						arr2[i+5] = Integer.parseInt(str);
						str2 = str.replace("ddd", "");
						arr2[i+6] = Integer.parseInt(str);						

						//arr2[i] = Integer.parseInt(str);
						System.out.println(Arrays.toString(arr2));//숫자만 들어감				
					}
				}*/
			}

			System.out.println(Arrays.toString(arr2));

		}
}
