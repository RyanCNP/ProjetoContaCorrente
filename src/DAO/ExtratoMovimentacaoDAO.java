/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import CLASSES.ExtratoMovimentacao;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Timestamp;

/**
 * @author Ryan Carlo Negretti Pereira
 */
public class ExtratoMovimentacaoDAO {

    Connection con;

    public Connection connectDB() {
        JOptionPane.showMessageDialog(null, "Iniciando a Conexão com o MySQL SERVER");

        String caminho = "jdbc:sqlserver://localhost:1433;databaseName=MOV_CONTA_CORRENTE;"
                + "encrypt=true;trustServerCertificate=true;";
        String usuario = "sa";
        String senha = ".";
        try {
            con = DriverManager.getConnection(caminho, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão, ClienteDAO - Mensagem => " + erro.getMessage());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, ClienteDAO - Estado => " + erro.getSQLState());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, ClienteDAO - Código => " + erro.getErrorCode());
        }
        return con;
        // con.close();
    }

    public void insereRegistroJFBD(String tabela, String strDados) {
        con = connectDB();
        Statement stmt;
        try {
            stmt = con.createStatement();

            String sql = "INSERT INTO dbo." + tabela + " "
                    + "VALUES (" + strDados + ")";
            JOptionPane.showMessageDialog(null, "String de Insert: " + sql);

            try {
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Inclusão executada com sucesso!");
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, ClienteDAO - Mensagem => " + erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, ClienteDAO - Estado => " + erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, ClienteDAO - Código => " + erro.getErrorCode());
            }
            //con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void alteraRegistroJFDB(String tabela, String strDados, String pesquisaId) {
        con = connectDB();
        {
            Statement stmt;
            try {
                stmt = con.createStatement();
                String sql = "UPDATE dbo." + tabela + " SET " + strDados + " WHERE " + pesquisaId + ";";
                try {
                    stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Alteracao executada com sucesso!");
                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Erro de conexão1, ClienteDAO - Mensagem => " + erro.getMessage());
                    JOptionPane.showMessageDialog(null, "\n Erro de conexão2, ClienteDAO - Estado => " + erro.getSQLState());
                    JOptionPane.showMessageDialog(null, "\n Erro de conexã3o, ClienteDAO - Código => " + erro.getErrorCode());
                }
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void excluirRegistroJFDB(String tabela, String pesquisaID) {
        con = connectDB();
        Statement stmt;
        try {
            stmt = con.createStatement();
            String sql = "DELETE FROM dbp. " + tabela
                    + "WHERE NUM_DOCTO = " + pesquisaID;

            JOptionPane.showMessageDialog(null, "STRING DE DELETE: " + sql);

            try {
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "EXTRATO DE MOVIMENTACAO DELETADO COM SUCESSO!");
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => " + erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => " + erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => " + erro.getErrorCode());
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ExtratoMovimentacao pesquisaRegistroJFDB(String tabela, String pesquisaId) {
        ExtratoMovimentacao extrato_movimentacaoReturn = new ExtratoMovimentacao();
        String tabelaSGBD = "CLIENTES";
        if (tabela.equals(tabelaSGBD)) {
            con = connectDB();
            Statement stmt;
            try {
                stmt = con.createStatement();
                String sql = "SELECT * FROM dbo. " + tabela
                        + "WHERE NUM_DOCTO = " + pesquisaId;
                try {
                    ResultSet dados;
                    dados = stmt.executeQuery(sql);
                    if (dados.next() == false) {
                        JOptionPane.showMessageDialog(null, "Nenhum registro foi"
                                + " encontrado para essa pesquisa");
                    } else {
                        extrato_movimentacaoReturn.setNum_age(dados.getInt("NUM_AGE"));
                        extrato_movimentacaoReturn.setNum_cc(dados.getLong("NOME"));
                        Timestamp timestamp = dados.getTimestamp("DATA_MOV");
                        if (timestamp != null) {
                            extrato_movimentacaoReturn.setData_mov(timestamp.toLocalDateTime());
                        } else {
                            extrato_movimentacaoReturn.setData_mov(null);
                        }
                        extrato_movimentacaoReturn.setNum_docto(dados.getString("NUM_DOCTO"));
                        extrato_movimentacaoReturn.setDebito_credito(dados.getString("DEBITO_CREDITO"));
                        extrato_movimentacaoReturn.setId_his(dados.getInt("ID_HISTORICO"));
                        extrato_movimentacaoReturn.setCompl_his(dados.getString("COMPLEMENTO_HIS"));
                        extrato_movimentacaoReturn.setValor(dados.getDouble("VALOR"));
                        extrato_movimentacaoReturn.setSaldo(dados.getDouble("SALDO"));
                    }
                    con.close();
                    return extrato_movimentacaoReturn;
                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Erro de conexão, ClienteDAO - Mensagem => " + erro.getMessage());
                    JOptionPane.showMessageDialog(null, "\n Erro de conexão, ClienteDAO - Estado => " + erro.getSQLState());
                    JOptionPane.showMessageDialog(null, "\n Erro de conexão, ClienteDAO - Código => " + erro.getErrorCode());
                }
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //Inserir o "pesquisa" de cada metodo (tabela)
        return extrato_movimentacaoReturn;  //Retorno dos dados ou o erro
    }

    public ResultSet consultarRegistroJFDB(String tabela) {
        con = connectDB();
        Statement stmt;
        try {
            stmt = con.createStatement();
            String sql = "SELECT * FROM dbo. " + tabela;
            try {
                ResultSet dados;
                dados = stmt.executeQuery(sql);
                return dados;
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => " + erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => " + erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => " + erro.getErrorCode());
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
