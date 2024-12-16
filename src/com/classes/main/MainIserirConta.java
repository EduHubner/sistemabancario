package com.classes.main;

import com.classes.BO.ContaBO;
import com.classes.DTO.ContaDTO;
import com.classes.DTO.UsuarioDTO;

public class MainIserirConta {

	public static void main(String[] args) {
		
		UsuarioDTO usuario = new UsuarioDTO(5);
		
		ContaBO ContaBO = new ContaBO();
		ContaDTO conta = new ContaDTO(9999999, 7888, usuario);
		if (ContaBO.inserir(conta))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");

	}

}
