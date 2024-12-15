package com.classes.BO;

import java.util.List;

import com.classes.DAO.PagamentoDAO;
import com.classes.DTO.PagamentoDTO;

public class PagamentoBO {

   public boolean inserir(PagamentoDTO pagamento){
        if (existe(pagamento) != true && existeTransferencia(pagamento) != true) {
        	PagamentoDAO PagamentoDAO = new PagamentoDAO();
            return PagamentoDAO.inserir(pagamento);
        }
        return false;
    }
    public boolean alterarContaPagante(PagamentoDTO pagamento){
    	PagamentoDAO PagamentoDAO = new PagamentoDAO();
        return PagamentoDAO.alterarContaPagante(pagamento);
    }
    public boolean excluir(PagamentoDTO pagamento){
    	PagamentoDAO PagamentoDAO = new PagamentoDAO();
        return PagamentoDAO.excluir(pagamento);
    }
    public PagamentoDTO procurarPorIdPagamento(PagamentoDTO pagamento){
    	PagamentoDAO PagamentoDAO = new PagamentoDAO();
        return PagamentoDAO.procurarPorIdPagamento(pagamento);
    }
    public PagamentoDTO procurarPorTransferencia(PagamentoDTO pagamento){
    	PagamentoDAO PagamentoDAO = new PagamentoDAO();
        return PagamentoDAO.procurarPorTransferencia(pagamento);
    }
    public PagamentoDTO procurarPorContaPagante(PagamentoDTO pagamento){
    	PagamentoDAO PagamentoDAO = new PagamentoDAO();
        return PagamentoDAO.procurarPorContaPagante(pagamento);
    }
    public boolean existe(PagamentoDTO pagamento){
    	PagamentoDAO PagamentoDAO = new PagamentoDAO();
        return PagamentoDAO.existe(pagamento);
    }
    public boolean existeTransferencia(PagamentoDTO pagamento){
    	PagamentoDAO PagamentoDAO = new PagamentoDAO();
        return PagamentoDAO.existeTransferencia(pagamento);
    }
    public List<PagamentoDTO> pesquisarTodos(){
    	PagamentoDAO PagamentoDAO = new PagamentoDAO();
        return PagamentoDAO.pesquisarTodos();
    }
}