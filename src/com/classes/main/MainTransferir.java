package com.classes.main;

import com.classes.BO.TransferenciaBO;
import com.classes.DTO.ContaDTO;
import com.classes.DTO.TransferenciaDTO;

public class MainTransferir {

	public static void main(String[] args) {
		ContaDTO conta = new ContaDTO(222222);
		ContaDTO contaRecebe = new ContaDTO(123456);
		
		TransferenciaBO TransferenciaBO = new TransferenciaBO();
		TransferenciaDTO transferencia = new TransferenciaDTO(1000, conta, contaRecebe);
		if (TransferenciaBO.inserir(transferencia))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		transferencia.Tranferir();

	}

}
