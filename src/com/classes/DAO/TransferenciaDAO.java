package com.classes.DAO;

import java.sql.Connection;
import java.time.LocalDate;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.classes.Conexao.Conexao;
import com.classes.DTO.TransferenciaDTO;

public class TransferenciaDAO {

	final String NOMEDATABELA = "transferencia";
	
	public boolean inserir(TransferenciaDTO transferencia) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "INSERT INTO " + NOMEDATABELA + " (valor, data, contaPaga, contaRecebe) VALUES (?, ?, ?, ?);";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setDouble(1, transferencia.getValor());
			ps.setDate(2, transferencia.getData()); //ver para mudar a variável da DATA
			ps.setInt(3, transferencia.getContaPaga().getNumConta());
			ps.setInt(4, transferencia.getContaRecebe().getNumConta());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean alterarValor(TransferenciaDTO transferencia) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "UPDATE " + NOMEDATABELA + " SET valor = ? WHERE idTransferencia = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setDouble(1, transferencia.getValor());
			ps.setInt(2, transferencia.getIdTransferencia());
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
	public TransferenciaDTO procurarPorIdTransferencia(TransferenciaDTO transferencia) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idTransferencia = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, transferencia.getIdTransferencia());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				TransferenciaDTO obj = new TransferenciaDTO();
				obj.setIdTransferencia(rs.getInt(1));
				obj.setValor(rs.getInt(2));
				obj.setData(rs.getDate(3));
				obj.getContaPaga().setNumConta((rs.getInt(4)));
				obj.getContaRecebe().setNumConta((rs.getInt(5)));
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
	public TransferenciaDTO procurarPorContaPaga(TransferenciaDTO transferencia) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE contaPaga = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, transferencia.getContaPaga().getNumConta());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				TransferenciaDTO obj = new TransferenciaDTO();
				obj.setIdTransferencia(rs.getInt(1));
				obj.setValor(rs.getInt(2));
				obj.setData(rs.getDate(3));
				obj.getContaPaga().setNumConta((rs.getInt(4)));
				obj.getContaRecebe().setNumConta((rs.getInt(5)));
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
	public TransferenciaDTO procurarPorContaRecebe(TransferenciaDTO transferencia) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE contaRecebe = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, transferencia.getContaRecebe().getNumConta());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				TransferenciaDTO obj = new TransferenciaDTO();
				obj.setIdTransferencia(rs.getInt(1));
				obj.setValor(rs.getInt(2));
				obj.setData(rs.getDate(3));
				obj.getContaPaga().setNumConta((rs.getInt(4)));
				obj.getContaRecebe().setNumConta((rs.getInt(5)));
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
	public TransferenciaDTO procurarPorData(TransferenciaDTO transferencia) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE data = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, transferencia.getData());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				TransferenciaDTO obj = new TransferenciaDTO();
				obj.setIdTransferencia(rs.getInt(1));
				obj.setValor(rs.getInt(2));
				obj.setData(rs.getDate(3));
				obj.getContaPaga().setNumConta((rs.getInt(4)));
				obj.getContaRecebe().setNumConta((rs.getInt(5)));
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
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idTransferencia = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, transferencia.getIdTransferencia());
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
				obj.setValor(rs.getInt(2));
				obj.setData(rs.getDate(3));
				obj.getContaPaga().setNumConta((rs.getInt(4)));
				obj.getContaRecebe().setNumConta((rs.getInt(5)));
				listObj.add(obj);
			}
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
