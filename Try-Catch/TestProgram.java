import java.util.Scanner;

public class TestProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try { // Neste trecho de codigo PODE ocorrer um erro
		
		String[] vect = sc.nextLine().split(" "); //criando vetor
		int position = sc.nextInt(); //entrar com dados no vetor
		
		System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {   //excute esse codigo CASO ocorra o erro
			System.out.println(" Invalid Position! ");
			
		}
		
		System.out.println(" End of Program ");
	}

}
