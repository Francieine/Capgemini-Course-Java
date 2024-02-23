package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramFiles {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		List<Products> list = new ArrayList<>(); // cria uma lista de produtos

		System.out.println("Digite o caminho do arquivo: ");
		String caminhoArq = sc.nextLine();

		File path = new File(caminhoArq); // cria um objeto ondr se passa o caminho digitado pelo usuario

		String arquivoOrigem = path.getParent(); // obtem o caminho desprezando o nome do arquivo

		boolean success = new File(arquivoOrigem + "\\out").mkdir(); // cria uma pasta

		String arquivoDestino = arquivoOrigem + "\\out\\summary.csv"; // cria o arquivo dentro da pasta

		// leitura do arquivo
		try (BufferedReader br = new BufferedReader(new FileReader(arquivoOrigem))) { // este bloco tenta ler o arquivo de origem																		

			String ItemCsv = br.readLine(); // obter os dados do arquivo
			while (ItemCsv != null) {

				// instanciar o produto
				String[] campos = ItemCsv.split(","); // quebrando a linha
				String name = campos[0];
				Double price = Double.parseDouble(campos[1]);
				int quantidade = Integer.parseInt(campos[2]);

				list.add(new Products(name, price, quantidade)); // adiciona na lista de produtos

				// escrever em arquivos
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoDestino))) {

					for (Products item : list) {
						bw.write(item.getName() + "," + String.format("%.2f", item.total()));
						bw.newLine(); // quebra de linha
					}

					System.out.println(arquivoDestino + " Criado");

				} catch (IOException e) {
					System.out.println("Error writing file: " + e.getMessage());
				}

				ItemCsv = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}

		sc.close();

	}

}
