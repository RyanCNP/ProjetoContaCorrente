/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASSES;

/**
 * @author Ryan Carlo Negretti Pereira
 */
import UTIL.ExtratoValidator;
import java.time.LocalDateTime;

public class ExtratoMovimentacao {

    private int num_age;
    private long num_cc;
    private LocalDateTime data_mov;
    private String num_docto;
    private String debito_credito;
    private int id_his;
    private String compl_his;
    private double valor;
    private double saldo;

    public ExtratoMovimentacao(int num_age, long num_cc, LocalDateTime data_mov, String num_docto,
            String debito_credito, int id_his, String compl_his,
            double valor, double saldo) {
        this.num_age = num_age;
        this.num_cc = num_cc;
        this.data_mov = data_mov;
        this.num_docto = num_docto;
        this.debito_credito = debito_credito;
        this.id_his = id_his;
        this.compl_his = compl_his;
        this.valor = valor;
        this.saldo = saldo;
    }

    public void setNum_age(int num_age) {
        if (!ExtratoValidator.isValidNumAgencia(num_age)) {
            System.out.println("Número da agência inválido.");
            return;
        }
        this.num_age = num_age;
    }

    public void setNum_cc(long num_cc) {
        if (!ExtratoValidator.isValidNumConta(num_cc)) {
            System.out.println("Número da conta inválido.");
            return;
        }
        this.num_cc = num_cc;
    }

    public void setData_mov(LocalDateTime data_mov) {
        if (!ExtratoValidator.isValidData(data_mov)) {
            System.out.println("Data de movimentação inválida.");
            return;
        }
        this.data_mov = data_mov;
    }

    public void setNum_docto(String num_docto) {
        if (!ExtratoValidator.isValidNumDocto(num_docto)) {
            System.out.println("Número de documento inválido.");
            return;
        }
        this.num_docto = num_docto;
    }

    public void setDebito_credito(String debito_credito) {
        if (!ExtratoValidator.isValidDebitoCredito(debito_credito)) {
            System.out.println("Tipo de movimentação inválido. Use 'D' ou 'C'.");
            return;
        }
        this.debito_credito = debito_credito;
    }

    public void setId_his(int id_his) {
        if (!ExtratoValidator.isValidIdHis(id_his)) {
            System.out.println("ID do histórico inválido.");
            return;
        }
        this.id_his = id_his;
    }

    public void setCompl_his(String compl_his) {
        if (!ExtratoValidator.isValidComplHis(compl_his)) {
            System.out.println("Complemento do histórico inválido.");
            return;
        }
        this.compl_his = compl_his;
    }

    public void setValor(double valor) {
        if (!ExtratoValidator.isValidValor(valor)) {
            System.out.println("Valor da movimentação inválido.");
            return;
        }
        this.valor = valor;
    }

    public void setSaldo(double saldo) {
        if (!ExtratoValidator.isValidSaldo(saldo)) {
            System.out.println("Saldo inválido.");
            return;
        }
        this.saldo = saldo;
    }

    public int getNum_age() {
        return num_age;
    }

    public long getNum_cc() {
        return num_cc;
    }

    public LocalDateTime getData_mov() {
        return data_mov;
    }

    public String getNum_docto() {
        return num_docto;
    }

    public String getDebito_credito() {
        return debito_credito;
    }

    public int getId_his() {
        return id_his;
    }

    public String getCompl_his() {
        return compl_his;
    }

    public double getValor() {
        return valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public ExtratoMovimentacao() {

    }

    public String dadosSQLValues() {
        String dadosExtratoMovimentacao = "'"
                + this.getNum_age() + "', '"
                + this.getNum_cc() + "', '"
                + this.getData_mov() + "', '"
                + this.getNum_docto() + "', '"
                + this.getDebito_credito() + "', '"
                + this.getId_his() + "', '"
                + this.getCompl_his() + "', '"
                + this.getValor() + "', '"
                + this.getSaldo() + "'";
        return dadosExtratoMovimentacao;
    }

    public String alteraDadosSQLValues() {
        String dadosExtratoMovimentacao;
        dadosExtratoMovimentacao = "NUM_AGE ='"
                + this.getNum_age() + "', NUM_CC ='"
                + this.getNum_cc() + "', DATA_MOV ='"
                + this.getData_mov()+ "', NUM_DOCTO ='"
                + this.getNum_docto()+ "', DEBITO_CREDITO ='"
                + this.getDebito_credito()+ "', ID_HISTORICO ='"
                + this.getId_his()+ "', COMPLEMENTO_HIS ='"
                + this.getCompl_his()+ "', VALOR ='"
                + this.getValor()+ "', SALDO ='"
                + this.getSaldo()+ "'";

        return dadosExtratoMovimentacao;
    }
}
