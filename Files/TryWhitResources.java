//Programa ler arquivos linha por linha

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		String path = "c:\\temp\\texto.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {

				System.out.println(line);
				line = br.readLine();

			} // declara um ou mais recursos e garante que um ou mais recursos serao fechados
				// ao final do bloco

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
