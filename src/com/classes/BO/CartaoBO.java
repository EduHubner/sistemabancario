package com.classes.BO;

import java.util.List;

import com.classes.DAO.CartaoDAO;
import com.classes.DTO.CartaoDTO;

public class CartaoBO {

   public boolean inserir(CartaoDTO cartao){
        if (existe(cartao) != true && existeNumCartao(cartao) != true) {
        	CartaoDAO CartaoDAO = new CartaoDAO();
            return CartaoDAO.inserir(cartao);
        }
        return false;
    }
    public boolean alterarTipo(CartaoDTO cartao){
    	CartaoDAO CartaoDAO = new CartaoDAO();
        return CartaoDAO.alterarTipo(cartao);
    }
    public boolean excluir(CartaoDTO cartao){
    	CartaoDAO CartaoDAO = new CartaoDAO();
        return CartaoDAO.excluir(cartao);
    }
    public CartaoDTO procurarPorIdCartao(CartaoDTO cartao){
    	CartaoDAO CartaoDAO = new CartaoDAO();
        return CartaoDAO.procurarPorIdCartao(cartao);
    }
    public CartaoDTO procurarPorConta(CartaoDTO cartao){
    	CartaoDAO CartaoDAO = new CartaoDAO();
        return CartaoDAO.procurarPorConta(cartao);
    }
    public CartaoDTO procurarPorCVV(CartaoDTO cartao){
    	CartaoDAO CartaoDAO = new CartaoDAO();
        return CartaoDAO.procurarPorCVV(cartao);
    }
    public CartaoDTO procurarPorNumCartao(CartaoDTO cartao){
    	CartaoDAO CartaoDAO = new CartaoDAO();
        return CartaoDAO.procurarPorNumCartao(cartao);
    }
    public boolean existe(CartaoDTO cartao){
    	CartaoDAO CartaoDAO = new CartaoDAO();
        return CartaoDAO.existe(cartao);
    }
    public boolean existeNumCartao(CartaoDTO cartao){
    	CartaoDAO CartaoDAO = new CartaoDAO();
        return CartaoDAO.existeNumCartao(cartao);
    }
    public List<CartaoDTO> pesquisarTodos(){
    	CartaoDAO CartaoDAO = new CartaoDAO();
        return CartaoDAO.pesquisarTodos();
    }
}