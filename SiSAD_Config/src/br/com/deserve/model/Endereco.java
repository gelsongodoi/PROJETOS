package br.com.deserve.model;

public class Endereco {

    private String active;
    private String tipo;
    private String caminho;
    private String caminho_v2;
    private String path;
    private String param;
    private String parametro;
    private String agendamento;
    private String tempoInativo;
    private String raizProjeto;
    private String exeNome;

    public Endereco() {
    }

    public Endereco(String active, String tipo, String caminho, String path,
            String param, String parametro, String agendamento,
            String tempoInativo, String raizProjeto, String exeNome, String caminho_v2) {
        super();
        this.active = active;
        this.tipo = tipo;
        this.caminho = caminho;
        this.path = path;
        this.param = param;
        this.parametro = parametro;
        this.agendamento = agendamento;
        this.tempoInativo = tempoInativo;
        this.raizProjeto = raizProjeto;
        this.exeNome = exeNome;
        this.caminho_v2 = caminho_v2;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCaminho() {
        this.caminho = System.getenv("KETTLE_HOME");
        if (this.caminho == null) {
            this.caminho = System.getenv("PENTAHO_HOME");
        } else {
            this.caminho = System.getenv("KETTLE_HOME");
        }
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

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

    public String getParametro() {
        return parametro;
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    public String getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(String agendamento) {
        this.agendamento = agendamento;
    }

    public String getTempoInativo() {
        return tempoInativo;
    }

    public void setTempoInativo(String tempoInativo) {
        this.tempoInativo = tempoInativo;
    }

    public String getRaizProjeto() {
        return raizProjeto;
    }

    public void setRaizProjeto(String raizProjeto) {
        this.raizProjeto = raizProjeto;
    }

    public String getExeNome() {
        return exeNome;
    }

    public void setExeNome(String exeNome) {
        this.exeNome = exeNome;
    }

    public String getCaminho_v2() {
        this.caminho_v2 = System.getenv("KETTLE_HOME_v5");
        if (this.caminho_v2 == null) {
            this.caminho_v2 = System.getenv("PENTAHO_HOME_v5");
        } else {
            this.caminho_v2 = System.getenv("KETTLE_HOME_v5");
        }
        return caminho_v2;
    }

    public void setCaminho_v2(String caminho_v2) {
        this.caminho_v2 = caminho_v2;
    }

}
