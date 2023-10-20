package Entities;

public class Conta {
	
	/*Construindo os atributos*/
	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	/*Criando o construtores*/
	public Conta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public Conta(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		depositar(depositoInicial);
	}
	/*criando os metodos de acesso*/
	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double quantia) {
		saldo += quantia;
	}
	
	public void sacar(double quantia) {
		saldo -= quantia + 5.0; // taxa de 5,00  reais
	}
	/*Criando o convertendo a saida para string*/
	@Override
	public String toString() {
		return "Conta: " + numeroConta + ", Nome do titular: " + nomeTitular + ", Saldo da conta: " + String.format("%.2f", saldo);
	}

	
}
