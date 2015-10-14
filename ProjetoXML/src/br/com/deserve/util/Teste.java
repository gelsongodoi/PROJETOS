package br.com.deserve.util;

import java.io.IOException;

public class Teste {

	public static void main(String[] args) {

		try {
			WindowsCommandUtils.runCommand("SETX /M KETTLE_HOME C:\\pentaho\\data-integration");
		} catch (IOException exc) {
			exc.printStackTrace();
		}

	}

}