import java.util.Scanner;

public class ExEx_01 {
	
	public static void main(String[] args) {
		
		String[] eng = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
		System.out.println(eng.length);
		int engLength = eng.length - 1;
		for (int i = 0; i < eng.length; i++) {
			System.out.print(eng[i]);
			System.out.print(eng[engLength-i]);
		}
		System.out.println();
		
		System.out.println("----------------------------------------------------");
		
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + " - ");
			for (int j = 1; j <= 9; j++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------------------");
		
//		double num = 0.0, sum = 0.0;
//		Scanner s1 = new Scanner(System.in);
//		System.out.print("num : ");
//		num = s1.nextDouble();
		
		System.out.println("----------------------------------------------------");
		
		Scanner s2 = new Scanner(System.in);
		double[] weightArr = new double[4];
		
		System.out.print("몸무게를 입력하시오 : ");
		weightArr[0] = s2.nextDouble();
		
		System.out.print("몸무게를 입력하시오 : ");
		weightArr[1] = s2.nextDouble();
		
		System.out.print("몸무게를 입력하시오 : ");
		weightArr[2] = s2.nextDouble();
		
		System.out.print("몸무게를 입력하시오 : ");
		weightArr[3] = s2.nextDouble();
		
		double min, max, hab = 0, avg = 0;
		min = weightArr[0];
		max = weightArr[0];
		
		for (double d : weightArr) {
			if (max < d) {
				max = d;
			}
			if (min > d) {
				min = d;
			}
			
			hab += d;
			avg = hab / weightArr.length;
		}
		
		System.out.printf("최대값\t= %.2f\n", max);
		System.out.printf("최소값\t= %.2f\n", min);
		System.out.printf("합\t= %.2f\n", hab);
		System.out.printf("평균\t= %.2f\n", avg);
		
		s2.close();
		
		System.out.println("----------------------------------------------------");
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d x %d = %d\t", j, i, j*i);
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------------------");
		
		
	}
	
}
