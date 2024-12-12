package com.classes.DTO;

public class Main {

	public static void main(String[] args) {
		
		UsuarioDTO user1 = new UsuarioDTO(123, "Carlos", "123.456.799-87");
		
		System.out.println(user1);
		
		UsuarioDTO user2 = new UsuarioDTO(321, "ROger", "987.654.654-15");
		
		System.out.println(user2);
		
		ContaDTO conta1 = new ContaDTO(999999, 123465, user1);
		
		System.out.println(conta1);
		
		ContaDTO conta2 = new ContaDTO(88888, 1265, user2);
		
		System.out.println(conta2);
		
		
		
		TransferenciaDTO trandas = new TransferenciaDTO(1000);
		TransferenciaDTO t2 = new TransferenciaDTO(5000);
		
		trandas.Tranferir(conta1, conta2);
		t2.Tranferir(conta2, conta1);
		
		
		System.out.println(conta1);
		System.out.println(conta2);
		
		System.out.println("\nTranferencias da Conta 1: \n" + conta1.Tranferencias);
		
		System.out.println(t2.getIdTransferencia());
		
	}

}
