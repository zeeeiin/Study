package week07_my_solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class quiz06 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("문자열을 입력하세요: ");
		String str = br.readLine();
	
		List<String> list = new ArrayList<>();
		list.add(str);
		
		int wordCount = countWords(str);
		int wordLength = lengthWords(str) ;
		String longWord = longestWords(str);
		String shortWord = shortestWords(str);
		
		String[] words = str.split(" ");
	         
		System.out.println("단어 개수: " + wordCount ); //words.length 
		System.out.println("평균 길이: " + wordLength );
		System.out.println("가장 긴 단어: " + longWord );
		System.out.println("가장 짧은 단어: " + shortWord );	
		
		
	} //main

	public static int countWords(String str) {
		 String[] words = str.split(" ");
	     return words.length;
	}
	public static int lengthWords(String str) {
		String[] words = str.split(" ");
		int wordLength = 0;
		for(String word : words) {	
			wordLength += word.length();
		}
		int ave = wordLength / words.length; //총 단어길이 나누기 단어 개수
		return ave;
	}
	public static String longestWords(String str) {
		String[] words = str.split(" ");
		String longest = words[0]; //임의로 0
		for(int i = 0; i < words.length; i++) {
			if( longest.length() < words[i].length()) { //단어 길이를 비교해서
				longest = words[i]; //가장 긴 단어를 저장
			}
		}
		return longest;
	}

	public static String shortestWords (String str) {		
		String[] words = str.split(" ");
		String shortest = words[0]; //임의로 0
		for(int i = 0; i < words.length; i++) {
			if( shortest.length() > words[i].length()) { //단어 길이를 비교해서
				shortest = words[i]; //가장 짧은 단어를 저장
			}
		}
		return shortest;
	}
	
}
