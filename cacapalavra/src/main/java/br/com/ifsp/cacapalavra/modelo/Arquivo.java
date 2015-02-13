package br.com.ifsp.cacapalavra.modelo;

public class Arquivo {

	private String caminho;
	private Extensao etensao;

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	public Extensao getEtensao() {
		return etensao;
	}

	public void setEtensao(Extensao etensao) {
		this.etensao = etensao;
	}

}
