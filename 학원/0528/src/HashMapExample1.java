import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("�ظ�", 10);
		map.put("�̽¹�", (Integer) 3);
		map.put("�̽¹�", new Integer(10));
		
		System.out.println(map.get("�ظ�"));
		System.out.println(map.get("�̽¹�"));
		
//		Wrapper : String, Integer, Double, Long, Character, Float
//			���ڿ� > ������ �Ǽ��� ��ȯ�ϱ� ���� ���
//			null ���� ��ƾ� �ϴ� ���
		
		String name = "100";
//		int age = (int) name; // Error
//		int age = Integer.parseInt(name);
//		int aa = null; // Error
//		Integer aa = null;
		
		
		
	}
	
}
