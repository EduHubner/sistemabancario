package com.classes.main;

import java.util.ArrayList;
import java.util.List;

import com.classes.BO.UsuarioBO;
import com.classes.DTO.UsuarioDTO;

public class MainPesquisarTodosUsuarios {

	public static void main(String[] args) {
		// Teste Pesquisar Todos (Retorna a Lista de Marcas)
			UsuarioBO UsuarioBO = new UsuarioBO();
			List<UsuarioDTO> lista = new ArrayList<UsuarioDTO>();
			lista = UsuarioBO.pesquisarTodos();	
			for (UsuarioDTO usuario : lista) {
				System.out.println(usuario.toString());
			}

	}

}
