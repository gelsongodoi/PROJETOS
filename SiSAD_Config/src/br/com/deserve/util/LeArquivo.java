package br.com.deserve.util;

import br.com.deserve.model.Endereco;
import br.com.deserve.model.Parametros;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LeArquivo {

    private final Parametros param = new Parametros();

    /**
     * Metodo que faz a leitura do arquivo kettle.properties
     *
     * @return
     */
    public Parametros readAllProperties() {

        Endereco endereco = new Endereco();
        String arquivoVersao = endereco.getCaminho() + "\\.kettle\\";
        String NomeArq = arquivoVersao + "kettle.properties";

        JFrame frame = new JFrame("Arquivo nao localizado");

        try {
            /**
             * Instanciando objeto da classe Properties *
             */
            Properties config = new Properties();

            /**
             * Lendo o arquivo externamente *
             */
            InputStream configuracao = new FileInputStream(NomeArq);

            /**
             * carregando o arquivo *
             */
            config.load(configuracao);

            for (String key : config.stringPropertyNames()) {
                String value = config.getProperty(key);

                if (key.equals("empresa")) {
                    param.setEmpresa(value);
                }

                if (key.equals("usu_alerta")) {
                    param.setUsu_alerta(value);
                }

                if (key.equals("un_envio")) {
                    param.setUn_envio(value);
                }

                if (key.equals("un_leitura")) {
                    param.setUn_leitura(value);
                }

                if (key.equals("unidade_negocio")) {
                    param.setUnidade_negocio(value);
                }

                if (key.equals("reprocessar")) {
                    param.setReprocessar(value);
                }

                if (key.equals("email_suporte")) {
                    param.setEmail_suporte(value);
                }

                if (key.equals("versao")) {
                    param.setVersao(value);
                }

                if (key.equals("dir_projeto")) {
                    param.setDir_projeto(value);
                }

                if (key.equals("mestre_servidor")) {
                    param.setMestre_servidor(value);
                }

                if (key.equals("mestre_database")) {
                    param.setMestre_database(value);
                }

                if (key.equals("mestre_usuario")) {
                    param.setMestre_usuario(value);
                }

                if (key.equals("mestre_senha")) {
                    param.setMestre_senha(value);
                }

                if (key.equals("schema_mestre")) {
                    param.setSchema_mestre(value);
                }

                if (key.equals("escravo_servidor")) {
                    param.setEscravo_servidor(value);
                }

                if (key.equals("escravo_database")) {
                    param.setEscravo_database(value);
                }

                if (key.equals("escravo_usuario")) {
                    param.setEscravo_usuario(value);
                }

                if (key.equals("escravo_senha")) {
                    param.setEscravo_senha(value);
                }

                if (key.equals("schema_escravo")) {
                    param.setSchema_escravo(value);
                }

                if (key.equals("escravo2_servidor")) {
                    param.setEscravo2_servidor(value);
                }

                if (key.equals("escravo2_database")) {
                    param.setEscravo2_database(value);
                }

                if (key.equals("escravo2_usuario")) {
                    param.setEscravo2_usuario(value);
                }

                if (key.equals("escravo2_senha")) {
                    param.setEscravo2_senha(value);
                }

                if (key.equals("schema_escravo2")) {
                    param.setSchema_escravo2(value);
                }

                if (key.equals("datacenter_servidor")) {
                    param.setDatacenter_servidor(value);
                }

                if (key.equals("datacenter_database")) {
                    param.setDatacenter_database(value);
                }

                if (key.equals("datacenter_usuario")) {
                    param.setDatacenter_usuario(value);
                }

                if (key.equals("datacenter_senha")) {
                    param.setDatacenter_senha(value);
                }

                if (key.equals("schema_datacenter")) {
                    param.setSchema_datacenter(value);
                }

                if (key.equals("email_servidor")) {
                    param.setEmail_servidor(value);
                }

                if (key.equals("email_porta")) {
                    param.setEmail_porta(value);
                }

                if (key.equals("email_endereco")) {
                    param.setEmail_endereco(value);
                }

                if (key.equals("email_nome")) {
                    param.setEmail_nome(value);
                }

                if (key.equals("email_titulo")) {
                    param.setEmail_titulo(value);
                }

                if (key.equals("email_usuario")) {
                    param.setEmail_usuario(value);
                }

                if (key.equals("email_senha")) {
                    param.setEmail_senha(value);
                }

                if (key.equals("ftp_servidor")) {
                    param.setFtp_servidor(value);
                }

                if (key.equals("ftp_senha")) {
                    param.setFtp_senha(value);
                }

                if (key.equals("ftp_caminho")) {
                    param.setFtp_caminho(value);
                }

                if (key.equals("ftp_usuario")) {
                    param.setFtp_usuario(value);
                }

                if (key.equals("qtde_registros")) {
                    param.setQtde_registros(value);
                }
            }

        } catch (IOException ex) {
            JOptionPane
                    .showMessageDialog(
                            frame,
                            "Arquivo de propriedades nao encontrado: \r\n\n '"
                            + NomeArq
                            + "'. \r\n\n"
                            + "Aponte a variavel de ambiente KETTLE_HOME para \r\n"
                            + "o local correto para corrigir o problema. \r\n"
                            + "E necessario reiniciar o computador apos a alteracao!");
            System.exit(0);
        }
        return param;
    }

    /**
     * Metodo que edita o arquivo properties externo ao projeto
     *
     * @param diretorio
     */
    public void writeProperties(String diretorio) {

        Endereco endereco = new Endereco();
        String arquivoVersao = endereco.getCaminho() + "\\.kettle\\";

        try {

            /**
             * Lendo o arquivo externamente *
             */
            String arquivo = arquivoVersao + "kettle.properties";

            /**
             * Instanciando objeto do tipo File *
             */
            File file = new File(arquivo);

            /**
             * Instanciando objeto da classe Properties *
             */
            Properties config = new Properties();

            /**
             * Instanciando objeto do tipo FileInpusStream *
             */
            FileInputStream fis = new FileInputStream(file);

            /**
             * carregando o arquivo *
             */
            config.load(fis);

            /**
             * setando as propriedades no arquivo properties *
             */
            config.setProperty("dir_projeto", diretorio);

            try (FileOutputStream fos = new FileOutputStream(file)) {
                config.store(fos, "Parametros de configuracao Kettle :");
            }

        } catch (IOException ex) {
            ex.getMessage();
        }
    }

    /**
     * Metodo que grava os dados do banco de dados Matriz
     *
     * @param host
     * @param database
     * @param user
     * @param password
     * @param schema
     */
    public void writeBDMatriz(String host, String database, String user,
            String password, String schema) {

        Endereco endereco = new Endereco();
        String arquivoVersao = endereco.getCaminho() + "\\.kettle\\";

        try {

            /**
             * Lendo o arquivo externamente *
             */
            String arquivo = arquivoVersao + "kettle.properties";

            /**
             * Instanciando objeto do tipo File *
             */
            File file = new File(arquivo);

            /**
             * Instanciando objeto da classe Properties *
             */
            Properties config = new Properties();

            /**
             * Instanciando objeto do tipo FileInpusStream *
             */
            FileInputStream fis = new FileInputStream(file);

            /**
             * carregando o arquivo *
             */
            config.load(fis);

            /**
             * setando as propriedades no arquivo properties *
             */
            config.setProperty("mestre_servidor", host);
            config.setProperty("mestre_database", database);
            config.setProperty("mestre_usuario", user);
            config.setProperty("mestre_senha", password);
            config.setProperty("schema_mestre", schema);

            try (FileOutputStream fos = new FileOutputStream(file)) {
                config.store(fos, "Parametros de configuracao Kettle :");
            }

        } catch (IOException ex) {
            ex.getMessage();
        }
    }

    /**
     * Metodo que grava os dados do banco de dados Filial
     *
     * @param host
     * @param database
     * @param user
     * @param password
     * @param schema
     */
    public void writeBDFilial(String host, String database, String user,
            String password, String schema) {

        Endereco endereco = new Endereco();
        String arquivoVersao = endereco.getCaminho() + "\\.kettle\\";

        try {

            /**
             * Lendo o arquivo externamente *
             */
            String arquivo = arquivoVersao + "kettle.properties";

            /**
             * Instanciando objeto do tipo File *
             */
            File file = new File(arquivo);

            /**
             * Instanciando objeto da classe Properties *
             */
            Properties config = new Properties();

            /**
             * Instanciando objeto do tipo FileInpusStream *
             */
            FileInputStream fis = new FileInputStream(file);

            /**
             * carregando o arquivo *
             */
            config.load(fis);

            /**
             * setando as propriedades no arquivo properties *
             */
            config.setProperty("escravo_servidor", host);
            config.setProperty("escravo_database", database);
            config.setProperty("escravo_usuario", user);
            config.setProperty("escravo_senha", password);
            config.setProperty("schema_escravo", schema);

            try (FileOutputStream fos = new FileOutputStream(file)) {
                config.store(fos, "Parametros de configuracao Kettle :");
            }

        } catch (IOException ex) {
            ex.getMessage();
        }
    }

    /**
     * Metodo que grava os dados do banco de dados Datacenter
     *
     * @param host
     * @param database
     * @param user
     * @param password
     * @param schema
     */
    public void writeBDDatacenter(String host, String database, String user,
            String password, String schema) {

        Endereco endereco = new Endereco();
        String arquivoVersao = endereco.getCaminho() + "\\.kettle\\";

        try {

            /**
             * Lendo o arquivo externamente *
             */
            String arquivo = arquivoVersao + "kettle.properties";

            /**
             * Instanciando objeto do tipo File *
             */
            File file = new File(arquivo);

            /**
             * Instanciando objeto da classe Properties *
             */
            Properties config = new Properties();

            /**
             * Instanciando objeto do tipo FileInpusStream *
             */
            FileInputStream fis = new FileInputStream(file);

            /**
             * carregando o arquivo *
             */
            config.load(fis);

            /**
             * setando as propriedades no arquivo properties *
             */
            config.setProperty("datacenter_servidor", host);
            config.setProperty("datacenter_database", database);
            config.setProperty("datacenter_usuario", user);
            config.setProperty("datacenter_senha", password);
            config.setProperty("schema_datacenter", schema);

            try (FileOutputStream fos = new FileOutputStream(file)) {
                config.store(fos, "Parametros de configuracao Kettle :");
            }

        } catch (IOException ex) {
            ex.getMessage();
        }
    }

    /**
     * Metodo que grava os dados do ftp
     *
     * @param host
     * @param user
     * @param password
     * @param diretorio
     */
    public void writeFTP(String host, String user, String password,
            String diretorio) {

        Endereco endereco = new Endereco();
        String arquivoVersao = endereco.getCaminho() + "\\.kettle\\";

        try {

            /**
             * Lendo o arquivo externamente *
             */
            String arquivo = arquivoVersao + "kettle.properties";

            /**
             * Instanciando objeto do tipo File *
             */
            File file = new File(arquivo);

            /**
             * Instanciando objeto da classe Properties *
             */
            Properties config = new Properties();

            /**
             * Instanciando objeto do tipo FileInpusStream *
             */
            FileInputStream fis = new FileInputStream(file);

            /**
             * carregando o arquivo *
             */
            config.load(fis);

            /**
             * setando as propriedades no arquivo properties *
             */
            config.setProperty("ftp_servidor", host);
            config.setProperty("ftp_usuario", user);
            config.setProperty("ftp_senha", password);
            config.setProperty("ftp_caminho", diretorio);

            try (FileOutputStream fos = new FileOutputStream(file)) {
                config.store(fos, "Parametros de configuracao Kettle :");
            }

        } catch (IOException ex) {
            ex.getMessage();
        }
    }

    /**
     * Metodo que grava os dados comuns da empresa. O nome da empresa e
     * utilizado para envio de emails.
     *
     * @param empresa
     * @param user
     * @param unidade
     */
    public void writeEMPRESA(String empresa, String user, String unidade) {

        Endereco endereco = new Endereco();
        String arquivoVersao = endereco.getCaminho() + "\\.kettle\\";

        try {

            /**
             * Lendo o arquivo externamente *
             */
            String arquivo = arquivoVersao + "kettle.properties";

            /**
             * Instanciando objeto do tipo File *
             */
            File file = new File(arquivo);

            /**
             * Instanciando objeto da classe Properties *
             */
            Properties config = new Properties();

            /**
             * Instanciando objeto do tipo FileInpusStream *
             */
            FileInputStream fis = new FileInputStream(file);

            /**
             * carregando o arquivo *
             */
            config.load(fis);

            /**
             * setando as propriedades no arquivo properties *
             */
            config.setProperty("empresa", empresa);
            config.setProperty("usu_alerta", user);
            config.setProperty("unidade_negocio", unidade);

            try (FileOutputStream fos = new FileOutputStream(file)) {
                config.store(fos, "Parametros de configuracao Kettle :");
            }

        } catch (IOException ex) {
            ex.getMessage();
        }

    }

    /**
     * Metodo que grava algumas configuracoes extras, por exemplo a quantidade
     * de registros que sera enviado por pacote pela filial. Esta variavel nao
     * esta sendo utilizada atualmente. A variavel Kettle_Home pode ser alterada
     * por aqui!
     *
     * @param qtde
     * @param kettle
     */
    public void writeOBS(String qtde, String kettle) {

        Endereco endereco = new Endereco();
        @SuppressWarnings("unused")
        Parametros param = new Parametros();
        String arquivoVersao = endereco.getCaminho() + "\\.kettle\\";

        try {

            /**
             * Lendo o arquivo externamente *
             */
            String arquivo = arquivoVersao + "kettle.properties";

            /**
             * Instanciando objeto do tipo File *
             */
            File file = new File(arquivo);

            /**
             * Instanciando objeto da classe Properties *
             */
            Properties config = new Properties();

            /**
             * Instanciando objeto do tipo FileInpusStream *
             */
            FileInputStream fis = new FileInputStream(file);

            /**
             * carregando o arquivo *
             */
            config.load(fis);

            /**
             * setando as propriedades no arquivo properties *
             */
            config.setProperty("qtde_registros", qtde);

            WindowsCommandUtils.runCommand("SETX /M KETTLE_HOME " + kettle);

            try (FileOutputStream fos = new FileOutputStream(file)) {
                config.store(fos, "Parametros de configuracao Kettle :");
            }

        } catch (IOException ex) {
            ex.getMessage();
        }

    }
}
