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
		
//		map�� �ִ� Ű�� �������� ���� �۾�
//		map�� �ִ� �����͸� ����Ϸ��� Ű�� �˾ƾ� �ϱ� ����
		Set<Integer> s = map.keySet();
		System.out.println("Set : " + s);
		Iterator<Integer> keys2 = s.iterator(); // Ŀ���� �̿�
		System.out.println("Iterator : " + keys2);
		
		while (keys2.hasNext()) { // Ŀ���� �̵�
			Integer key = keys2.next();
			System.out.println("key : " + key);
			System.out.println("value : " + map.get(key));
		}
		
	}
	
}
