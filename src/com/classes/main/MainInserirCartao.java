package com.classes.main;


import com.classes.BO.CartaoBO;
import com.classes.DTO.CartaoDTO;
import com.classes.DTO.ContaDTO;


public class MainInserirCartao {

	public static void main(String[] args) {
		ContaDTO conta = new ContaDTO(222222);
		
		CartaoBO CartaoBO = new CartaoBO();
		CartaoDTO cartao = new CartaoDTO(555555, "Crédito", 999, conta);
		if (CartaoBO.inserir(cartao))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		

	}

}
