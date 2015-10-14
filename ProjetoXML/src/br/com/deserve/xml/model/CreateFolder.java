package br.com.deserve.xml.model;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {

		File file = new File("C:\\TESTE_JAVA");
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("Pasta criada!");
			} else {
				System.out.println("Erro na criacao da pasta!");
			}
		} else {
			System.out.println("Pasta ja existe!");
		}
	}
}
