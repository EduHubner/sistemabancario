package com.classes.BO;

import java.util.List;

import com.classes.DAO.UsuarioDAO;
import com.classes.DTO.UsuarioDTO;

public class UsuarioBO {

    public boolean inserir(UsuarioDTO usuario){
        if (existe(usuario) != true) {
        	UsuarioDAO UsuarioDAO = new UsuarioDAO();
            return UsuarioDAO.inserir(usuario);
        }
        return false;
    }
    public boolean alterar(UsuarioDTO usuario){
    	UsuarioDAO UsuarioDAO = new UsuarioDAO();
        return UsuarioDAO.alterarNome(usuario);
    }
    public boolean excluir(UsuarioDTO usuario){
    	UsuarioDAO UsuarioDAO = new UsuarioDAO();
        return UsuarioDAO.excluir(usuario);
    }
    public UsuarioDTO procurarPorCodigo(UsuarioDTO usuario){
    	UsuarioDAO UsuarioDAO = new UsuarioDAO();
        return UsuarioDAO.procurarPorCodigo(usuario);
    }
    public UsuarioDTO procurarPorDescricao(UsuarioDTO usuario){
    	UsuarioDAO UsuarioDAO = new UsuarioDAO();
        return UsuarioDAO.procurarPorNome(usuario);
    }
    public UsuarioDTO procurarPorCpf(UsuarioDTO usuario){
    	UsuarioDAO UsuarioDAO = new UsuarioDAO();
        return UsuarioDAO.procurarPorCpf(usuario);
    }
    public boolean existe(UsuarioDTO usuario){
    	UsuarioDAO UsuarioDAO = new UsuarioDAO();
        return UsuarioDAO.existe(usuario);
    }
    public List<UsuarioDTO> pesquisarTodos(){
    	UsuarioDAO UsuarioDAO = new UsuarioDAO();
        return UsuarioDAO.pesquisarTodos();
    }
}