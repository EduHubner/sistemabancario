package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.classes.Conexao.Conexao;
import com.classes.DTO.TransferenciaDTO;

public class TransferenciaDAO {

	/*final String NOMEDATABELA = "transferencia";
	
	public boolean inserir(TransferenciaDTO transferencia) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "INSERT INTO " + NOMEDATABELA + " (nome, cpf) VALUES (?, ?);";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, transferencia.getNome());
			ps.setString(2, transferencia.getCpf());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean alterarNome(TransferenciaDTO transferencia) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "UPDATE " + NOMEDATABELA + " SET nome = ? WHERE idTransferencia = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, transferencia.getNome());
			ps.setString(2, transferencia.getCpf());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean excluir(TransferenciaDTO transferencia) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "DELETE FROM " + NOMEDATABELA + " WHERE idTransferencia = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, transferencia.getIdTransferencia());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public TransferenciaDTO procurarPorCodigo(TransferenciaDTO transferencia) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idTransferencia = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, transferencia.getIdtransferencia());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				TransferenciaDTO obj = new TransferenciaDTO();
				obj.setIdTransferencia(rs.getInt(1));
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
	public TransferenciaDTO procurarPorNome(TransferenciaDTO transferencia) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nome = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, transferencia.getNome());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				TransferenciaDTO obj = new TransferenciaDTO();
				obj.setIdTransferencia(rs.getInt(1));
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
	public TransferenciaDTO procurarPorCpf(TransferenciaDTO transferencia) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE cpf = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, transferencia.getCpf());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				TransferenciaDTO obj = new TransferenciaDTO();
				obj.setIdTransferencia(rs.getInt(1));
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
	public boolean existe(TransferenciaDTO transferencia) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE cpf = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, transferencia.getCpf());
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
	public List<TransferenciaDTO> pesquisarTodos() {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + ";";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<TransferenciaDTO> listObj = montarLista(rs);
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public List<TransferenciaDTO> montarLista(ResultSet rs) {
		List<TransferenciaDTO> listObj = new ArrayList<TransferenciaDTO>();
		try {
			while (rs.next()) {
				TransferenciaDTO obj = new TransferenciaDTO();
				obj.setIdTransferencia(rs.getInt(1));
				obj.setNome(rs.getString(2));
				obj.setCpf(rs.getString(2));
				listObj.add(obj);
			}
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}*/
}
