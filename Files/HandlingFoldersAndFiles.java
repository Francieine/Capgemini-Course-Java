//Programa escrever arquivos linha por linha

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder a path:");
		String folderPath = sc.nextLine();
		
		File path = new File(folderPath);
		
		File[] folders = path.listFiles(File::isDirectory); //o vetor recebe uma lista de diretorio/pasta
		System.out.println("FOLDERS");

		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile); //o vetor recebe uma lista de arquivos
		
		System.out.println("FILES");

		for(File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(folderPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		sc.close();
	}

}
