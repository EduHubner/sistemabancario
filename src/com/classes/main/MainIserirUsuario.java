package com.classes.main;

import com.classes.BO.UsuarioBO;
import com.classes.DTO.UsuarioDTO;

public class MainIserirUsuario {

	public static void main(String[] args) {
		UsuarioBO UsuarioBO = new UsuarioBO();
		UsuarioDTO usuario = new UsuarioDTO("BBBBB", "777777");
		if (UsuarioBO.inserir(usuario))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		

	}

}
