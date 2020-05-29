import java.lang.annotation.Repeatable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AddrExecute {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, Address> map = new HashMap<String, Address>();
		Set<String> s = map.keySet();
		
		
		
		AddressRepeat : while (true) {
			
			System.out.println("1. 주소록 등록 | 2. 주소록 검색 | 3. 주소록 수정 | 4. 모두출력 | 5. 종료 ");
			System.out.print("번호를 입력하세요 : ");
			String num = scanner.nextLine();
			
			switch (Integer.parseInt(num)) {
			case 1:
				System.out.print("이름을 입력하세요 : ");
				String name = scanner.nextLine();
				
				System.out.print("주소을 입력하세요 : ");
				String address = scanner.nextLine();
				
				System.out.print("전화번호를 입력하세요 : ");
				String tel = scanner.nextLine();
				
				Address ad = new Address();
				ad.setName(name);
				ad.setAddr(address);
				ad.setTel(tel);
				map.put(name, ad);
				break;
			case 2:
				System.out.print("검색할 이름을 입력하세요 : ");
				name = scanner.nextLine();
				
				System.out.println(map.get(name).getName());
				System.out.println(map.get(name).getAddr());
				System.out.println(map.get(name).getTel());
				
				break;
			case 3:
				System.out.print("수정하고 싶은 이름을 입력하세요 : ");
				name = scanner.nextLine();
				
				System.out.println("--------------------------------------------------");
				System.out.println("1. 주소 | 2. 연락처");
				System.out.print("수정할 번호를 입력하세요 : ");
				String num1 = scanner.nextLine();
				String edit;
				switch (Integer.parseInt(num1)) {
					case 1:
						System.out.print("변경할 주소를 입력하세요 : ");
						edit = scanner.nextLine();
						map.get(name).setAddr(edit);
						break;
					case 2:
						System.out.print("변경할 번호를 입력하세요 : ");
						edit = scanner.nextLine();
						map.get(name).setTel(edit);
						break;
	
					default:
						break;
				}
				
				
				break;
			case 4:
				System.out.println("--------------------------------------------------");
				for (String key : s) {
					System.out.printf("이름 : %s\t주소 : %s\t전화번호 : %s\n", 
							map.get(key).getName(), 
							map.get(key).getAddr(), 
							map.get(key).getTel()
					);
				}
				System.out.println("--------------------------------------------------");
				break;
			case 5:
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
//				break AddressRepeat;
			default:
				System.out.println("번호 선택이 잘못 되었습니다.");
				break;
			}
			
		}
		
		
	}

}
