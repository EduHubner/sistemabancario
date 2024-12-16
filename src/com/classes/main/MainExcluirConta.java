package com.classes.main;

import com.classes.BO.ContaBO;
import com.classes.DTO.ContaDTO;

public class MainExcluirConta {

	public static void main(String[] args) {
		ContaBO ContaBO = new ContaBO();
		ContaDTO conta = new ContaDTO(123456);
		ContaBO.excluir(conta);

	}

}
