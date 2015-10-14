package br.com.deserve.xml.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistroWindows {
	public static final String lerRegistro(String strLocalizacao,
			String strChave) {
		StringWriter stringWriter = new StringWriter();
		InputStream inputStream;
		String strResultadoBusca;
		int i;

		try {
			// Roda reg query, depois l� a sa�da com StreamReader (classe
			// interna)
			Process process = Runtime.getRuntime().exec(
					"reg query \"" + strLocalizacao + "\" /v " + strChave);

			inputStream = process.getInputStream();
			while ((i = inputStream.read()) != -1)
				stringWriter.write(i);

			// strResultadoBusca cont�m o resultado completo da busca
			// (localiza��o, chave, tipo do registro e valor).
			strResultadoBusca = stringWriter.toString();

			// Imprime o resultado completo da busca. Caso necessite de todos os
			// campos basta retornar essa vari�vel (strResultadoBusca).
			System.out.println(strResultadoBusca);

			// Verifica qual o caracter utilizado para separa��o dos campos.
			// Win 7 = " " e Win XP = "\t"

			if (System.getProperty("os.name").equals("Windows 7")) {
				if (strResultadoBusca.contains(" ")) {
					// Separa os campos em um vetor de strings.
					String[] camposRegistro = strResultadoBusca.split(" ");
					strResultadoBusca = camposRegistro[camposRegistro.length - 1];
				} else {
					strResultadoBusca = null;
				}
			} else {
				if (strResultadoBusca.contains("\t")) {
					// Separa os campos em um vetor de strings.
					String[] camposRegistro = strResultadoBusca.split("\t");
					strResultadoBusca = camposRegistro[camposRegistro.length - 1];
				} else {
					strResultadoBusca = null;
				}
			}
			return strResultadoBusca;
		} catch (Exception e) {
			return null;
		}
	}

	public static final void incluirRegistro(String strLocalizacao,
			String strChave, String strTipo, String strValor) {
		try {
			Process process = Runtime.getRuntime().exec(
					"reg add " + strLocalizacao + " /v " + strChave + " /t "
							+ strTipo + " /d " + strValor);
		} catch (IOException ex) {
			Logger.getLogger(RegistroWindows.class.getName()).log(Level.SEVERE,
					null, ex);
		}
	}

	public static void main(String[] args) {
		String registro = RegistroWindows.lerRegistro(
				"HKLM\\SYSTEM\\CurrentControlSet\\services\\SISAD", "ImagePath");

		RegistroWindows.incluirRegistro(
				"HKLM\\SYSTEM\\CurrentControlSet\\services\\SISAD",
				"ImagePath", "REG_EXPAND_SZ",
				"C:\\Program Files\\Sisad\\SISAD.exe");
		
		RegistroWindows.incluirRegistro(
				"HKLM\\SYSTEM\\CurrentControlSet\\Control\\Session Manager\\Environment",
				"KETTLE_HOME", "REG_EXPAND_SZ",
				"C:\\TESTE\\DATA-INTEGRATION");

		if (registro == null) {
			System.out.println("O registro solicitado n�o foi encontrado.");
		} else {
			System.out.println(registro);
		}
	}
}
