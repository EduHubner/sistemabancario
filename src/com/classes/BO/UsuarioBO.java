package com.classes.BO;

import java.util.List;

import com.classes.DAO.UsuarioDAO;
import com.classes.DTO.UsuarioDTO;

public class UsuarioBO {

    public boolean inserir(UsuarioDTO usuario){
        if (existe(usuario) != true) {
        	UsuarioDAO usuarioDAO = new UsuarioDAO();
            return usuarioDAO.inserir(usuario);
        }
        return false;
    }
    public boolean alterar(UsuarioDTO usuario){
    	UsuarioDAO usuarioDAO = new UsuarioDAO();
        return usuarioDAO.alterarNome(usuario);
    }
    public boolean excluir(UsuarioDTO usuario){
    	UsuarioDAO usuarioDAO = new UsuarioDAO();
        return usuarioDAO.excluir(usuario);
    }
    public UsuarioDTO procurarPorIdUsuario(UsuarioDTO usuario){
    	UsuarioDAO usuarioDAO = new UsuarioDAO();
        return usuarioDAO.procurarPorIdUsuario(usuario);
    }
    public UsuarioDTO procurarPorNome(UsuarioDTO usuario){
    	UsuarioDAO usuarioDAO = new UsuarioDAO();
        return usuarioDAO.procurarPorNome(usuario);
    }
    public UsuarioDTO procurarPorCpf(UsuarioDTO usuario){
    	UsuarioDAO usuarioDAO = new UsuarioDAO();
        return usuarioDAO.procurarPorCpf(usuario);
    }
    public boolean existe(UsuarioDTO usuario){
    	UsuarioDAO usuarioDAO = new UsuarioDAO();
        return usuarioDAO.existe(usuario);
    }
    public List<UsuarioDTO> pesquisarTodos(){
    	UsuarioDAO usuarioDAO = new UsuarioDAO();
        return usuarioDAO.pesquisarTodos();
    }
}