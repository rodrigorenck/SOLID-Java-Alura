package br.com.alura.rh.model;

public class Funcionario {

	private DadosPessoais dadosPessoais;
	private Cargo cargo;
	private Salario salario;

	public Funcionario(DadosPessoais dadosPessoais, Cargo cargo, Salario salario) {
		this.dadosPessoais = dadosPessoais;
		this.cargo = cargo;
		this.salario = salario;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public void promover(boolean metaBatida){
		cargo.promover(metaBatida);
	}

	public Salario getSalario() {
		return salario;
	}

	public void setSalario(Salario salario) {
		this.salario = salario;
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}
}
