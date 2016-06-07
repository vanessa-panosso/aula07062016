package br.univel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArquivoReader {

	public List<String> lerArquivo() {
		ArrayList<String> lista = new ArrayList<>();
		try {
			FileReader fr;
			fr = new FileReader(new File("lista.txt"));
			BufferedReader br = new BufferedReader(fr);
			String linha = null;
			while ((linha = br.readLine()) != null) {
				lista.add(linha);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lista;

	}

	public static void main(String[] args) {
		ArquivoReader arq = new ArquivoReader();
		arq.lerArquivo().forEach(System.out::println);
	}

}
