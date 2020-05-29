import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample4 {

	public static void main(String[] args) {
		
		Map<String, Double> map = new HashMap<String, Double>();
		
		map.put("������", 182.5);
		map.put("���", 180.3);
		map.put("���ܵ�", 163.6);
		map.put("����ǥ", 187.2);
		map.put("�̽¹�", 175.2);
//		���� �̽¹���� Ű�� ������ value�� ����ϰ� ������ "�ش� �����Ͱ� �����ϴ�" ���.
		System.out.println(map);
		System.out.println(map.keySet());
		
		Set<String> s = map.keySet();
		for (String key : s) {
			if (key.contains("�̽¹�")) {
				System.out.println(map.get(key));
			} else {
				System.out.println("�����Ͱ� �����ϴ�.");
			}
		}
		
		System.out.println("---------------------------------");
		
		
	}
	
}
