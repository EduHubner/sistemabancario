package com.classes.DTO;

import java.util.Date;

public class CartaoDTO {

	private int numCartao;
	private int CVV;
	private Date validade;
	
	public int getNumCartao() {
		return numCartao;
	}
	public void setNumCartao(int numCartao) {
		this.numCartao = numCartao;
	}
	public int getCVV() {
		return CVV;
	}
	public void setCVV(int cVV) {
		CVV = cVV;
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
		builder.append("Cartao [numCartao=");
		builder.append(numCartao);
		builder.append(", CVV=");
		builder.append(CVV);
		builder.append(", validade=");
		builder.append(validade);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
