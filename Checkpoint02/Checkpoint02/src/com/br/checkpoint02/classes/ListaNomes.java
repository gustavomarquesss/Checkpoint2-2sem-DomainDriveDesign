package com.br.checkpoint02.classes;

import java.util.ArrayList;
import java.util.List;

public class ListaNomes {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Edgar");
		nomes.add("Fabricio");
		nomes.add("Abner");
		nomes.add("Lucas");
		nomes.add("Fabiana");
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}
}
