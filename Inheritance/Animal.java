
public class Animal {
	
	private String nome;
	private int patas;
	private String cauda;
	
	public Animal() {
		
	}

	public Animal(String nome, int patas, String cauda) {
		this.nome = nome;
		this.patas = patas;
		this.cauda = cauda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public String getCauda() {
		return cauda;
	}

	public void setCauda(String cauda) {
		this.cauda = cauda;
	}
	
	
}
