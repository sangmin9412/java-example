import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("msg : ");
		String msg = scanner.nextLine();
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("C:\\Users\\soldesk\\Desktop\\bufferWriter.txt", true);
			bw = new BufferedWriter(fw);
			bw.write(msg + "\r\n");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) fw.close();
				if (bw != null) bw.close();				
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
		
		
	}
	
}
