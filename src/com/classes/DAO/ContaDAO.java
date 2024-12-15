package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.classes.Conexao.Conexao;
import com.classes.DTO.ContaDTO;

public class ContaDAO {

	final String NOMEDATABELA = "conta";
	
	public boolean inserir(ContaDTO conta) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "INSERT INTO " + NOMEDATABELA + " (numconta, saldo, agencia, usuarioNome, usuarioId) VALUES (?, ?, ?, ?, ?);";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, conta.getNumConta());
			ps.setDouble(2, conta.getSaldo());
			ps.setInt(3, conta.getAgencia());
			ps.setString(4, conta.getUsuario().getNome());
			ps.setInt(4, conta.getUsuario().getIdUsuario());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean alterarSaldo(ContaDTO conta) { 
		try {
			Connection conn = Conexao.conectar();
			String sql = "UPDATE " + NOMEDATABELA + " SET saldo = ? WHERE numconta = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setDouble(1, conta.getSaldo());
			ps.setInt(2, conta.getNumConta());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean excluir(ContaDTO conta) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "DELETE FROM " + NOMEDATABELA + " WHERE numconta = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, conta.getNumConta());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public ContaDTO procurarPorNumConta(ContaDTO conta) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE numconta = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, conta.getNumConta());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ContaDTO obj = new ContaDTO();
				obj.setNumConta(rs.getInt(1));
				obj.setSaldo(rs.getDouble(2));
				obj.setAgencia(rs.getInt(3));
				obj.getUsuario().setNome((rs.getString(4)));
				obj.getUsuario().setIdUsuario((rs.getInt(5)));
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
	public ContaDTO procurarPorUsuarioId(ContaDTO conta) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE usuarioId = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, conta.getUsuario().getIdUsuario());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ContaDTO obj = new ContaDTO();
				obj.setNumConta(rs.getInt(1));
				obj.setSaldo(rs.getDouble(2));
				obj.setAgencia(rs.getInt(3));
				obj.getUsuario().setNome((rs.getString(4)));
				obj.getUsuario().setIdUsuario((rs.getInt(5)));
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
	public ContaDTO procurarPorUsuarioNome(ContaDTO conta) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE usuarioNome = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, conta.getUsuario().getNome());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ContaDTO obj = new ContaDTO();
				obj.setNumConta(rs.getInt(1));
				obj.setSaldo(rs.getDouble(2));
				obj.setAgencia(rs.getInt(3));
				obj.getUsuario().setNome((rs.getString(4)));
				obj.getUsuario().setIdUsuario((rs.getInt(5)));
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
	public ContaDTO procurarPorSaldoMais(ContaDTO conta) { //Olhar se essa linguagem de SQL funciona
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE saldo > ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setDouble(1, conta.getSaldo());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ContaDTO obj = new ContaDTO();
				obj.setNumConta(rs.getInt(1));
				obj.setSaldo(rs.getDouble(2));
				obj.setAgencia(rs.getInt(3));
				obj.getUsuario().setNome((rs.getString(4)));
				obj.getUsuario().setIdUsuario((rs.getInt(5)));
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
	public boolean existe(ContaDTO conta) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE numconta = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, conta.getNumConta());
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
	public boolean existeUsuario(ContaDTO conta) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE usuarioId = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, conta.getUsuario().getIdUsuario());
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
	public List<ContaDTO> pesquisarTodos() {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + ";";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<ContaDTO> listObj = montarLista(rs);
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public List<ContaDTO> montarLista(ResultSet rs) {
		List<ContaDTO> listObj = new ArrayList<ContaDTO>();
		try {
			while (rs.next()) {
				ContaDTO obj = new ContaDTO();
				obj.setNumConta(rs.getInt(1));
				obj.setSaldo(rs.getDouble(2));
				obj.setAgencia(rs.getInt(3));
				obj.getUsuario().setNome((rs.getString(4)));
				obj.getUsuario().setIdUsuario((rs.getInt(5)));
				listObj.add(obj);
			}
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
