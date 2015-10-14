package br.com.deserve.xml.model;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class LeArquivo {

	private static void lerXml() {
		FileReader reader = null;
		try {
			reader = new FileReader("D:\\PENTAHO\\PROJETOS\\teste\\config.xml");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		XStream xStream = new XStream(new DomDriver());
		xStream.alias("Endereco", Endereco.class);
		xStream.aliasField("path", Endereco.class, "path");
		xStream.aliasField("param", Endereco.class, "param");
		Endereco endereco = (Endereco) xStream.fromXML(reader);
		System.out.println(endereco.toString());
	}

}
