package week06_my_solve;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class pr {

	public static void main(String[] args) {
	  
	        Map<String, Integer> map = new HashMap<>();

	        String quiz = "단비 학생은 60점입니다 짱구 학생은 55점입니다 짱아 학생은 70점입니다 "
	        		+ "		맹구 학생은 80점입니다 훈이 학생은 시험을 치루지 않아 0점입니다 유리 학생은 86점입니다 "
	        		+ "		김철수 학생은 저번 시험에서 우수한 성적을 거둬 100점입니다!";

	        String pattern = "(.*?[0-9]+점입니다[!]?\\s*)";
//	        Pattern p = Pattern.compile(pattern);
//	        Matcher m = p.matcher(quiz);

//	        while (m.find()) {
//	            String sentence = m.group(1);
//	            System.out.println(sentence);
//	            System.out.println("------------------------------");
//	        }
	        String pattern1 = "(.*?[0-9]+점입니다[!]?\\s*)";
	        Pattern p1 = Pattern.compile(pattern1);
	        Matcher m1 = p1.matcher(quiz);

	        while (m1.find()) {
	            String sentence = m1.group(1);
	            System.out.println(sentence);
	            System.out.println("------------------------------");

	            String pattern2 = "([가-힣]+) 학생은 ([0-9]+)점입니다[!]?\\s*"; 
	            Pattern p2 = Pattern.compile(pattern2);
	            Matcher m2 = p2.matcher(sentence); // sentence에서 이름과 점수 추출

	            if (m2.find()) {
	                String name = m2.group(1);
	                int score = Integer.parseInt(m2.group(2));
	                map.put(name, score); // map에 저장
	                System.out.println(name);
	                System.out.println("------------------------------");
	            }
	        }
	       
	    }
	
	
}
