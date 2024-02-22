//Programa mostra informações dos arquivos, e do path

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder a path:");
		String folderPath = sc.nextLine();
		
		File path = new File(folderPath);
		
		
		System.out.println("getName" + path.getName()); //metodo mostra somente o nome do arquivo do path(caminho) digitado
		System.out.println("getParent" + path.getParent()); //mostra o path(caminho) sem o nome do arquivo
		System.out.println("getPath" + path.getPath()); //mostra o caminho completo
		
		sc.close();
	}

}
