package com.classes.main;


import com.classes.BO.ContaBO;
import com.classes.BO.TransferenciaBO;
import com.classes.BO.UsuarioBO;
import com.classes.DTO.ContaDTO;
import com.classes.DTO.TransferenciaDTO;
import com.classes.DTO.UsuarioDTO;

public class MainInsercao {
	public static void main(String[] args) {
		// Teste Inserir
		/*MarcaBO marcaBO = new MarcaBO();
		Marca marca = new Marca("aaa");
		if (marcaBO.inserir(marca))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		marca = new Marca("sss");
		if (marcaBO.inserir(marca))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		marca = new Marca("ddd");
		if (marcaBO.inserir(marca))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");*/
		
		
		
		/*UsuarioBO UsuarioBO = new UsuarioBO();
		UsuarioDTO usuario = new UsuarioDTO("BBBBB", "777777");
		if (UsuarioBO.inserir(usuario))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		ContaBO ContaBO = new ContaBO();
		ContaDTO conta = new ContaDTO(222222, 3333, usuario);
		if (ContaBO.inserir(conta))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");*/
		
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