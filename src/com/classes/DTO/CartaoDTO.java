package com.classes.DTO;

import java.util.Date;

public class CartaoDTO {

	private int idCartao;
	private int numCartao;
	private String tipo;
	private int cvv;
	private Date validade;
	protected ContaDTO conta;
	
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getIdCartao() {
		return idCartao;
	}
	public void setIdCartao(int idCartao) {
		this.idCartao = idCartao;
	}
	public ContaDTO getConta() {
		return conta;
	}
	public void setConta(ContaDTO conta) {
		this.conta = conta;
	}
	public int getNumCartao() {
		return numCartao;
	}
	public void setNumCartao(int numCartao) {
		this.numCartao = numCartao;
	}
	public int getCVV() {
		return cvv;
	}
	public void setCVV(int cvv) {
		this.cvv = cvv;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
	public double PagarFatura() {
		return 0;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CartaoDTO [idCartao=");
		builder.append(idCartao);
		builder.append(", numCartao=");
		builder.append(numCartao);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", cvv=");
		builder.append(cvv);
		builder.append(", validade=");
		builder.append(validade);
		builder.append(", conta=");
		builder.append(conta);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
