/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import CLASSES.ContaCorrente;
import DAO.ClienteDAO;
import DAO.ContaCorrenteDAO;
import javax.swing.JOptionPane;

/**
 * @author Ryan Carlo Negretti Pereira
 */
public class ViewContaCorrente extends javax.swing.JFrame {

    /**
     * Creates new form ContaCorrente
     */
    public ViewContaCorrente() {
        initComponents();
    }
    String operacaoAtivaGlobal = "NENHUM";

    private void camposOB() {
        jLabelIdCliente.setVisible(true);
        jTextFieldIdCliente.setVisible(true);
    }

    private void limparCampos() {
        jLabelNumeroConta.setText(" ");
        jLabelNumeroAgencia.setText(" ");
        jLabelSaldo.setText(" ");
        jTextFieldNumeroConta.setText(" ");
        jTextFieldNumeroAgencia.setText(" ");
        jTextFieldSaldo.setText(" ");
    }

    private void camposON() {
        jLabelNumeroConta.setVisible(true);
        jLabelNumeroAgencia.setVisible(true);
        jLabelSaldo.setVisible(true);
        jTextFieldNumeroConta.setVisible(true);
        jTextFieldNumeroAgencia.setVisible(true);
        jTextFieldSaldo.setVisible(true);
    }

    private void camposOFF() {
        jLabelNumeroConta.setVisible(false);
        jLabelNumeroAgencia.setVisible(false);
        jLabelSaldo.setVisible(false);
        jTextFieldNumeroConta.setVisible(false);
        jTextFieldNumeroAgencia.setVisible(false);
        jTextFieldSaldo.setVisible(false);
    }

    public ViewContaCorrente(String operacaoAtiva) {
        initComponents();
        operacaoAtivaGlobal = operacaoAtiva;
        String operacao = "INCLUIR";
        if (operacaoAtiva.equals(operacao)) {
            camposOB();
            camposON();
            jButtonCadastrar.setVisible(true);
            jButtonLimpar.setVisible(true);
            jButtonExcluir.setVisible(false);
            jButtonConsultar.setVisible(false);
            jButtonAlterar.setVisible(false);
        }
        operacao = "PesquisarAlterar";
        if (operacaoAtiva.equals(operacao)) {
            camposOB();
            camposOFF();
            jButtonCadastrar.setVisible(false);
            jButtonLimpar.setVisible(true);
            jButtonExcluir.setVisible(false);
            jButtonConsultar.setVisible(true);
            jButtonAlterar.setVisible(false);
        }
        operacao = "PesquisarExcluir";
        if (operacaoAtiva.equals(operacao)) {
            camposOB();
            camposOFF();
            jButtonCadastrar.setVisible(false);
            jButtonLimpar.setVisible(true);
            jButtonExcluir.setVisible(false);
            jButtonConsultar.setVisible(true);
            jButtonAlterar.setVisible(false);
        }
    }

    ContaCorrente conta_tela = new ContaCorrente();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNumeroConta = new javax.swing.JLabel();
        jTextFieldNumeroConta = new javax.swing.JTextField();
        jTextFieldNumeroAgencia = new javax.swing.JTextField();
        jLabelNumeroAgencia = new javax.swing.JLabel();
        jTextFieldIdCliente = new javax.swing.JTextField();
        jLabelIdCliente = new javax.swing.JLabel();
        jTextFieldSaldo = new javax.swing.JTextField();
        jLabelSaldo = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelNumeroConta.setText("NUMERO DA CONTA:");

        jTextFieldNumeroConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroContaActionPerformed(evt);
            }
        });

        jTextFieldNumeroAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroAgenciaActionPerformed(evt);
            }
        });

        jLabelNumeroAgencia.setText("NUMERO DA AGENCIA:");

        jTextFieldIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdClienteActionPerformed(evt);
            }
        });

        jLabelIdCliente.setText("ID DO CLIENTE:");

        jTextFieldSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSaldoActionPerformed(evt);
            }
        });

        jLabelSaldo.setText("SALDO:");

        jButtonCadastrar.setText("CADASTRAR");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("LIMPAR");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonConsultar.setText("CONSULTAR");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("ALTERAR");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("EXCLUIR");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabelSaldo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldSaldo))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabelNumeroConta)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldNumeroConta, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelNumeroAgencia)
                                .addComponent(jLabelIdCliente))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldIdCliente)
                                .addComponent(jTextFieldNumeroAgencia))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCadastrar)
                            .addComponent(jButtonAlterar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonExcluir)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonConsultar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroConta)
                    .addComponent(jTextFieldNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroAgencia)
                    .addComponent(jTextFieldNumeroAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdCliente)
                    .addComponent(jTextFieldIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSaldo)
                    .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        //CADASTRAR DADOS
        String operacao = "INCLUIR";
        if (operacaoAtivaGlobal.equals(operacao)) {
            ContaCorrente dados_conta_corrente = new ContaCorrente();
            dados_conta_corrente.setNum_cc(Long.parseLong(jTextFieldNumeroConta.getText()));
            dados_conta_corrente.setNum_age(Integer.parseInt(jTextFieldNumeroAgencia.getText()));
            dados_conta_corrente.setId_cli(Integer.parseInt(jTextFieldIdCliente.getText()));
            dados_conta_corrente.setSaldo(Double.parseDouble(jTextFieldSaldo.getText()));

            ContaCorrenteDAO objcon = new ContaCorrenteDAO();

            objcon.insereRegistroJFBD("CONTACORRENTE", dados_conta_corrente.dadosSQLValues());

            limparCampos();
            dispose();
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jTextFieldNumeroContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroContaActionPerformed

    private void jTextFieldNumeroAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroAgenciaActionPerformed

    private void jTextFieldIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdClienteActionPerformed

    private void jTextFieldSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSaldoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextFieldSaldoActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        //LIMPAR CAMPOS
        limparCampos();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        //BUSCAR DADOS
        String operacao = "PesquisarAlterar";
        if (operacaoAtivaGlobal.equals((operacao))) {
            ContaCorrenteDAO objcon = new ContaCorrenteDAO();
            ContaCorrente dados_conta_corrente;
            dados_conta_corrente = objcon.pesquisaRegistroJFDB("CONTACORRENTE", "ID_CLIENTE = '"
                    + jTextFieldIdCliente.getText() + "'");

            if (dados_conta_corrente != null) {
                // Preencher os campos da tela com os dados do cliente
                jTextFieldNumeroConta.setText(String.valueOf(dados_conta_corrente.getNum_cc()));
                jTextFieldNumeroAgencia.setText(String.valueOf(dados_conta_corrente.getNum_age()));
                jTextFieldIdCliente.setText(String.valueOf(dados_conta_corrente.getId_cli()));
                jTextFieldSaldo.setText(String.valueOf(dados_conta_corrente.getSaldo()));

                camposON();
                jButtonCadastrar.setVisible(false);
                jButtonLimpar.setVisible(true);
                jButtonExcluir.setVisible(false);
                jButtonConsultar.setVisible(true);
                jButtonAlterar.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Conta Corrente não encontrado.");
            }
        }
        operacao = "PesquisarExcluir";
        if (operacaoAtivaGlobal.equals((operacao))) {
            ContaCorrenteDAO objcon = new ContaCorrenteDAO();
            ContaCorrente dados_conta_corrente;
            dados_conta_corrente = objcon.pesquisaRegistroJFDB("CONTACORRENTE", "ID_CLIENTE = '"
                    + jTextFieldIdCliente.getText() + "'");

            if (dados_conta_corrente != null) {
                // Preencher os campos da tela com os dados do cliente
                jTextFieldNumeroConta.setText(String.valueOf(dados_conta_corrente.getNum_cc()));
                jTextFieldNumeroAgencia.setText(String.valueOf(dados_conta_corrente.getNum_age()));
                jTextFieldIdCliente.setText(String.valueOf(dados_conta_corrente.getId_cli()));
                jTextFieldSaldo.setText(String.valueOf(dados_conta_corrente.getSaldo()));

                camposON();
                jButtonCadastrar.setVisible(false);
                jButtonLimpar.setVisible(true);
                jButtonExcluir.setVisible(true);
                jButtonConsultar.setVisible(true);
                jButtonAlterar.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Conta Corrente não encontrado.");
            }
        }
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        //ALTERAR
        ContaCorrenteDAO objcon = new ContaCorrenteDAO();
        ContaCorrente dados_conta_corrente;
        dados_conta_corrente = objcon.pesquisaRegistroJFDB("CONTACORRENTE", "ID_CLIENTE = '"
                + jTextFieldIdCliente.getText() + "'");

        dados_conta_corrente.setNum_cc(Long.parseLong(jTextFieldNumeroConta.getText()));
        dados_conta_corrente.setNum_age(Integer.parseInt(jTextFieldNumeroAgencia.getText()));
        dados_conta_corrente.setId_cli(Integer.parseInt(jTextFieldIdCliente.getText()));
        dados_conta_corrente.setSaldo(Double.parseDouble(jTextFieldSaldo.getText()));

        try {
            objcon.alteraRegistroJFDB("CONTACORRENTE", dados_conta_corrente.alteraDadosSQLValues(),
                    "ID_CLIENTE ='" + jTextFieldIdCliente.getText() + "'");
            limparCampos();
            dispose();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Não foi possível alterar. erro: " + erro.getMessage());
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        //EXCLUIR
        ContaCorrenteDAO objcon = new ContaCorrenteDAO();
        ContaCorrente dados_conta_corrente;
        dados_conta_corrente = objcon.pesquisaRegistroJFDB("CONTACORRENTE", "ID_CLIENTE = '"
                + jTextFieldIdCliente.getText() + "'");

        jTextFieldNumeroConta.setText(String.valueOf(dados_conta_corrente.getNum_cc()));
        jTextFieldNumeroAgencia.setText(String.valueOf(dados_conta_corrente.getNum_age()));
        jTextFieldIdCliente.setText(String.valueOf(dados_conta_corrente.getId_cli()));
        jTextFieldSaldo.setText(String.valueOf(dados_conta_corrente.getSaldo()));

        objcon.excluirRegistroJFDB("CONTACORRENTE", "ID_CLIENTE = '"
                + jTextFieldIdCliente.getText() + "'");

        limparCampos();
        dispose();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewContaCorrente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JLabel jLabelIdCliente;
    private javax.swing.JLabel jLabelNumeroAgencia;
    private javax.swing.JLabel jLabelNumeroConta;
    private javax.swing.JLabel jLabelSaldo;
    private javax.swing.JTextField jTextFieldIdCliente;
    private javax.swing.JTextField jTextFieldNumeroAgencia;
    private javax.swing.JTextField jTextFieldNumeroConta;
    private javax.swing.JTextField jTextFieldSaldo;
    // End of variables declaration//GEN-END:variables
}
