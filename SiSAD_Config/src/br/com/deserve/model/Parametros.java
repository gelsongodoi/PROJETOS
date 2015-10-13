/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.deserve.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 * @author gelson
 */
public class Parametros implements Serializable {

	private static final long serialVersionUID = -3639984223682086342L;
	private String ftp_retorno;
	private String dir_efetiva_ret;
	private String ftp_senha;
	private String schema_escravo2;
	private String datacenter_database;
	private String ftp_atualiza_filial;
	private String ftp_enviofilial;
	private String mestre_usuario;
	private String escravo2_servidor;
	private String ftp_envio;
	private String email_senha;
	private String datacenter_servidor;
	private String email_suporte;
	private String datacenter_senha;
	private String email_endereco;
	private String dir_incons;
	private String dir_projeto;
	private String mestre_database;
	private String ftp_retornomatriz;
	private String escravo2_senha;
	private String dir_temp;
	private String ftp_atualiza_matriz;
	private String un_leitura;
	private String mestre_servidor;
	private String email_servidor;
	private String ftp_enviomatriz;
	private String usu_alerta;
	private String ftp_servidor;
	private String un_envio;
	private String dir_backup;
	private String dir_recebimento;
	private String envio;
	private String unidade_negocio;
	private String escravo_senha;
	private String escravo2_usuario;
	private String schema_escravo;
	private String dir_envio;
	private String datacenter_usuario;
	private String versao;
	private String arquivo_xml;
	private String email_usuario;
	private String escravo_usuario;
	private String dir_recebe_ret;
	private String arquivo_zip;
	private String ftp_atualiza;
	private String email_nome;
	private String mestre_senha;
	private String escravo_database;
	private String email_porta;
	private String dir_retorno;
	private String dir_efetivado;
	private String log_erro;
	private String escravo_servidor;
	private String ftp_caminho;
	private String schema_datacenter;
	private String dir_logs;
	private String ftp_usuario;
	private String dir_retorno_nfe;
	private String schema_mestre;
	private String reprocessar;
	private String dir_remessa;
	private String empresa;
	private String dir_inclusao;
	private String retorno_xml;
	private String retorno;
	private String email_titulo;
	private String retorno_zip;
	private String ftp_retornofilial;
	private String escravo2_database;
        private String qtde_registros;
        private String kettle_home;

	public Parametros() {
	}

