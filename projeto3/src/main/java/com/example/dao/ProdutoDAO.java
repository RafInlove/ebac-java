package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.domain.Produto;

public class ProdutoDAO implements IProdutoDAO{
    @Override
    public Integer cadastrar(Produto Produto) throws Exception {
        
    Connection connection = null;
    PreparedStatement stm = null;

    try {
        connection = ConnectionFactory.getConnection();
        String sql = getSqlInsert();
        stm = connection.prepareStatement(sql);
        adicionarParametrosInsert(stm, Produto);
        return stm.executeUpdate();
    } catch (Exception e) {
        throw e;
    } finally {
        closeConnection(connection, stm, null);
    }
}

@Override
public Integer atualizar(Produto Produto) throws Exception {
    Connection connection = null;
    PreparedStatement stm = null;
    try {
        connection = ConnectionFactory.getConnection();
        String sql = getSqlUpdate(); 
        stm = connection.prepareStatement(sql);
        adicionarParametrosUpdate(stm, Produto);
        return stm.executeUpdate();
    } catch (Exception e) {
        throw e;
    } finally {
        closeConnection(connection, stm, null);
    }
}

@Override
public Produto buscar(String codigo) throws Exception {
    Connection connection = null;
    PreparedStatement stm = null;
    ResultSet rs = null;
    Produto Produto = null;

    try {
        connection = ConnectionFactory.getConnection();
        String sql = getSqlSelect();
        stm = connection.prepareStatement(sql);
        adicionarParametrosSelect(stm, codigo);
        rs = stm.executeQuery();

        if (rs.next()) {
            Produto = new Produto();
            Long id = rs.getLong("ID");
            String nome = rs.getString("NOME");
            String cd = rs.getString("CODIGO");
            Produto.setId(id);
            Produto.setNome(nome);
            Produto.setCodigo(cd);
        }
    } catch (Exception e) {
        throw e;
    } finally {
        closeConnection(connection, stm, rs);
    }
    return Produto;
}

@Override
public List<Produto> buscarTodos() throws Exception {
    Connection connection = null;
    PreparedStatement stm = null;
    ResultSet rs = null;
    List<Produto> list = new ArrayList<>();
    Produto Produto = null;

    try {
        connection = ConnectionFactory.getConnection();
        String sql = getSqlSelectAll();
        stm = connection.prepareStatement(sql);
        rs = stm.executeQuery();

        while (rs.next()) {
            Produto = new Produto();
            Long id = rs.getLong("ID");
            String nome = rs.getString("NOME");
            String cd = rs.getString("CODIGO");
            Produto.setId(id);
            Produto.setNome(nome);
            Produto.setCodigo(cd);
            list.add(Produto);
        }
    } catch (Exception e) {
        throw e;
    } finally {
        closeConnection(connection, stm, rs);
    }
    return list;
}

@Override
public Integer excluir(Produto pr) throws Exception {
    Connection connection = null;
    PreparedStatement stm = null;

    try {
        connection = ConnectionFactory.getConnection();
        String sql = getSqlDelete();
        stm = connection.prepareStatement(sql);
        adicionarParametrosDelete(stm, pr);
        return stm.executeUpdate();
    } catch (Exception e) {
        throw e;
    } finally {
        closeConnection(connection, stm, null);
    }
}

private String getSqlInsert() {
    StringBuilder sb = new StringBuilder();
    sb.append("INSERT INTO TB_Produto_2 (ID, CODIGO, NOME) ");
    sb.append("VALUES (nextval('SQ_Produto_2'), ?, ?)");
    return sb.toString();
}

private void adicionarParametrosInsert(PreparedStatement stm, Produto produto) throws SQLException{
    stm.setString(1, produto.getCodigo());
    stm.setString(2, produto.getNome());
}

private void closeConnection(Connection connection, PreparedStatement stm, ResultSet rs) {
    try {
        if (rs != null && !rs.isClosed()) {
            rs.close();
        }
        if (stm != null && !stm.isClosed()) {
            stm.close();
        }
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    } catch (SQLException e1) {
        e1.printStackTrace();
    }
}

private String getSqlUpdate() {
    StringBuilder sb = new StringBuilder();
    sb.append("UPDATE TB_Produto_2");
    sb.append("SET NOME = ?, CODIGO = ?");
    sb.append("WHERE ID = ?");
    return sb.toString();
}

private void adicionarParametrosUpdate(PreparedStatement stm, Produto produto) throws SQLException {
    stm.setString(1, produto.getNome());
    stm.setString(2, produto.getCodigo());
    stm.setLong(3, produto.getId());
}

private String getSqlSelect() {
    StringBuilder sb = new StringBuilder();
    sb.append("SELECT * FROM TB_Produto_2 ");
    sb.append("WHERE CODIGO = ?");
    return sb.toString();
}

private void adicionarParametrosSelect(PreparedStatement stm, String codigo) throws SQLException {
    stm.setString(1, codigo);
}

private String getSqlSelectAll() {
    StringBuilder sb = new StringBuilder();
    sb.append("SELECT * FROM TB_Produto_2");
    return sb.toString();
}

private String getSqlDelete() {
    StringBuilder sb = new StringBuilder();
    sb.append ("DELETE FROM TB_Produto_2 ");
    sb.append("WHERE CODIGO = ?");
    return sb.toString();
}

private void adicionarParametrosDelete(PreparedStatement stm, Produto produto) throws SQLException {
        stm.setString(1, produto.getCodigo());
}
}
