package br.com.deserve.xml.model;

import java.util.Map;

public class VariavelAmbiente {

	public static void main(String[] args) {
		Map<String, String> mapVariaveis = System.getenv();
		for (@SuppressWarnings("rawtypes")
		Map.Entry variavel : mapVariaveis.entrySet()) {
			String nome = (String) variavel.getKey();
			String valor = (String) variavel.getValue();
			System.out.println(nome + ": " + valor);
		}
	}
}