	public Parametros(String ftp_retorno, String dir_efetiva_ret,
			String ftp_senha, String schema_escravo2,
			String datacenter_database, String ftp_atualiza_filial,
			String ftp_enviofilial, String mestre_usuario,
			String escravo2_servidor, String ftp_envio, String email_senha,
			String datacenter_servidor, String email_suporte,
			String datacenter_senha, String email_endereco, String dir_incons,
			String dir_projeto, String mestre_database,
			String ftp_retornomatriz, String escravo2_senha, String dir_temp,
			String ftp_atualiza_matriz, String un_leitura,
			String mestre_servidor, String email_servidor,
			String ftp_enviomatriz, String usu_alerta, String ftp_servidor,
			String un_envio, String dir_backup, String dir_recebimento,
			String envio, String unidade_negocio, String escravo_senha,
			String escravo2_usuario, String schema_escravo, String dir_envio,
			String datacenter_usuario, String versao, String arquivo_xml,
			String email_usuario, String escravo_usuario,
			String dir_recebe_ret, String arquivo_zip, String ftp_atualiza,
			String email_nome, String mestre_senha, String escravo_database,
			String email_porta, String dir_retorno, String dir_efetivado,
			String log_erro, String escravo_servidor, String ftp_caminho,
			String schema_datacenter, String dir_logs, String ftp_usuario,
			String dir_retorno_nfe, String schema_mestre, String reprocessar,
			String dir_remessa, String empresa, String dir_inclusao,
			String retorno_xml, String retorno, String email_titulo,
			String retorno_zip, String ftp_retornofilial,
			String escravo2_database, String qtde_registros, String kettle_home) {
		super();
		this.ftp_retorno = ftp_retorno;
		this.dir_efetiva_ret = dir_efetiva_ret;
		this.ftp_senha = ftp_senha;
		this.schema_escravo2 = schema_escravo2;
		this.datacenter_database = datacenter_database;
		this.ftp_atualiza_filial = ftp_atualiza_filial;
		this.ftp_enviofilial = ftp_enviofilial;
		this.mestre_usuario = mestre_usuario;
		this.escravo2_servidor = escravo2_servidor;
		this.ftp_envio = ftp_envio;
		this.email_senha = email_senha;
		this.datacenter_servidor = datacenter_servidor;
		this.email_suporte = email_suporte;
		this.datacenter_senha = datacenter_senha;
		this.email_endereco = email_endereco;
		this.dir_incons = dir_incons;
		this.dir_projeto = dir_projeto;
		this.mestre_database = mestre_database;
		this.ftp_retornomatriz = ftp_retornomatriz;
		this.escravo2_senha = escravo2_senha;
		this.dir_temp = dir_temp;
		this.ftp_atualiza_matriz = ftp_atualiza_matriz;
		this.un_leitura = un_leitura;
		this.mestre_servidor = mestre_servidor;
		this.email_servidor = email_servidor;
		this.ftp_enviomatriz = ftp_enviomatriz;
		this.usu_alerta = usu_alerta;
		this.ftp_servidor = ftp_servidor;
		this.un_envio = un_envio;
		this.dir_backup = dir_backup;
		this.dir_recebimento = dir_recebimento;
		this.envio = envio;
		this.unidade_negocio = unidade_negocio;
		this.escravo_senha = escravo_senha;
		this.escravo2_usuario = escravo2_usuario;
		this.schema_escravo = schema_escravo;
		this.dir_envio = dir_envio;
		this.datacenter_usuario = datacenter_usuario;
		this.versao = versao;
		this.arquivo_xml = arquivo_xml;
		this.email_usuario = email_usuario;
		this.escravo_usuario = escravo_usuario;
		this.dir_recebe_ret = dir_recebe_ret;
		this.arquivo_zip = arquivo_zip;
		this.ftp_atualiza = ftp_atualiza;
		this.email_nome = email_nome;
		this.mestre_senha = mestre_senha;
		this.escravo_database = escravo_database;
		this.email_porta = email_porta;
		this.dir_retorno = dir_retorno;
		this.dir_efetivado = dir_efetivado;
		this.log_erro = log_erro;
		this.escravo_servidor = escravo_servidor;
		this.ftp_caminho = ftp_caminho;
		this.schema_datacenter = schema_datacenter;
		this.dir_logs = dir_logs;
		this.ftp_usuario = ftp_usuario;
		this.dir_retorno_nfe = dir_retorno_nfe;
		this.schema_mestre = schema_mestre;
		this.reprocessar = reprocessar;
		this.dir_remessa = dir_remessa;
		this.empresa = empresa;
		this.dir_inclusao = dir_inclusao;
		this.retorno_xml = retorno_xml;
		this.retorno = retorno;
		this.email_titulo = email_titulo;
		this.retorno_zip = retorno_zip;
		this.ftp_retornofilial = ftp_retornofilial;
		this.escravo2_database = escravo2_database;
                this.qtde_registros = qtde_registros;
                this.kettle_home = kettle_home;
	}

	public String getFtp_retorno() {
		// this.ftp_retorno = "FTP_RETORNO";
		return ftp_retorno;
	}

	public void setFtp_retorno(String ftp_retorno) {
		this.ftp_retorno = ftp_retorno;
	}

	public String getDir_efetiva_ret() {
		// this.dir_efetiva_ret = "DIR_EFETIVA_RET";
		return dir_efetiva_ret;
	}

	public void setDir_efetiva_ret(String dir_efetiva_ret) {
		this.dir_efetiva_ret = dir_efetiva_ret;
	}

	public String getFtp_senha() {
		// this.ftp_senha = "FTP_SENHA";
		return ftp_senha;
	}

	public void setFtp_senha(String ftp_senha) {
		this.ftp_senha = ftp_senha;
	}

	public String getSchema_escravo2() {
		// this.schema_escravo2 = "SCHEMA_ESCRAVO2";
		return schema_escravo2;
	}

	public void setSchema_escravo2(String schema_escravo2) {
		this.schema_escravo2 = schema_escravo2;
	}

	public String getDatacenter_database() {
		// this.datacenter_database = "DATACENTER_DATABASE";
		return datacenter_database;
	}

	public void setDatacenter_database(String datacenter_database) {
		this.datacenter_database = datacenter_database;
	}

	public String getFtp_atualiza_filial() {
		// this.ftp_atualiza_filial = "FTP_ATUALIZA_FILIAL";
		return ftp_atualiza_filial;
	}

	public void setFtp_atualiza_filial(String ftp_atualiza_filial) {
		this.ftp_atualiza_filial = ftp_atualiza_filial;
	}

	public String getFtp_enviofilial() {
		// this.ftp_enviofilial = "FTP_ENVIOFILIAL";
		return ftp_enviofilial;
	}

