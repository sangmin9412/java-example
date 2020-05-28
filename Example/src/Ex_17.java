import java.util.Random;

public class Ex_17 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int random;
		for (int i = 1; i <= 10; i++) {
			random = r.nextInt(45) + 1;
			if (random % 2 == 0) {
				System.out.println(random + " - " + (3 * random));
			}
			
		}
		
	}
	
}
