/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTIL;

/**
 * @author Ryan Carlo Negretti Pereira
 */
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class TableModelNaoEditavel extends DefaultTableModel {

    public TableModelNaoEditavel(ResultSet rs) throws SQLException {
        super();
        setResultSet(rs);
    }

    private void setResultSet(ResultSet rs) throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData();
        int colunas = metaData.getColumnCount();

        // Adiciona colunas
        for (int i = 1; i <= colunas; i++) {
            this.addColumn(metaData.getColumnLabel(i));
        }

        // Adiciona linhas
        while (rs.next()) {
            Object[] linha = new Object[colunas];
            for (int i = 0; i < colunas; i++) {
                linha[i] = rs.getObject(i + 1);
            }
            this.addRow(linha);
        }
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false; // Todas as células são protegidas contra edição
    }
}
