package com.classes.DTO;

import java.sql.Date;
import java.time.LocalDate;

import com.classes.BO.ContaBO;

public class TransferenciaDTO {

	private int idTransferencia;
	private Date data;
	private double valor;
	private ContaDTO contaPaga;
	private ContaDTO contaRecebe;
	
	public TransferenciaDTO() {
		LocalDate localDate = LocalDate.now();
        this.data = Date.valueOf(localDate);
	}
	
	public TransferenciaDTO(double valor, ContaDTO contaPaga, ContaDTO contaRecebe) {
		LocalDate localDate = LocalDate.now();
        this.data = Date.valueOf(localDate);
		this.valor = valor;
		this.contaPaga = contaPaga;
		this.contaRecebe = contaRecebe;
		
		
		
	}
	
	public ContaDTO getContaPaga() {
		return contaPaga;
	}
	public void setContaPaga(ContaDTO contaPaga) {
		this.contaPaga = contaPaga;
	}
	public ContaDTO getContaRecebe() {
		return contaRecebe;
	}
	public void setContaRecebe(ContaDTO contaRecebe) {
		this.contaRecebe = contaRecebe;
	}
	public int getIdTransferencia() {
		return idTransferencia;
	}
	public void setIdTransferencia(int idTransferencia) {
		this.idTransferencia = idTransferencia;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
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
		/*this.contaPaga.addTransferencia(this);
		this.contaRecebe.addTransferencia(this);*/
		
		ContaBO ContaBO = new ContaBO();
		ContaBO.alterarSaldo(this.contaPaga);
		ContaBO.alterarSaldo(this.contaRecebe);

	
	}
	
	public double PagarBoletoLeitura() {
		return 0;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TransferenciaDTO [idTransferencia=");
		builder.append(idTransferencia);
		builder.append(", data=");
		builder.append(data);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", contaPaga=");
		builder.append(contaPaga);
		builder.append(", contaRecebe=");
		builder.append(contaRecebe);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
	
}
