/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import CLASSES.Usuario;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Ryan Carlo Negretti Pereira
 */
public class UsuarioDAO {

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
                    + "WHERE ID = " + pesquisaID;

            JOptionPane.showMessageDialog(null, "STRING DE DELETE: " + sql);

            try {
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "USUARIO DELETADO COM SUCESSO!");
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

    public Usuario pesquisaRegistroJFDB(String tabela, String pesquisaId) {
        Usuario usuarioReturn = new Usuario();
        String tabelaSGBD = "USUARIOS";
        if (tabela.equals(tabelaSGBD)) {
            con = connectDB();
            Statement stmt;
            try {
                stmt = con.createStatement();
                String sql = "SELECT * FROM dbo. " + tabela
                        + "WHERE ID = " + pesquisaId;
                try {
                    ResultSet dados;
                    dados = stmt.executeQuery(sql);
                    if (dados.next() == false) {
                        JOptionPane.showMessageDialog(null, "Nenhum registro foi"
                                + " encontrado para essa pesquisa");
                    } else {
                        usuarioReturn.setId(dados.getString("ID"));
                        usuarioReturn.setSenha(dados.getString("SENHA"));
                        usuarioReturn.setNum_age(dados.getInt("NUM_AGE"));
                        usuarioReturn.setNum_cc(dados.getLong("NUM_CC"));
                    }
                    con.close();
                    return usuarioReturn;
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
        return usuarioReturn;  //Retorno dos dados ou o erro
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
