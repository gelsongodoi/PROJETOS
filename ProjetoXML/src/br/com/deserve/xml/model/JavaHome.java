package br.com.deserve.xml.model;

public class JavaHome {

	private String caminho;

	public String getCaminho() {
		this.caminho = System.getenv("JAVA_HOME");
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}
}