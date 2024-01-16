
public class Mammal extends Animal{
	
	private String carnivoro;
	
public Mammal() {
	
}

public Mammal(String nome, int patas, String cauda, String carnivoro) {
	super(nome, patas, cauda);
	this.carnivoro = carnivoro;
}

public String getCarnivoro() {
	return carnivoro;
}

public void setCarnivoro(String carnivoro) {
	this.carnivoro = carnivoro;
}
	

}
