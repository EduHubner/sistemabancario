package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.classes.Conexao.Conexao;
import com.classes.DTO.UsuarioDTO;

public class UsuarioDAO {

	final String NOMEDATABELA = "usuario";
	
	public boolean inserir(UsuarioDTO usuario) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "INSERT INTO " + NOMEDATABELA + " (nome, cpf) VALUES (?, ?);";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getCpf());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean alterarNome(UsuarioDTO usuario) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "UPDATE " + NOMEDATABELA + " SET nome = ? WHERE idUsuario = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getCpf());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean excluir(UsuarioDTO usuario) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "DELETE FROM " + NOMEDATABELA + " WHERE idUsuario = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, usuario.getIdUsuario());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public UsuarioDTO procurarPorCodigo(UsuarioDTO usuario) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idUsuario = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, usuario.getIdUsuario());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				UsuarioDTO obj = new UsuarioDTO();
				obj.setIdUsuario(rs.getInt(1));
				obj.setNome(rs.getString(2));
				obj.setCpf(rs.getString(3));
				ps.close();
				rs.close();
				conn.close();
				return obj;
			} else {
				ps.close();
				rs.close();
				conn.close();
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public UsuarioDTO procurarPorNome(UsuarioDTO usuario) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nome = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, usuario.getNome());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				UsuarioDTO obj = new UsuarioDTO();
				obj.setIdUsuario(rs.getInt(1));
				obj.setNome(rs.getString(2));
				ps.close();
				rs.close();
				conn.close();
				return obj;
			} else {
				ps.close();
				rs.close();
				conn.close();
				return null;
			}
		} catch (Exception e) {
			return null;
		}
	}
	public UsuarioDTO procurarPorCpf(UsuarioDTO usuario) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE cpf = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, usuario.getCpf());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				UsuarioDTO obj = new UsuarioDTO();
				obj.setIdUsuario(rs.getInt(1));
				obj.setCpf(rs.getString(2));
				ps.close();
				rs.close();
				conn.close();
				return obj;
			} else {
				ps.close();
				rs.close();
				conn.close();
				return null;
			}
		} catch (Exception e) {
			return null;
		}
	}
	public boolean existe(UsuarioDTO usuario) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE cpf = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, usuario.getCpf());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ps.close();
				rs.close();
				conn.close();
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}
	public List<UsuarioDTO> pesquisarTodos() {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + ";";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<UsuarioDTO> listObj = montarLista(rs);
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public List<UsuarioDTO> montarLista(ResultSet rs) {
		List<UsuarioDTO> listObj = new ArrayList<UsuarioDTO>();
		try {
			while (rs.next()) {
				UsuarioDTO obj = new UsuarioDTO();
				obj.setIdUsuario(rs.getInt(1));
				obj.setNome(rs.getString(2));
				obj.setCpf(rs.getString(2));
				listObj.add(obj);
			}
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
