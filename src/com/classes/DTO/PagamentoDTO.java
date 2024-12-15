package com.classes.DTO;

public class PagamentoDTO{

	private int idPagamento;
	private String tipo;
	protected TransferenciaDTO transferencia;
	
	public PagamentoDTO() {
		
	}
	
	public PagamentoDTO(TransferenciaDTO transferencia, int tipo) {
		this.transferencia = transferencia;
		boolean loop = true;
		do {
			switch (tipo) {
			case 1:
				this.tipo = "Boleto";
				loop = false;
				break;
			case 2:
				this.tipo = "Pix";
				loop = false;
				break;
			case 3:
				this.tipo = "Cartão";
				loop = false;
				break;
			default:
				System.out.println("O valor inserido não corresponde a um valor dos valores apresentados para escolha!");
			}
		} while (loop);
		
	}

	
	public int getIdPagamento() {
		return idPagamento;
	}
	public void setIdPagamento(int idPagamento) {
		this.idPagamento = idPagamento;
	}
	public TransferenciaDTO getTransferencia() {
		return transferencia;
	}
	public void setTransferencia(TransferenciaDTO transferencia) {
		this.transferencia = transferencia;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public double Pagar() {

		this.transferencia.Tranferir();
		//Fazer uma interface de pagamento, mostrando quem ta pagando e tals
		
		
		return 0;
		
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PagamentoDTO [idPagamento=");
		builder.append(idPagamento);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
