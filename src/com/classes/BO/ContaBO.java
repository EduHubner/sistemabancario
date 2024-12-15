package com.classes.BO;

import java.util.List;

import com.classes.DAO.ContaDAO;
import com.classes.DTO.ContaDTO;

public class ContaBO {

   public boolean inserir(ContaDTO conta){
        if (existe(conta) != true && existeUsuario(conta) != true) {
        	ContaDAO ContaDAO = new ContaDAO();
            return ContaDAO.inserir(conta);
        }
        return false;
    }
    public boolean alterarSaldo(ContaDTO conta){
    	ContaDAO ContaDAO = new ContaDAO();
        return ContaDAO.alterarSaldo(conta);
    }
    public boolean excluir(ContaDTO conta){
    	ContaDAO ContaDAO = new ContaDAO();
        return ContaDAO.excluir(conta);
    }
    public ContaDTO procurarPorNumConta(ContaDTO conta){
    	ContaDAO ContaDAO = new ContaDAO();
        return ContaDAO.procurarPorNumConta(conta);
    }
    public ContaDTO procurarPorUsuarioId(ContaDTO conta){
    	ContaDAO ContaDAO = new ContaDAO();
        return ContaDAO.procurarPorUsuarioId(conta);
    }
    public ContaDTO procurarPorUsuarioNome(ContaDTO conta){
    	ContaDAO ContaDAO = new ContaDAO();
        return ContaDAO.procurarPorUsuarioNome(conta);
    }
    public ContaDTO procurarPorSaldoMais(ContaDTO conta){
    	ContaDAO ContaDAO = new ContaDAO();
        return ContaDAO.procurarPorSaldoMais(conta);
    }
    public boolean existe(ContaDTO conta){
    	ContaDAO ContaDAO = new ContaDAO();
        return ContaDAO.existe(conta);
    }
    public boolean existeUsuario(ContaDTO conta){
    	ContaDAO ContaDAO = new ContaDAO();
        return ContaDAO.existeUsuario(conta);
    }
    public List<ContaDTO> pesquisarTodos(){
    	ContaDAO ContaDAO = new ContaDAO();
        return ContaDAO.pesquisarTodos();
    }
}