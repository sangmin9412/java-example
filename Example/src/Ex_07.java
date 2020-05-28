
public class Ex_07 {

	public static void main(String[] args) {
	
		int count = 1;
		for (int i = 10; true; i+=4) {
			System.out.println(count + " - " + (i + 4));
			if (count == 25) {
				break;
			}
			count++;	
		}
		
	}
	
}
