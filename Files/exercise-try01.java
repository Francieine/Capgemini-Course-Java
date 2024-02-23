//trying 1 

package Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProgramFiles {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter a folder path: ");
		String filePath = sc.nextLine();
		
		
		File path = new File(filePath); //cria um objeto file com o caminho digitado pelo usuario
	
		
		boolean success = new File(filePath + "\\out").mkdir();
		System.out.println("Diretory was created successfully" + success);
		
		
		System.out.println("Enter a new folder path: ");
		String newFilePath = sc.nextLine();
		
		
		File path2 = new File(newFilePath);
		
		
		String[] lines = new String[] {"TV LED, 1290.99", "Video Game Chair, 1051.50", "Iphone X, 1800.00", "Samsung Galax 9, 1700.00"};
		
		String path3 = "C:\\temp\\out";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path3))) { // pode ocorrer um erro
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}

		} catch (IOException e) { //caso ocorra
			e.printStackTrace();
		}
		
	}

}