	public void setFtp_enviofilial(String ftp_enviofilial) {
		this.ftp_enviofilial = ftp_enviofilial;
	}

	public String getMestre_usuario() {
		// this.mestre_usuario = "MESTRE_USUARIO";
		return mestre_usuario;
	}

	public void setMestre_usuario(String mestre_usuario) {
		this.mestre_usuario = mestre_usuario;
	}

	public String getEscravo2_servidor() {
		// this.escravo2_servidor = "ESCRAVO2_SERVIDOR";
		return escravo2_servidor;
	}

	public void setEscravo2_servidor(String escravo2_servidor) {
		this.escravo2_servidor = escravo2_servidor;
	}

	public String getFtp_envio() {
		// this.ftp_envio = "FTP_ENVIO";
		return ftp_envio;
	}

	public void setFtp_envio(String ftp_envio) {
		this.ftp_envio = ftp_envio;
	}

	public String getEmail_senha() {
		// this.email_senha = "EMAIL_SENHA";
		return email_senha;
	}

	public void setEmail_senha(String email_senha) {
		this.email_senha = email_senha;
	}

	public String getDatacenter_servidor() {
		// this.datacenter_servidor = "DATACENTER_SERVIDOR";
		return datacenter_servidor;
	}

	public void setDatacenter_servidor(String datacenter_servidor) {
		this.datacenter_servidor = datacenter_servidor;
	}

	public String getEmail_suporte() {
		// this.email_suporte = "EMAIL_SUPORTE";
		return email_suporte;
	}

	public void setEmail_suporte(String email_suporte) {
		this.email_suporte = email_suporte;
	}

	public String getDatacenter_senha() {
		// this.datacenter_senha = "DATACENTER_SENHA";
		return datacenter_senha;
	}

	public void setDatacenter_senha(String datacenter_senha) {
		this.datacenter_senha = datacenter_senha;
	}

	public String getEmail_endereco() {
		// this.email_endereco = "EMAIL_ENDERECO";
		return email_endereco;
	}

	public void setEmail_endereco(String email_endereco) {
		this.email_endereco = email_endereco;
	}

	public String getDir_incons() {
		// this.dir_incons = "DIR_ICONS";
		return dir_incons;
	}

	public void setDir_incons(String dir_incons) {
		this.dir_incons = dir_incons;
	}

	public String getDir_projeto() {
		// this.dir_projeto = "dir_projeto";
		return dir_projeto;
	}

	public void setDir_projeto(String dir_projeto) {
		this.dir_projeto = dir_projeto;
	}

	public String getMestre_database() {
		// this.mestre_database = "MESTRE_DATABASE";
		return mestre_database;
	}

	public void setMestre_database(String mestre_database) {
		this.mestre_database = mestre_database;
	}

	public String getFtp_retornomatriz() {
		// this.ftp_retornomatriz = "FTP_RETORNOMATRIZ";
		return ftp_retornomatriz;
	}

	public void setFtp_retornomatriz(String ftp_retornomatriz) {
		this.ftp_retornomatriz = ftp_retornomatriz;
	}

	public String getEscravo2_senha() {
		// this.escravo2_senha = "ESCRAVO2_SENHA";
		return escravo2_senha;
	}

	public void setEscravo2_senha(String escravo2_senha) {
		this.escravo2_senha = escravo2_senha;
	}

	public String getDir_temp() {
		// this.dir_temp = "DIR_TEMP";
		return dir_temp;
	}

	public void setDir_temp(String dir_temp) {
		this.dir_temp = dir_temp;
	}

	public String getFtp_atualiza_matriz() {
		// this.ftp_atualiza_matriz = "FTP_ATUALIZA_MATRIZ";
		return ftp_atualiza_matriz;
	}

	public void setFtp_atualiza_matriz(String ftp_atualiza_matriz) {
		this.ftp_atualiza_matriz = ftp_atualiza_matriz;
	}

	public String getUn_leitura() {
		// this.un_leitura = "UN_LEITURA";
		return un_leitura;
	}

	public void setUn_leitura(String un_leitura) {
		this.un_leitura = un_leitura;
	}

	public String getMestre_servidor() {
		// this.mestre_servidor = "MESTRE_SERVIDOR";
		return mestre_servidor;
	}

	public void setMestre_servidor(String mestre_servidor) {
		this.mestre_servidor = mestre_servidor;
	}

	public String getEmail_servidor() {
		// this.email_servidor = "EMAIL_SERVIDOR";
		return email_servidor;
	}

