package br.univel;

import java.io.IOException;
import java.util.List;

public class Principal {

	public static void main(String[] args) throws IOException {
//		URLReader reader = new URLReader();
//		List<String> lista = reader.lerUrl();
		ArquivoReader reader = new ArquivoReader();
		List<String> lista = reader.lerArquivo();

		ProdutoParser parser = new ProdutoParser();
		List<Produto> listaPrd = parser.getProduto(lista);

		listaPrd.forEach(e->{
			System.out.println("Id: " + e.getId());
			System.out.println("Descrição" + e.getDescricao());
			System.out.println("Preço" + e.getPreco());
		});
//		lista.forEach(e ->{ // é funcao lambida usado para mais de comando
//			System.out.println(e);
//		});

//      lista.forEach(System.out::println); // não é funcao é passagem de metodo por referencia, System = classe, out = objeto, println metodo do out

//		lista.forEach(e -> System.out.println(e)); // para cada um da lista passe o parametro "e", e execute o camando, qunado for apenas um comando usar esse
	}
}
