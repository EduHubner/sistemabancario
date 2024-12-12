package com.classes.BO;

import java.util.List;

import com.classes.DAO.TransferenciaDAO;
import com.classes.DTO.TransferenciaDTO;

public class TransferenciaBO {

   public boolean inserir(TransferenciaDTO transferencia){
        if (existe(transferencia) != true) {
        	TransferenciaDAO transferenciaDAO = new TransferenciaDAO();
            return transferenciaDAO.inserir(transferencia);
        }
        return false;
    }
    public boolean alterarValor(TransferenciaDTO transferencia){
    	TransferenciaDAO transferenciaDAO = new TransferenciaDAO();
        return transferenciaDAO.alterarValor(transferencia);
    }
    public boolean excluir(TransferenciaDTO transferencia){
    	TransferenciaDAO transferenciaDAO = new TransferenciaDAO();
        return transferenciaDAO.excluir(transferencia);
    }
    public TransferenciaDTO procurarPorIdTransferencia(TransferenciaDTO transferencia){
    	TransferenciaDAO transferenciaDAO = new TransferenciaDAO();
        return transferenciaDAO.procurarPorIdTransferencia(transferencia);
    }
    public TransferenciaDTO procurarPorContaPaga(TransferenciaDTO transferencia){
    	TransferenciaDAO transferenciaDAO = new TransferenciaDAO();
        return transferenciaDAO.procurarPorContaPaga(transferencia);
    }
    public TransferenciaDTO procurarPorContaRecebe(TransferenciaDTO transferencia){
    	TransferenciaDAO transferenciaDAO = new TransferenciaDAO();
        return transferenciaDAO.procurarPorContaRecebe(transferencia);
    }
    public TransferenciaDTO procurarPorData(TransferenciaDTO transferencia){
    	TransferenciaDAO transferenciaDAO = new TransferenciaDAO();
        return transferenciaDAO.procurarPorData(transferencia);
    }
    public boolean existe(TransferenciaDTO transferencia){
    	TransferenciaDAO transferenciaDAO = new TransferenciaDAO();
        return transferenciaDAO.existe(transferencia);
    }
    public List<TransferenciaDTO> pesquisarTodos(){
    	TransferenciaDAO transferenciaDAO = new TransferenciaDAO();
        return transferenciaDAO.pesquisarTodos();
    }
}