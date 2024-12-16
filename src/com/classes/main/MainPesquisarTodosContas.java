package com.classes.main;

import java.util.ArrayList;
import java.util.List;

import com.classes.BO.ContaBO;
import com.classes.DTO.ContaDTO;


public class MainPesquisarTodosContas {

	public static void main(String[] args) {
		// Teste Pesquisar Todos (Retorna a Lista de Marcas)
		ContaBO ContaBO = new ContaBO();
		List<ContaDTO> lista = new ArrayList<ContaDTO>();
		lista = ContaBO.pesquisarTodos();	
		for (ContaDTO conta : lista) {
			System.out.println(conta.toString());
		}

	}

}