	public void setEmail_servidor(String email_servidor) {
		this.email_servidor = email_servidor;
	}

	public String getFtp_enviomatriz() {
		// this.ftp_enviomatriz = "FTP_ENVIOMATRIZ";
		return ftp_enviomatriz;
	}

	public void setFtp_enviomatriz(String ftp_enviomatriz) {
		this.ftp_enviomatriz = ftp_enviomatriz;
	}

	public String getUsu_alerta() {
		// this.usu_alerta = "USU_ALERTA";
		return usu_alerta;
	}

	public void setUsu_alerta(String usu_alerta) {
		this.usu_alerta = usu_alerta;
	}

	public String getFtp_servidor() {
		// this.ftp_servidor = "FTP_SERVIDOR";
		return ftp_servidor;
	}

	public void setFtp_servidor(String ftp_servidor) {
		this.ftp_servidor = ftp_servidor;
	}

	public String getUn_envio() {
		// this.un_envio = "UN_ENVIO";
		return un_envio;
	}

	public void setUn_envio(String un_envio) {
		this.un_envio = un_envio;
	}

	public String getDir_backup() {
		// this.dir_backup = "DIR_BACKUP";
		return dir_backup;
	}

	public void setDir_backup(String dir_backup) {
		this.dir_backup = dir_backup;
	}

	public String getDir_recebimento() {
		// this.dir_recebimento = "DIR_RECEBIMENTO";
		return dir_recebimento;
	}

	public void setDir_recebimento(String dir_recebimento) {
		this.dir_recebimento = dir_recebimento;
	}

	public String getEnvio() {
		return envio;
	}

	public void setEnvio(String envio) {
		this.envio = envio;
	}

	public String getUnidade_negocio() {
		// this.unidade_negocio = "UNIDADE_NEGOCIO";
		return unidade_negocio;
	}

	public void setUnidade_negocio(String unidade_negocio) {
		this.unidade_negocio = unidade_negocio;
	}

	public String getEscravo_senha() {
		// this.escravo_senha = "ESCRAVO_SENHA";
		return escravo_senha;
	}

	public void setEscravo_senha(String escravo_senha) {
		this.escravo_senha = escravo_senha;
	}

	public String getEscravo2_usuario() {
		// this.escravo2_usuario = "ESCRAVO2_USUARIO";
		return escravo2_usuario;
	}

	public void setEscravo2_usuario(String escravo2_usuario) {
		this.escravo2_usuario = escravo2_usuario;
	}

	public String getSchema_escravo() {
		// this.schema_escravo = "SCHEMA_ESCRAVO";
		return schema_escravo;
	}

	public void setSchema_escravo(String schema_escravo) {
		this.schema_escravo = schema_escravo;
	}

	public String getDir_envio() {
		// this.dir_envio = "DIR_ENVIO";
		return dir_envio;
	}

	public void setDir_envio(String dir_envio) {
		this.dir_envio = dir_envio;
	}

	public String getDatacenter_usuario() {
		// this.datacenter_usuario = "DATACENTER_USUARIO";
		return datacenter_usuario;
	}

	public void setDatacenter_usuario(String datacenter_usuario) {
		this.datacenter_usuario = datacenter_usuario;
	}

	public String getVersao() {
		// this.versao = "VERSAO";
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getArquivo_xml() {
		return arquivo_xml;
	}

	public void setArquivo_xml(String arquivo_xml) {
		this.arquivo_xml = arquivo_xml;
	}

	public String getEmail_usuario() {
		// this.email_usuario = "EMAIL_USUARIO";
		return email_usuario;
	}

	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}

	public String getEscravo_usuario() {
		// this.escravo_usuario = "ESCRAVO_USUARIO";
		return escravo_usuario;
	}

	public void setEscravo_usuario(String escravo_usuario) {
		this.escravo_usuario = escravo_usuario;
	}

	public String getDir_recebe_ret() {
		// this.dir_recebe_ret = "DIR_RECEBE_RET";
		return dir_recebe_ret;
	}

	public void setDir_recebe_ret(String dir_recebe_ret) {
		this.dir_recebe_ret = dir_recebe_ret;
	}

	public String getArquivo_zip() {
		return arquivo_zip;
	}

	public void setArquivo_zip(String arquivo_zip) {
		this.arquivo_zip = arquivo_zip;
	}

	public String getFtp_atualiza() {
		// this.ftp_atualiza = "FTP_ATUALIZA";
		return ftp_atualiza;
	}

	public void setFtp_atualiza(String ftp_atualiza) {
		this.ftp_atualiza = ftp_atualiza;
	}

