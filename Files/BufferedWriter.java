//Programa escrever arquivos linha por linha


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Program {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

		String path = "c:\\temp\\textoNovo.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { // pode ocorrer um erro
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}

		} catch (IOException e) { //caso ocorra
			e.printStackTrace();
		}

	}

}
