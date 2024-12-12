package com.classes.DTO;

public class UsuarioDTO {

	private int idUsuario;
	private String nome;
	private String cpf;
	
	public UsuarioDTO() {
		
	}
	
	public UsuarioDTO(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public UsuarioDTO(int idUsuario, String nome, String cpf) {
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [idUsuario=");
		builder.append(idUsuario);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", cpf=");
		builder.append(cpf);
		builder.append("]");
		return builder.toString();
	}
	
	
}
