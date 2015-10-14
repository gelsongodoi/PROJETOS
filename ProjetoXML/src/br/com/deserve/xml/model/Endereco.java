package br.com.deserve.xml.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("endereco")
public class Endereco {

	private String path;
	private String param;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

}
