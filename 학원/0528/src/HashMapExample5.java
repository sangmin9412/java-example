import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapExample5 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("1111", "이승무1");
		map.put("2222", "이승무2");
		map.put("3333", "이승무3");
		map.put("4444", "이승무4");
		
		System.out.println("map : " + map);
		
//		계좌번호 2222를 찾아서 출력하시오
		if (map.containsKey("2222")) {
			System.out.println(map.get("2222"));
		}
		
		System.out.println("------------------------");
		
		Set<String> s = map.keySet();
		for (String key : s) {
			if (key.contains("2222")) {
				System.out.println(map.get(key));
			} else {
				System.out.println("null");
			}
		}
		
		System.out.println("------------------------");
		
		Set<String> s2 = map.keySet();
		Iterator<String> keys2 = s2.iterator();
		while (keys2.hasNext()) {
			String key = keys2.next();
			if (key.contains("2222")) {
				System.out.println(map.get(key));
			} else {
				System.out.println("null");
			}
		}
		
		System.out.println("------------------------");
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("찾고자 하는 계좌를 입력하세요");
		String accNum = scanner1.nextLine();
		Set<String> s3 = map.keySet();
		for (String key : s3) {
			if (key.contains(accNum)) {
				System.out.println(map.get(key));
			}
		}
		
		
		
	}
	
}