	public String getEmail_nome() {
		// this.email_nome = "EMAIL_NOME";
		return email_nome;
	}

	public void setEmail_nome(String email_nome) {
		this.email_nome = email_nome;
	}

	public String getMestre_senha() {
		// this.mestre_senha = "MESTRE_SENHA";
		return mestre_senha;
	}

	public void setMestre_senha(String mestre_senha) {
		this.mestre_senha = mestre_senha;
	}

	public String getEscravo_database() {
		// this.escravo_database = "ESCRAVO_DATABASE";
		return escravo_database;
	}

	public void setEscravo_database(String escravo_database) {
		this.escravo_database = escravo_database;
	}

	public String getEmail_porta() {
		// this.email_porta = "EMAIL_PORTA";
		return email_porta;
	}

	public void setEmail_porta(String email_porta) {
		this.email_porta = email_porta;
	}

	public String getDir_retorno() {
		// this.dir_retorno = "DIR_RETORNO";
		return dir_retorno;
	}

	public void setDir_retorno(String dir_retorno) {
		this.dir_retorno = dir_retorno;
	}

	public String getDir_efetivado() {
		// this.dir_efetivado = "DIR_EFETIVADO";
		return dir_efetivado;
	}

	public void setDir_efetivado(String dir_efetivado) {
		this.dir_efetivado = dir_efetivado;
	}

	public String getLog_erro() {
		return log_erro;
	}

	public void setLog_erro(String log_erro) {
		this.log_erro = log_erro;
	}

	public String getEscravo_servidor() {
		// this.escravo_servidor = "ESCRAVO_SERVIDOR";
		return escravo_servidor;
	}

	public void setEscravo_servidor(String escravo_servidor) {
		this.escravo_servidor = escravo_servidor;
	}

	public String getFtp_caminho() {
		// this.ftp_caminho = "FTP_CAMINHO";
		return ftp_caminho;
	}

	public void setFtp_caminho(String ftp_caminho) {
		this.ftp_caminho = ftp_caminho;
	}

	public String getSchema_datacenter() {
		// this.schema_datacenter = "SCHEMA_DATACENTER";
		return schema_datacenter;
	}

	public void setSchema_datacenter(String schema_datacenter) {
		this.schema_datacenter = schema_datacenter;
	}

	public String getDir_logs() {
		// this.dir_logs = "DIR_LOGS";
		return dir_logs;
	}

	public void setDir_logs(String dir_logs) {
		this.dir_logs = dir_logs;
	}

	public String getFtp_usuario() {
		// this.ftp_usuario = "FTP_USUARIO";
		return ftp_usuario;
	}

	public void setFtp_usuario(String ftp_usuario) {
		this.ftp_usuario = ftp_usuario;
	}

	public String getDir_retorno_nfe() {
		// this.dir_retorno_nfe = "DIR_RETORNO_NFE";
		return dir_retorno_nfe;
	}

	public void setDir_retorno_nfe(String dir_retorno_nfe) {
		this.dir_retorno_nfe = dir_retorno_nfe;
	}

	public String getSchema_mestre() {
		// this.schema_mestre = "SCHEMA_MESTRE";
		return schema_mestre;
	}

	public void setSchema_mestre(String schema_mestre) {
		this.schema_mestre = schema_mestre;
	}

	public String getReprocessar() {
		// this.reprocessar = "REPROCESSAR";
		return reprocessar;
	}

	public void setReprocessar(String reprocessar) {
		this.reprocessar = reprocessar;
	}

	public String getDir_remessa() {
		// this.dir_remessa = "DIR_REMESSA";
		return dir_remessa;
	}

	public void setDir_remessa(String dir_remessa) {
		this.dir_remessa = dir_remessa;
	}

	public String getEmpresa() {
		// this.empresa = "EMPRESA";
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getDir_inclusao() {
		// this.dir_inclusao = "DIR_INCLUSAO";
		return dir_inclusao;
	}

	public void setDir_inclusao(String dir_inclusao) {
		this.dir_inclusao = dir_inclusao;
	}

	public String getRetorno_xml() {
		return retorno_xml;
	}

	public void setRetorno_xml(String retorno_xml) {
		this.retorno_xml = retorno_xml;
	}

	public String getRetorno() {
		return retorno;
	}

	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}

	public String getEmail_titulo() {
		// this.email_titulo = "EMAIL_TITULO";
		return email_titulo;
	}

	public void setEmail_titulo(String email_titulo) {
		this.email_titulo = email_titulo;
	}

	public String getRetorno_zip() {
		return retorno_zip;
	}

