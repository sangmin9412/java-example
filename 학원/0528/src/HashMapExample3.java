import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample3 {

	public static void main(String[] args) {
		
		Map<String, Double> map = new HashMap<String, Double>();
		
		map.put("������", 182.5);
		map.put("���", 180.3);
		map.put("���ܵ�", 163.6);
		map.put("����ǥ", 187.2);
		map.put("�̽¹�", 175.2);
//		���� �̽¹���� Ű�� ������ value�� ����ϰ� ������ "�ش� �����Ͱ� �����ϴ�" ���.
		System.out.println(map);
		
		Set<String> s = map.keySet();
		Iterator<String> keys = s.iterator();
		
		while (keys.hasNext()) {
			String key = keys.next();
//			System.out.println("key : " + key);
//			System.out.println("value : " + map.get(key));
			
			if (key.contains("�̽¹�")) {
				System.out.println(map.get(key));
			} else {
				System.out.println("�ش� �����Ͱ� �����ϴ�.");
			}
		}
		
	}
	
}
