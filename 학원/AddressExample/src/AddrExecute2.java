import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Repeatable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AddrExecute2 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\soldesk\\Desktop\\AddressList.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		FileReader fr = new FileReader("C:\\Users\\soldesk\\Desktop\\AddressList.txt");
		BufferedReader br = new BufferedReader(fr);
		String msg;
		
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
				
				bw.write(map.get(name).getName() + "\t|\t" + map.get(name).getAddr() + "\t|\t" + map.get(name).getTel() + "\r\n");
				bw.flush();
				
				fr = new FileReader("C:\\Users\\soldesk\\Desktop\\AddressList.txt");
				br = new BufferedReader(fr);
				break;
			case 2:
				System.out.println(num);
				break;
			case 3:
				System.out.println(num);
				break;
			case 4:
				System.out.println("--------------------------------------------------");
//				for (String key : s) {
//					System.out.printf("�̸� : %s\t�ּ� : %s\t��ȭ��ȣ : %s\n", 
//							map.get(key).getName(), 
//							map.get(key).getAddr(), 
//							map.get(key).getTel()
//					);
//				}
				while ((msg = br.readLine()) != null) {
					System.out.println(msg);
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
