import java.util.Random;

public class Ex_16 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int random = r.nextInt(45) + 1;
		for (int i = 1; i <= random; i++) {
			System.out.println(i + " ������ ���Ϸ��� �ڹٸ� ���̼ž� �մϴ�.");
		}
		
	}
	
}
