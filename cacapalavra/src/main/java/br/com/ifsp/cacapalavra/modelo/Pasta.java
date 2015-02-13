package br.com.ifsp.cacapalavra.modelo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Pasta {

	private String caminho;
	private ArrayList<Arquivo> arquivos;

	public Pasta(String caminho) {
		this.caminho = caminho;
		this.arquivos = new ArrayList<>();
	}

	public void obterArquivos() {
		List<String> subpastas = new ArrayList<>();
		subpastas.add(caminho);
		while (subpastas.size() > 0) {
			File f = new File(subpastas.get(0));
			File[] faux = f.listFiles();
			for (File file : faux) {
				if (file.isDirectory()) {

				}

			}
			subpastas.remove(0);

		}
	}

	public ArrayList<Arquivo> getArquivos() {
		return arquivos;
	}

	public void setArquivos(ArrayList<Arquivo> arquivos) {
		this.arquivos = arquivos;
	}

}
