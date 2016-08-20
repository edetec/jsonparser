package apijson.pojo;

import java.util.List;

public class Pessoa {

	private String nome;
	private int id;
	private float valor;
	private boolean novidades;
	private Pessoa pai;
	private List<Pessoa> filhos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public boolean isNovidades() {
		return novidades;
	}

	public void setNovidades(boolean novidades) {
		this.novidades = novidades;
	}

	public Pessoa getPai() {
		return pai;
	}

	public void setPai(Pessoa pai) {
		this.pai = pai;
	}

	public List<Pessoa> getFilhos() {
		return filhos;
	}

	public void setFilhos(List<Pessoa> filhos) {
		this.filhos = filhos;
	}

}
