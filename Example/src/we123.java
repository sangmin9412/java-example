import java.util.Scanner;

public class we123 {

	public static void main(String[] args) {
		
		Scanner scanner3;
		int choise = 1, amount = 5, price = 0;
		
		while (true) {
			scanner3 = new Scanner(System.in);
			System.out.print("��ǰ�ڵ�\t: ");
			choise = scanner3.nextInt();
			
			System.out.print("����\t: ");
			amount = scanner3.nextInt();
			
			if(!(choise >= 1 && choise <= 5)) {
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
			
			if (choise == 1) price = 50000;
			if (choise == 2) price = 30000;
			if (choise == 3) price = 35000;
			if (choise == 4) price = 40000;
			if (choise == 5) price = 80000;
			
			price *= amount;
			System.out.println(price);
			break;
		}
		
		scanner3.close();

	}

}
