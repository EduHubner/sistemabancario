package com.classes.main;

import com.classes.BO.MarcaBO;
import com.classes.BO.UsuarioBO;
import com.classes.DTO.Marca;
import com.classes.DTO.UsuarioDTO;

public class MainInsercao {
	public static void main(String[] args) {
		// Teste Inserir
		MarcaBO marcaBO = new MarcaBO();
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
			System.out.println("Erro ao Inserir");
		
		
		
		/*UsuarioBO UsuarioBO = new UsuarioBO();
		UsuarioDTO usuario = new UsuarioDTO("Eduardo", "123.456.798-89");
		if (UsuarioBO.inserir(usuario))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");*/
		
	}
}