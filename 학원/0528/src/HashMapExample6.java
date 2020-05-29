import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapExample6 {

	public static void main(String[] args) {
		
		Map<String, Account> map = new HashMap<String, Account>();
		
//		map.put("1111", "이승무1");
//		map.put("2222", "이승무2");
//		map.put("3333", "이승무3");
//		map.put("4444", "이승무4");
		map.put("1111", new Account("이승무1", 1000000));
		map.put("2222", new Account("이승무2", 2000000));
		map.put("3333", new Account("이승무3", 3000000));
		map.put("4444", new Account("이승무4", 4000000));
		
		System.out.println("map : " + map);
		System.out.println("map.size() : " + map.size());
		
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		Set<String> s = map.keySet();
		
		int choise = 0;
		
		while (true) {
			
			System.out.println("1. 찾을 계좌를 입력하세요");
			System.out.println("2. 입금하기");
			System.out.println("3. 출금하기");
			System.out.println("4. 끝내기");
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
