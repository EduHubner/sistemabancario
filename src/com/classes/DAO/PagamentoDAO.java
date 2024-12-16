package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.classes.Conexao.Conexao;
import com.classes.DTO.PagamentoDTO;

public class PagamentoDAO {

	final String NOMEDATABELA = "pagamento";
	
	public boolean inserir(PagamentoDTO pagamento) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "INSERT INTO " + NOMEDATABELA + " (tipo, transferenciaId, numContaPagante) VALUES (?, ?, ?);";
			PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, pagamento.getTipo());
			ps.setInt(2, pagamento.getTransferencia().getIdTransferencia());
			ps.setInt(3, pagamento.getTransferencia().getContaPaga().getNumConta());

			int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    pagamento.setIdPagamento(rs.getInt(1));
                    System.out.println("ID do novo pagamento: " + pagamento.getIdPagamento());
                }
            }
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean alterarContaPagante(PagamentoDTO pagamento) { //Vou ter que fazer aqui sempre que tiver uma alteração de saldo na pagamento
		try {
			Connection conn = Conexao.conectar();
			String sql = "UPDATE " + NOMEDATABELA + " SET numContaPagante = ? WHERE idPagamento = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, pagamento.getTransferencia().getContaPaga().getNumConta());
			ps.setInt(2, pagamento.getIdPagamento());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean excluir(PagamentoDTO pagamento) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "DELETE FROM " + NOMEDATABELA + " WHERE idPagamento = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, pagamento.getIdPagamento());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public PagamentoDTO procurarPorIdPagamento(PagamentoDTO pagamento) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idPagamento = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, pagamento.getIdPagamento());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				PagamentoDTO obj = new PagamentoDTO();
				obj.setIdPagamento(rs.getInt(1));
				obj.setTipo(rs.getString(2));
				obj.getTransferencia().setIdTransferencia(rs.getInt(3));;
				obj.getTransferencia().getContaPaga().setNumConta(rs.getInt(4));
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
	public PagamentoDTO procurarPorTransferencia(PagamentoDTO pagamento) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE transferenciaId = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, pagamento.getTransferencia().getIdTransferencia());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				PagamentoDTO obj = new PagamentoDTO();
				obj.setIdPagamento(rs.getInt(1));
				obj.setTipo(rs.getString(2));
				obj.getTransferencia().setIdTransferencia(rs.getInt(3));;
				obj.getTransferencia().getContaPaga().setNumConta(rs.getInt(4));
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
	public PagamentoDTO procurarPorContaPagante(PagamentoDTO pagamento) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE numContaPagante = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, pagamento.getTransferencia().getContaPaga().getNumConta());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				PagamentoDTO obj = new PagamentoDTO();
				obj.setIdPagamento(rs.getInt(1));
				obj.setTipo(rs.getString(2));
				obj.getTransferencia().setIdTransferencia(rs.getInt(3));;
				obj.getTransferencia().getContaPaga().setNumConta(rs.getInt(4));
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
	public boolean existe(PagamentoDTO pagamento) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idPagamento = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, pagamento.getIdPagamento());
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
	public boolean existeTransferencia(PagamentoDTO pagamento) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE transferenciaId = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, pagamento.getTransferencia().getIdTransferencia());
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
	public List<PagamentoDTO> pesquisarTodos() {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + NOMEDATABELA + ";";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<PagamentoDTO> listObj = montarLista(rs);
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public List<PagamentoDTO> montarLista(ResultSet rs) {
		List<PagamentoDTO> listObj = new ArrayList<PagamentoDTO>();
		try {
			while (rs.next()) {
				PagamentoDTO obj = new PagamentoDTO();
				obj.setIdPagamento(rs.getInt(1));
				obj.setTipo(rs.getString(2));
				obj.getTransferencia().setIdTransferencia(rs.getInt(3));;
				obj.getTransferencia().getContaPaga().setNumConta(rs.getInt(4));
				listObj.add(obj);
			}
			return listObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
