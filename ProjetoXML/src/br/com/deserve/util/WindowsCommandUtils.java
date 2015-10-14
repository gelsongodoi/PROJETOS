package br.com.deserve.util;

import java.io.IOException;

/**
 * Classe com m�todos para executar comandos do Windows.
 * 
 */
public class WindowsCommandUtils {

	/**
	 * Executa um comando do Windows que n�o est� associado ao cmd.exe, ou seja,
	 * qualquer execut�vel alcan��vel pela configura��o da vari�vel de ambiente
	 * PATH.
	 * 
	 * @param command
	 *            Comando a ser executado.
	 * @throws IOException
	 */
	public static void runCommand(String command) throws IOException {

		// executa o comando
		Process processo = Runtime.getRuntime().exec(command);

		// cria os stream gobblers, um para o stream de entrada e um para o
		// stream de erro. os gobblers v�o consumir os streams do processo
		StreamGobbler sgInput = new StreamGobbler(processo.getInputStream(),
				"input");
		StreamGobbler sgError = new StreamGobbler(processo.getErrorStream(),
				"error");

		// cria uma thread para cada stream gobbler e as inicia
		new Thread(sgInput).start();
		new Thread(sgError).start();

	}

	/**
	 * Executa um comando do Windows que est� associado ao cmd.exe, por exemplo,
	 * o comando DIR.
	 * 
	 * @param command
	 *            Comando a ser executado.
	 * @throws IOException
	 */
	public static void runCmdCommand(String command) throws IOException {

		// executa o comando do cmd.exe
		Process processo = Runtime.getRuntime().exec("cmd /C " + command);

		// cria os stream gobblers, um para o stream de entrada e um para o
		// stream de erro. os gobblers v�o consumir os streams do processo
		StreamGobbler sgInput = new StreamGobbler(processo.getInputStream(),
				"input");
		StreamGobbler sgError = new StreamGobbler(processo.getErrorStream(),
				"error");

		// cria uma thread para cada stream gobbler e as inicia
		new Thread(sgInput).start();
		new Thread(sgError).start();

	}

}
