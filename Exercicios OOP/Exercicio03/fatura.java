/*Exercicio I - UNIVASF (Universidade Federal do Vale São Francisco*/

public class fatura {
/*Atributos da fatura*/
	String numero;
	String descricao;
	int qntItens;
	double precoItem;
	
	/*construtor de sobrecarga*/
	public fatura( String numero, String descricao, int qntItens, double precoItem) {
		this.numero = numero;
		this.descricao = descricao;
		this.qntItens = qntItens;
		this.precoItem = precoItem;
	}
	
	/*Metodo para calcular o total da fatura*/
	
	public double getValorGastoFatura() {
		if (qntItens < 0) {
			qntItens = 0; //para garantir que a quantidade não seja zero
		}
		if(precoItem < 0) {
			precoItem = 0.0; //para garantir que o preco não seja zero
		}
		
		return qntItens * precoItem;
		
	}
		
		public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQntItens() {
		return qntItens;
	}

	public void setQntItens(int qntItens) {
		this.qntItens = qntItens;
	}

	public double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}

	@Override
	public String toString() {
		return "Descrição detalhada: "+ "" + "Numero da sua fatura:" + numero +  ", Quantidade de itens comprados:" + qntItens + ", Preço dos itens: "
				+ precoItem + "";
	}
	
	
	
}

