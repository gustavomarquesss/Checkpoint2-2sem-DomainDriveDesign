package com.br.checkpoint02.classes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListaSemDuplicidade {

	public static void main(String[] args) {
		List<Integer> valores = new ArrayList<>();
		valores.add(100);
		valores.add(200);
		valores.add(400);
		valores.add(500);
		valores.add(600);
		valores.add(100);
		valores.add(350);
		valores.add(200);

		Set<Integer> valoresUnicos = new HashSet<>(valores);

		for (Integer valor : valoresUnicos) {
			System.out.println(valor);
		}
	}
}
