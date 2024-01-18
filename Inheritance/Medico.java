package consultorio;

public class Medico extends Pessoa {
	
	 String horario;
	 String especialidade;
	
	public Medico() {
		
	}

	public Medico(String nome, String endereco, String horario, String especialidade) {
		super(nome, endereco);
		this.horario = horario;
		this.especialidade = especialidade;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	
	
	
}
