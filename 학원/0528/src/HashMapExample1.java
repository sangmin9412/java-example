import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("해리", 10);
		map.put("이승무", (Integer) 3);
		map.put("이승무", new Integer(10));
		
		System.out.println(map.get("해리"));
		System.out.println(map.get("이승무"));
		
//		Wrapper : String, Integer, Double, Long, Character, Float
//			문자열 > 정수나 실수로 변환하기 위해 사용
//			null 값을 담아야 하는 경우
		
		String name = "100";
//		int age = (int) name; // Error
//		int age = Integer.parseInt(name);
//		int aa = null; // Error
//		Integer aa = null;
		
		
		
	}
	
}
