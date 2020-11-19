package br.com.roberto.jdbc.model;

/**
 * 
 * @author jrpbjr
 * vamos usar para retornar se a nossa operação foi executada com sucesso ou se teve algum erro, 
 * vamos usar nas operações de insert, update e delete, abaixo o código de como deve ficar a 
 * nossa classe
 *
 */

public class ResultadoModel {
	 
	private int codigo;
	private String mensagem;
 
	public ResultadoModel(){
 
	}
 
	public ResultadoModel(int codigo, String mensagem) {
		super();
		this.codigo = codigo;
		this.mensagem = mensagem;
	}
 
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}