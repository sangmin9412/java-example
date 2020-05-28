import java.util.Random;

public class Ex_18 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int [] num = new int[6];
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(45) + 1;
			System.out.println(num[i]);
		}
		
	}
	
}
