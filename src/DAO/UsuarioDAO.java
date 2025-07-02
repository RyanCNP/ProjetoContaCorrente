/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.List;
import CLASSES.Usuario;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
// import javax.swing.table.AbstractTableModel;

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

    public void alteraRegistroJFDB(String table, String strDados, String pesquisaId) {
        con = connectDB();
        {
            Statement stmt;
            try {
                stmt = con.createStatement();
                String sql = "UPDATE dbo." + table + " SET " + strDados + " WHERE " + pesquisaId + ";";
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

    public Usuario pesquisaRegistroJFDB(String tabela, String pesquisaId) {
        Usuario usuariosReturn = new Usuario();
        String tabelaSGBD = "USUARIOS";
        if (tabela.equals(tabelaSGBD)) {
            con = connectDB();
            Statement stmt;
            try {
                stmt = con.createStatement();
                String sql = "SELECT * FROM " + tabela + " WHERE " + pesquisaId;
                try {
                    ResultSet dados;
                    dados = stmt.executeQuery(sql);
                    if (dados.next() == false) {
                        JOptionPane.showMessageDialog(null, "Nenhum registro foi"
                                + " encontrado para essa pesquisa");
                    } else {
                        usuariosReturn.setId(dados.getInt("ID"));
                        usuariosReturn.setSenha(dados.getString("SENHA"));
                        usuariosReturn.setNumAg(dados.getString("NUM_AGE"));
                        usuariosReturn.setNumCc(dados.getString("NUM_CC"));
                    }
                    con.close();
                    return usuariosReturn;
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
        return usuariosReturn;  //Retorno dos dados ou o erro
    }

    public List<Usuario> consultaRegistroBD() {
        con = connectDB();
        List<Usuario> usuarios = new ArrayList<>();
        Statement stmt;
        try {
            stmt = con.createStatement();
            String sql = "SELECT * FROM USUARIOS";
            try {
                ResultSet dados = stmt.executeQuery(sql);
                JOptionPane.showMessageDialog(null, "Select executado com sucesso!");
                int i = 0;
                while (dados.next()) {
                    if (i == 0) {
                        i++;
                        Usuario usuario = new Usuario(0, "SENHA", "NUM_AGE",
                                "NUM_CC");
                        usuarios.add(usuario);
                    }
                    Usuario usuario = new Usuario(dados.getInt("ID"), dados.getString("SENHA"),
                            dados.getString("NUM_AGE"), dados.getString("NUM_CC"));
                    usuarios.add(usuario);
                }
                con.close();
                return usuarios;
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, ClienteDAO - Mensagem => " + erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, ClienteDAO - Estado => " + erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, ClienteDAO - Código => " + erro.getErrorCode());
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void excluiRegistroJFDB(String table, String pesquisaId, String numId) {
        Statement stmt = null;
        try {
            con = connectDB();
            stmt = con.createStatement();
            con.setAutoCommit(false); // Inicia a transação
            // Exclui da tabela CONTA_CORRENTE (dependente)
            String sql = "DELETE FROM dbo.CONTACORRENTE WHERE ID = " + numId;
            stmt.executeUpdate(sql);
            con.commit();
        } catch (SQLException erro) {
            if (erro.getMessage().toLowerCase().contains("fk") || erro.getMessage().toLowerCase().contains("violates")) {
                JOptionPane.showMessageDialog(null,
                        "Não é possível excluir o registro pois ele está relacionado a outros dados (chave estrangeira).");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao excluir registros: " + erro.getMessage());
            }
            try {
                if (con != null) {
                    con.rollback(); // Reverte a transação em caso de erro
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao reverter transação: " + e.getMessage());
            }
            // Detecta erro de chave estrangeira
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.setAutoCommit(true);
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar recursos: " + e.getMessage());
            }
        }
    }

}
