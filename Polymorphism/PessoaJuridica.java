package Pessoa;

public class PessoaJuridica extends Pessoa{
	
	private int numeroFuncionarios;
	
	
	public PessoaJuridica() {
		super();
	}


	public PessoaJuridica(String nome, Double rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}


	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}


	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public  double rendaAnual() {
		return rendaAnual -= rendaAnual * 1.6;
			
		}
	
	public int taxQuantFunc(){
		if(numeroFuncionarios >= 10) {
			rendaAnual -= rendaAnual *1.4;
	}
		return 0;
	
}
	}
