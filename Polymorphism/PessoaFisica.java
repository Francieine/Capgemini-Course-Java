package Pessoa;

public class PessoaFisica extends Pessoa{
	
	public double gastosSaude;
	
	
	public PessoaFisica() {
		super();
	}


	public PessoaFisica(String nome, Double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}


	public double getGastosSaude() {
		return gastosSaude;
	}


	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public  double rendaAnual() {
		return rendaAnual -= rendaAnual * 2.5;
			
		}
		
	public double gastosSaude() {
		return gastosSaude -= rendaAnual * 5.0;
	}
	
		
	}
	