	public void setRetorno_zip(String retorno_zip) {
		this.retorno_zip = retorno_zip;
	}

	public String getFtp_retornofilial() {
		// this.ftp_retornofilial = "FTP_RETORNOFILIAL";
		return ftp_retornofilial;
	}

	public void setFtp_retornofilial(String ftp_retornofilial) {
		this.ftp_retornofilial = ftp_retornofilial;
	}

	public String getEscravo2_database() {
		// this.escravo2_database = "ESCRAVO2_DATABASE";
		return escravo2_database;
	}

	public void setEscravo2_database(String escravo2_database) {
		this.escravo2_database = escravo2_database;
	}
        
        public String getQtde_registros() {
		return qtde_registros;
	}

	public void setQtde_registros(String qtde_registros) {
		this.qtde_registros = qtde_registros;
	}
        
        public String getKettle_home() {
		return kettle_home;
	}

	public void setKettle_home(String kettle_home) {
		this.kettle_home = kettle_home;
	}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.ftp_retorno);
        hash = 79 * hash + Objects.hashCode(this.dir_efetiva_ret);
        hash = 79 * hash + Objects.hashCode(this.ftp_senha);
        hash = 79 * hash + Objects.hashCode(this.schema_escravo2);
        hash = 79 * hash + Objects.hashCode(this.datacenter_database);
        hash = 79 * hash + Objects.hashCode(this.ftp_atualiza_filial);
        hash = 79 * hash + Objects.hashCode(this.ftp_enviofilial);
        hash = 79 * hash + Objects.hashCode(this.mestre_usuario);
        hash = 79 * hash + Objects.hashCode(this.escravo2_servidor);
        hash = 79 * hash + Objects.hashCode(this.ftp_envio);
        hash = 79 * hash + Objects.hashCode(this.email_senha);
        hash = 79 * hash + Objects.hashCode(this.datacenter_servidor);
        hash = 79 * hash + Objects.hashCode(this.email_suporte);
        hash = 79 * hash + Objects.hashCode(this.datacenter_senha);
        hash = 79 * hash + Objects.hashCode(this.email_endereco);
        hash = 79 * hash + Objects.hashCode(this.dir_incons);
        hash = 79 * hash + Objects.hashCode(this.dir_projeto);
        hash = 79 * hash + Objects.hashCode(this.mestre_database);
        hash = 79 * hash + Objects.hashCode(this.ftp_retornomatriz);
        hash = 79 * hash + Objects.hashCode(this.escravo2_senha);
        hash = 79 * hash + Objects.hashCode(this.dir_temp);
        hash = 79 * hash + Objects.hashCode(this.ftp_atualiza_matriz);
        hash = 79 * hash + Objects.hashCode(this.un_leitura);
        hash = 79 * hash + Objects.hashCode(this.mestre_servidor);
        hash = 79 * hash + Objects.hashCode(this.email_servidor);
        hash = 79 * hash + Objects.hashCode(this.ftp_enviomatriz);
        hash = 79 * hash + Objects.hashCode(this.usu_alerta);
        hash = 79 * hash + Objects.hashCode(this.ftp_servidor);
        hash = 79 * hash + Objects.hashCode(this.un_envio);
        hash = 79 * hash + Objects.hashCode(this.dir_backup);
        hash = 79 * hash + Objects.hashCode(this.dir_recebimento);
        hash = 79 * hash + Objects.hashCode(this.envio);
        hash = 79 * hash + Objects.hashCode(this.unidade_negocio);
        hash = 79 * hash + Objects.hashCode(this.escravo_senha);
        hash = 79 * hash + Objects.hashCode(this.escravo2_usuario);
        hash = 79 * hash + Objects.hashCode(this.schema_escravo);
        hash = 79 * hash + Objects.hashCode(this.dir_envio);
        hash = 79 * hash + Objects.hashCode(this.datacenter_usuario);
        hash = 79 * hash + Objects.hashCode(this.versao);
        hash = 79 * hash + Objects.hashCode(this.arquivo_xml);
        hash = 79 * hash + Objects.hashCode(this.email_usuario);
        hash = 79 * hash + Objects.hashCode(this.escravo_usuario);
        hash = 79 * hash + Objects.hashCode(this.dir_recebe_ret);
        hash = 79 * hash + Objects.hashCode(this.arquivo_zip);
        hash = 79 * hash + Objects.hashCode(this.ftp_atualiza);
        hash = 79 * hash + Objects.hashCode(this.email_nome);
        hash = 79 * hash + Objects.hashCode(this.mestre_senha);
        hash = 79 * hash + Objects.hashCode(this.escravo_database);
        hash = 79 * hash + Objects.hashCode(this.email_porta);
        hash = 79 * hash + Objects.hashCode(this.dir_retorno);
        hash = 79 * hash + Objects.hashCode(this.dir_efetivado);
        hash = 79 * hash + Objects.hashCode(this.log_erro);
        hash = 79 * hash + Objects.hashCode(this.escravo_servidor);
        hash = 79 * hash + Objects.hashCode(this.ftp_caminho);
        hash = 79 * hash + Objects.hashCode(this.schema_datacenter);
        hash = 79 * hash + Objects.hashCode(this.dir_logs);
        hash = 79 * hash + Objects.hashCode(this.ftp_usuario);
        hash = 79 * hash + Objects.hashCode(this.dir_retorno_nfe);
        hash = 79 * hash + Objects.hashCode(this.schema_mestre);
        hash = 79 * hash + Objects.hashCode(this.reprocessar);
        hash = 79 * hash + Objects.hashCode(this.dir_remessa);
        hash = 79 * hash + Objects.hashCode(this.empresa);
        hash = 79 * hash + Objects.hashCode(this.dir_inclusao);
        hash = 79 * hash + Objects.hashCode(this.retorno_xml);
        hash = 79 * hash + Objects.hashCode(this.retorno);
        hash = 79 * hash + Objects.hashCode(this.email_titulo);
        hash = 79 * hash + Objects.hashCode(this.retorno_zip);
        hash = 79 * hash + Objects.hashCode(this.ftp_retornofilial);
        hash = 79 * hash + Objects.hashCode(this.escravo2_database);
        hash = 79 * hash + Objects.hashCode(this.qtde_registros);
        hash = 79 * hash + Objects.hashCode(this.kettle_home);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Parametros other = (Parametros) obj;
        if (!Objects.equals(this.ftp_retorno, other.ftp_retorno)) {
            return false;
        }
        if (!Objects.equals(this.dir_efetiva_ret, other.dir_efetiva_ret)) {
            return false;
        }
        if (!Objects.equals(this.ftp_senha, other.ftp_senha)) {
            return false;
        }
        if (!Objects.equals(this.schema_escravo2, other.schema_escravo2)) {
            return false;
        }
        if (!Objects.equals(this.datacenter_database, other.datacenter_database)) {
            return false;
        }
        if (!Objects.equals(this.ftp_atualiza_filial, other.ftp_atualiza_filial)) {
            return false;
        }
        if (!Objects.equals(this.ftp_enviofilial, other.ftp_enviofilial)) {
            return false;
        }
        if (!Objects.equals(this.mestre_usuario, other.mestre_usuario)) {
            return false;
        }
        if (!Objects.equals(this.escravo2_servidor, other.escravo2_servidor)) {
            return false;
        }
        if (!Objects.equals(this.ftp_envio, other.ftp_envio)) {
            return false;
        }
        if (!Objects.equals(this.email_senha, other.email_senha)) {
            return false;
        }
        if (!Objects.equals(this.datacenter_servidor, other.datacenter_servidor)) {
            return false;
        }
        if (!Objects.equals(this.email_suporte, other.email_suporte)) {
            return false;
        }
        if (!Objects.equals(this.datacenter_senha, other.datacenter_senha)) {
            return false;
        }
        if (!Objects.equals(this.email_endereco, other.email_endereco)) {
            return false;
        }
        if (!Objects.equals(this.dir_incons, other.dir_incons)) {
            return false;
        }
        if (!Objects.equals(this.dir_projeto, other.dir_projeto)) {
            return false;
        }
        if (!Objects.equals(this.mestre_database, other.mestre_database)) {
            return false;
        }
        if (!Objects.equals(this.ftp_retornomatriz, other.ftp_retornomatriz)) {
            return false;
        }
        if (!Objects.equals(this.escravo2_senha, other.escravo2_senha)) {
            return false;
        }
        if (!Objects.equals(this.dir_temp, other.dir_temp)) {
            return false;
        }
        if (!Objects.equals(this.ftp_atualiza_matriz, other.ftp_atualiza_matriz)) {
            return false;
        }
        if (!Objects.equals(this.un_leitura, other.un_leitura)) {
            return false;
        }
        if (!Objects.equals(this.mestre_servidor, other.mestre_servidor)) {
            return false;
        }
        if (!Objects.equals(this.email_servidor, other.email_servidor)) {
            return false;
        }
        if (!Objects.equals(this.ftp_enviomatriz, other.ftp_enviomatriz)) {
            return false;
        }
        if (!Objects.equals(this.usu_alerta, other.usu_alerta)) {
            return false;
        }
        if (!Objects.equals(this.ftp_servidor, other.ftp_servidor)) {
            return false;
        }
        if (!Objects.equals(this.un_envio, other.un_envio)) {
            return false;
        }
        if (!Objects.equals(this.dir_backup, other.dir_backup)) {
            return false;
        }
        if (!Objects.equals(this.dir_recebimento, other.dir_recebimento)) {
            return false;
        }
        if (!Objects.equals(this.envio, other.envio)) {
            return false;
        }
        if (!Objects.equals(this.unidade_negocio, other.unidade_negocio)) {
            return false;
        }
        if (!Objects.equals(this.escravo_senha, other.escravo_senha)) {
            return false;
        }
        if (!Objects.equals(this.escravo2_usuario, other.escravo2_usuario)) {
            return false;
        }
        if (!Objects.equals(this.schema_escravo, other.schema_escravo)) {
            return false;
        }
        if (!Objects.equals(this.dir_envio, other.dir_envio)) {
            return false;
        }
        if (!Objects.equals(this.datacenter_usuario, other.datacenter_usuario)) {
            return false;
        }
        if (!Objects.equals(this.versao, other.versao)) {
            return false;
        }
        if (!Objects.equals(this.arquivo_xml, other.arquivo_xml)) {
            return false;
        }
        if (!Objects.equals(this.email_usuario, other.email_usuario)) {
            return false;
        }
        if (!Objects.equals(this.escravo_usuario, other.escravo_usuario)) {
            return false;
        }
        if (!Objects.equals(this.dir_recebe_ret, other.dir_recebe_ret)) {
            return false;
        }
        if (!Objects.equals(this.arquivo_zip, other.arquivo_zip)) {
            return false;
        }
        if (!Objects.equals(this.ftp_atualiza, other.ftp_atualiza)) {
            return false;
        }
        if (!Objects.equals(this.email_nome, other.email_nome)) {
            return false;
        }
        if (!Objects.equals(this.mestre_senha, other.mestre_senha)) {
            return false;
        }
        if (!Objects.equals(this.escravo_database, other.escravo_database)) {
            return false;
        }
        if (!Objects.equals(this.email_porta, other.email_porta)) {
            return false;
        }
        if (!Objects.equals(this.dir_retorno, other.dir_retorno)) {
            return false;
        }
        if (!Objects.equals(this.dir_efetivado, other.dir_efetivado)) {
            return false;
        }
        if (!Objects.equals(this.log_erro, other.log_erro)) {
            return false;
        }
        if (!Objects.equals(this.escravo_servidor, other.escravo_servidor)) {
            return false;
        }
        if (!Objects.equals(this.ftp_caminho, other.ftp_caminho)) {
            return false;
        }
        if (!Objects.equals(this.schema_datacenter, other.schema_datacenter)) {
            return false;
        }
        if (!Objects.equals(this.dir_logs, other.dir_logs)) {
            return false;
        }
        if (!Objects.equals(this.ftp_usuario, other.ftp_usuario)) {
            return false;
        }
        if (!Objects.equals(this.dir_retorno_nfe, other.dir_retorno_nfe)) {
            return false;
        }
        if (!Objects.equals(this.schema_mestre, other.schema_mestre)) {
            return false;
        }
        if (!Objects.equals(this.reprocessar, other.reprocessar)) {
            return false;
        }
        if (!Objects.equals(this.dir_remessa, other.dir_remessa)) {
            return false;
        }
        if (!Objects.equals(this.empresa, other.empresa)) {
            return false;
        }
        if (!Objects.equals(this.dir_inclusao, other.dir_inclusao)) {
            return false;
        }
        if (!Objects.equals(this.retorno_xml, other.retorno_xml)) {
            return false;
        }
        if (!Objects.equals(this.retorno, other.retorno)) {
            return false;
        }
        if (!Objects.equals(this.email_titulo, other.email_titulo)) {
            return false;
        }
        if (!Objects.equals(this.retorno_zip, other.retorno_zip)) {
            return false;
        }
        if (!Objects.equals(this.ftp_retornofilial, other.ftp_retornofilial)) {
            return false;
        }
        if (!Objects.equals(this.escravo2_database, other.escravo2_database)) {
            return false;
        }
        if (!Objects.equals(this.qtde_registros, other.qtde_registros)) {
            return false;
        }
        if (!Objects.equals(this.kettle_home, other.kettle_home)) {
            return false;
        }
        return true;
    }

}
