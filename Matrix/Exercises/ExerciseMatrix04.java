import java.util.Scanner;

public class ExerciseMatrix04 {

	public static void main(String[] args) {

		
		/*
		  2. Faça um algoritmo que preencha uma matriz 5x5 de inteiros e escreva:
 			a) a soma dos números ímpares fornecidos;
 			b) a soma de cada uma das 5 colunas;
 			c) a soma de cada uma das 5 linhas. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de linhas: ");
		int linhas = sc.nextInt();
		
		System.out.println("Digite o numero de colunas: ");
		int colunas = sc.nextInt();
		
		int matriz [][] = new int [linhas][colunas];

		
		int somaImpares = 0;
		System.out.println("Digite os valores para preencher a matriz");
		for(int i = 0; i<linhas; i++) {
			for(int j = 0; j< colunas; j++) {
				System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                
                if(matriz[i][j] %2 != 0) {
                	somaImpares += matriz[i][j];
                }
			}
		}
		
		for (int i = 0 ; i < linhas; i++) {
			for(int j = 0; j<colunas; j++) {
				System.out.println(matriz[i][j] + "|");

			}
			System.out.println("");

		}
		System.out.println("A soma dos numeros impares é " + somaImpares);
		
		
		sc.close();
	}

}
