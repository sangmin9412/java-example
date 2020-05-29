import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapExample6 {

	public static void main(String[] args) {
		
		Map<String, Account> map = new HashMap<String, Account>();
		
//		map.put("1111", "�̽¹�1");
//		map.put("2222", "�̽¹�2");
//		map.put("3333", "�̽¹�3");
//		map.put("4444", "�̽¹�4");
		map.put("1111", new Account("�̽¹�1", 1000000));
		map.put("2222", new Account("�̽¹�2", 2000000));
		map.put("3333", new Account("�̽¹�3", 3000000));
		map.put("4444", new Account("�̽¹�4", 4000000));
		
		System.out.println("map : " + map);
		System.out.println("map.size() : " + map.size());
		
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		Set<String> s = map.keySet();
		
		int choise = 0;
		
		while (true) {
			
			System.out.println("1. ã�� ���¸� �Է��ϼ���");
			System.out.println("2. �Ա��ϱ�");
			System.out.println("3. ����ϱ�");
			System.out.println("4. ������");
			String accNum = scanner.nextLine();
			
			if (choise == 1) {
				for (String key : s) {
					if (key.contains(accNum)) {
						System.out.println(map.get(key).getName());
						System.out.println(map.get(key).getMoney());
					}
				}
			} else if (choise == 2) {
				
			} else if (choise == 3) {
				
			} else if (choise == 4) {
				break;
			}
		}
		
		
	}
	
}
