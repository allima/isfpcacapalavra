package br.com.ifsp.cacapalavra.modelo;

import java.io.File;

public class teste {

	public static void fileTreePrinter(File initialPath, int initialDepth) {
		initialDepth++;

		if (initialPath.exists()) {
			File[] contents = initialPath.listFiles();
			for (int i = 0; i < contents.length; i++) {
				if (contents[i].isDirectory()) {
					fileTreePrinter(contents[i], initialDepth + 1);
				} else {
					char[] dpt = new char[initialDepth];
					for (int j = 0; j < initialDepth; j++) {
						dpt[j] = '+';
					}
					System.out.println(new String(dpt) + contents[i].getName());
					System.out.println(contents[i].getAbsolutePath());
					
				}
			}
		}
	}

	// Exemplo de uso:
	public static void main(String[] args) {

		fileTreePrinter(new File("C:\\\\"), 0);
	}
}
