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
			
			System.out.println("1. �ּҷ� ��� | 2. �ּҷ� �˻� | 3. �ּҷ� ���� | 4. ������ | 5. ���� ");
			System.out.print("��ȣ�� �Է��ϼ��� : ");
			String num = scanner.nextLine();
			
			switch (Integer.parseInt(num)) {
			case 1:
				System.out.print("�̸��� �Է��ϼ��� : ");
				String name = scanner.nextLine();
				
				System.out.print("�ּ��� �Է��ϼ��� : ");
				String address = scanner.nextLine();
				
				System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
				String tel = scanner.nextLine();
				
				Address ad = new Address();
				ad.setName(name);
				ad.setAddr(address);
				ad.setTel(tel);
				map.put(name, ad);
				break;
			case 2:
				System.out.print("�˻��� �̸��� �Է��ϼ��� : ");
				name = scanner.nextLine();
				
				System.out.println(map.get(name).getName());
				System.out.println(map.get(name).getAddr());
				System.out.println(map.get(name).getTel());
				
				break;
			case 3:
				System.out.print("�����ϰ� ���� �̸��� �Է��ϼ��� : ");
				name = scanner.nextLine();
				
				System.out.println("--------------------------------------------------");
				System.out.println("1. �ּ� | 2. ����ó");
				System.out.print("������ ��ȣ�� �Է��ϼ��� : ");
				String num1 = scanner.nextLine();
				String edit;
				switch (Integer.parseInt(num1)) {
					case 1:
						System.out.print("������ �ּҸ� �Է��ϼ��� : ");
						edit = scanner.nextLine();
						map.get(name).setAddr(edit);
						break;
					case 2:
						System.out.print("������ ��ȣ�� �Է��ϼ��� : ");
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
					System.out.printf("�̸� : %s\t�ּ� : %s\t��ȭ��ȣ : %s\n", 
							map.get(key).getName(), 
							map.get(key).getAddr(), 
							map.get(key).getTel()
					);
				}
				System.out.println("--------------------------------------------------");
				break;
			case 5:
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				System.exit(0);
//				break AddressRepeat;
			default:
				System.out.println("��ȣ ������ �߸� �Ǿ����ϴ�.");
				break;
			}
			
		}
		
		
	}

}
