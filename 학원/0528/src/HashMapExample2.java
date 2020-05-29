import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample2 {

	public static void main(String[] args) {
		
		String [] msg = { 
				"Berlin", 
				"Paris", 
				"Seoul", 
				"New York", 
				"London" 
			};
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		for (int i = 0; i < msg.length; i++) {
			map.put(i, msg[i]);
		}
		System.out.println("map : " + map);
		
//		map에 있는 키를 가져오기 위한 작업
//		map에 있는 데이터를 사용하려면 키를 알아야 하기 때문
		Set<Integer> s = map.keySet();
		System.out.println("Set : " + s);
		Iterator<Integer> keys2 = s.iterator(); // 커서를 이용
		System.out.println("Iterator : " + keys2);
		
		while (keys2.hasNext()) { // 커서를 이동
			Integer key = keys2.next();
			System.out.println("key : " + key);
			System.out.println("value : " + map.get(key));
		}
		
	}
	
}
