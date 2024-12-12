package com.classes.DTO;

import java.time.LocalDate;

public class TransferenciaDTO {

	private int idTransferencia;
	private LocalDate data;
	private double valor;
	
	public TransferenciaDTO() {
		this.idTransferencia = (int) Math.random();
		this.data = LocalDate.now();
	}
	
	public TransferenciaDTO(double valor) {
		this.idTransferencia = (int) Math.random();
		this.data = LocalDate.now();
		this.valor = valor;
		
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
	
	public void Tranferir(ContaDTO contaPaga, ContaDTO contaRecebe) {
		
		contaPaga.setSaldo(contaPaga.getSaldo() - this.valor);
		contaRecebe.setSaldo(contaRecebe.getSaldo() + this.valor);
		contaPaga.addTransferencia(this);
		contaRecebe.addTransferencia(this);

	
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
