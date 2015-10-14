package br.unisinos.financeiro.dominio;

public enum DominioSituacaoCheque {
	
	BAIXADO('B', "Cheque Baixado"),
	CANCELADO('C', "Cheque Cancelado"),
	NAO_EMITIDO('N', "Cheque Não Emitido");
	
	private final char situacao;
	private final String descricao;
	
	private DominioSituacaoCheque(char situacao, String descricao) {
		this.situacao = situacao;
		this.descricao = descricao;
	}

	public char getSituacao() {
		return situacao;
	}

	public String getDescricao() {
		return descricao;
	}

}
