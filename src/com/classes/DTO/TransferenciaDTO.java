package com.classes.DTO;

import java.time.LocalDate;

public class TransferenciaDTO {

	private int idTransferencia;
	private LocalDate data;
	private double valor;
	private ContaDTO contaPaga;
	private ContaDTO contaRecebe;
	
	public TransferenciaDTO() {
		this.idTransferencia = (int) Math.random();
		this.data = LocalDate.now();
	}
	
	public TransferenciaDTO(double valor, ContaDTO contaPaga, ContaDTO contaRecebe) {
		this.idTransferencia = (int) Math.random();
		this.data = LocalDate.now();
		this.valor = valor;
		this.contaPaga = contaPaga;
		this.contaRecebe = contaRecebe;
		
	}
	
	public int getIdTransferencia() {
		return idTransferencia;
	}
	public void setIdTransferencia(int idTransferencia) {
		this.idTransferencia = idTransferencia;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void Tranferir() {
		
		this.contaPaga.setSaldo(contaPaga.getSaldo() - this.valor);
		this.contaRecebe.setSaldo(contaRecebe.getSaldo() + this.valor);
		this.contaPaga.addTransferencia(this);
		this.contaRecebe.addTransferencia(this);

	
	}
	
	public double PagarBoletoLeitura() {
		return 0;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Transferencia [idTransferencia=");
		builder.append(idTransferencia);
		builder.append(", data=");
		builder.append(data);
		builder.append(", valor=");
		builder.append(valor);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
