package com.classes.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.classes.Conexao.Conexao;
import com.classes.DTO.CartaoDTO;

public class CartaoDAO {

	final String NOMEDATABELA = "cartao";
	
	public boolean inserir(CartaoDTO cartao) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "INSERT INTO " + NOMEDATABELA + " (numCartao, cvv, validade, conta, tipo) VALUES (?, ?, ?, ?, ?);";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, cartao.getNumCartao());
			ps.setInt(2, cartao.getCVV());
			ps.setDate(3, (Date) cartao.getValidade());
			ps.setInt(4, cartao.getConta().getNumConta());
			ps.setString(5, cartao.getTipo());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean alterarTipo(CartaoDTO cartao) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "UPDATE " + NOMEDATABELA + " SET tipo = ? WHERE idcartao = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(5, cartao.getTipo());
			ps.setInt(2, cartao.getIdCartao());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean excluir(CartaoDTO cartao) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "DELETE FROM " + NOMEDATABELA + " WHERE idcartao = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, cartao.getIdCartao());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public CartaoDTO procurarPorIdCartao(CartaoDTO cartao) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idcartao = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, cartao.getIdCartao());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				CartaoDTO obj = new CartaoDTO();
				obj.setIdCartao(rs.getInt(1));
				obj.setCVV(rs.getInt(2));
				obj.setValidade(rs.getDate(3));
				obj.getConta().setNumConta((rs.getInt(4)));
				obj.setTipo(rs.getString(5));
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
	public CartaoDTO procurarPorConta(CartaoDTO cartao) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE conta = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, cartao.getConta().getNumConta());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				CartaoDTO obj = new CartaoDTO();
				obj.setIdCartao(rs.getInt(1));
				obj.setCVV(rs.getInt(2));
				obj.setValidade(rs.getDate(3));
				obj.getConta().setNumConta((rs.getInt(4)));
				obj.setTipo(rs.getString(5));
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
	public CartaoDTO procurarPorCVV(CartaoDTO cartao) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE cvv = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, cartao.getCVV());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				CartaoDTO obj = new CartaoDTO();
				obj.setIdCartao(rs.getInt(1));
				obj.setCVV(rs.getInt(2));
				obj.setValidade(rs.getDate(3));
				obj.getConta().setNumConta((rs.getInt(4)));
				obj.setTipo(rs.getString(5));
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
	public CartaoDTO procurarPorNumCartao(CartaoDTO cartao) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE numCartao = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, cartao.getNumCartao());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				CartaoDTO obj = new CartaoDTO();
				obj.setIdCartao(rs.getInt(1));
				obj.setCVV(rs.getInt(2));
				obj.setValidade(rs.getDate(3));
				obj.getConta().setNumConta((rs.getInt(4)));
				obj.setTipo(rs.getString(5));
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
	public boolean existe(CartaoDTO cartao) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idcartao = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, cartao.getIdCartao());
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
	public boolean existeNumCartao(CartaoDTO cartao) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE numCartao = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, cartao.getNumCartao());
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
	public List<CartaoDTO> pesquisarTodos() {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + ";";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<CartaoDTO> listObj = montarLista(rs);
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public List<CartaoDTO> montarLista(ResultSet rs) {
		List<CartaoDTO> listObj = new ArrayList<CartaoDTO>();
		try {
			while (rs.next()) {
				CartaoDTO obj = new CartaoDTO();
				obj.setIdCartao(rs.getInt(1));
				obj.setCVV(rs.getInt(2));
				obj.setValidade(rs.getDate(3));
				obj.getConta().setNumConta((rs.getInt(4)));
				listObj.add(obj);
			}
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
