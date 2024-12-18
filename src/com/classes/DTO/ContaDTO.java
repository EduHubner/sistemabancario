package com.classes.DTO;

import java.util.ArrayList;
import java.util.List;

import com.classes.BO.UsuarioBO;

public class ContaDTO {
	
	private double saldo;
	private int numConta;
	private int agencia;
	protected UsuarioDTO usuario;
	protected List<TransferenciaDTO> Tranferencias;
	protected List<CartaoDTO> cartao;
	
	public ContaDTO() {
		this.saldo = 0;
		this.Tranferencias = new ArrayList<>();
	}
	
	public ContaDTO(int numConta) {
		this.numConta = numConta;

	}
	
	public ContaDTO(int numConta, int agencia, UsuarioDTO usuario) {
		this.saldo = 0;
		UsuarioBO UsuarioBO = new UsuarioBO();
		UsuarioBO.procurarPorIdUsuario(usuario);
		this.numConta = numConta;
		this.agencia = agencia;
		this.usuario = UsuarioBO.procurarPorIdUsuario(usuario);
		this.Tranferencias = new ArrayList<>();
		this.cartao = new ArrayList<>();
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public UsuarioDTO getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}
	
	public void addTransferencia(TransferenciaDTO transferencia) {
		this.Tranferencias.add(transferencia);
	}
	
	public void addCartao(CartaoDTO cartao) { // Olhar isso pois vai ter que colocar no banco de dados
		this.cartao.add(cartao);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [saldo=");
		builder.append(saldo);
		builder.append(", numConta=");
		builder.append(numConta);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", usuario=");
		builder.append(usuario);
		builder.append(", Tranferencias=");
		builder.append(Tranferencias);
		builder.append(", cartao=");
		builder.append(cartao);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
