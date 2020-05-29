import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample3 {

	public static void main(String[] args) {
		
		Map<String, Double> map = new HashMap<String, Double>();
		
		map.put("김형중", 182.5);
		map.put("김범", 180.3);
		map.put("금잔디", 163.6);
		map.put("구준표", 187.2);
		map.put("이승무", 175.2);
//		문제 이승무라는 키가 있으면 value를 출력하고 없으면 "해당 데이터가 없습니다" 출력.
		System.out.println(map);
		
		Set<String> s = map.keySet();
		Iterator<String> keys = s.iterator();
		
		while (keys.hasNext()) {
			String key = keys.next();
//			System.out.println("key : " + key);
//			System.out.println("value : " + map.get(key));
			
			if (key.contains("이승무")) {
				System.out.println(map.get(key));
			} else {
				System.out.println("해당 데이터가 없습니다.");
			}
		}
		
	}
	
}
