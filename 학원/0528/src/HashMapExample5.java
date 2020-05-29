import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapExample5 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("1111", "�̽¹�1");
		map.put("2222", "�̽¹�2");
		map.put("3333", "�̽¹�3");
		map.put("4444", "�̽¹�4");
		
		System.out.println("map : " + map);
		
//		���¹�ȣ 2222�� ã�Ƽ� ����Ͻÿ�
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
		System.out.println("ã���� �ϴ� ���¸� �Է��ϼ���");
		String accNum = scanner1.nextLine();
		Set<String> s3 = map.keySet();
		for (String key : s3) {
			if (key.contains(accNum)) {
				System.out.println(map.get(key));
			}
		}
		
		
		
	}
	
}
