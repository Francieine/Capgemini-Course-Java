
public class Bird extends Animal {
	
	private String bico;
	private String herbivoro;

	
	public Bird() {
		
	}


	public Bird(String nome, int patas, String cauda, String bico, String herbivoro) {
		super(nome, patas, cauda);
		this.bico = bico;
		this.herbivoro = herbivoro;
	}


	public String getBico() {
		return bico;
	}


	public void setBico(String bico) {
		this.bico = bico;
	}


	public String getHerbivoro() {
		return herbivoro;
	}


	public void setHerbivoro(String herbivoro) {
		this.herbivoro = herbivoro;
	}


}
