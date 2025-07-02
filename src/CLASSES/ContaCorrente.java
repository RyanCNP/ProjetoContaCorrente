/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASSES;

import UTIL.ContaCorrenteValidator;

/**
 * @author Ryan Carlo Negretti Pereira
 */
public class ContaCorrente {

    private int num_age;
    private long num_cc;
    private int id_cli;
    private double saldo;

    public ContaCorrente(int num_age, long num_cc, int id_cli, double saldo) {
        this.num_age = num_age;
        this.num_cc = num_cc;
        this.id_cli = id_cli;
        this.saldo = saldo;
    }

    public void setNum_age(int num_age) {
        if (!ContaCorrenteValidator.isValidNumAgencia(num_age)) {
            System.out.println("Número da agência inválido. Deve conter até 5 dígitos positivos.");
            return;
        }
        this.num_age = num_age;
    }

    public void setNum_cc(long num_cc) {
        if (!ContaCorrenteValidator.isValidNumConta(num_cc)) {
            System.out.println("Número da conta inválido. Deve conter até 10 dígitos positivos.");
            return;
        }
        this.num_cc = num_cc;
    }

    public void setId_cli(int id_cli) {
        if (!ContaCorrenteValidator.isValidIdCliente(id_cli)) {
            System.out.println("ID do cliente inválido. Deve conter até 9 dígitos positivos.");
            return;
        }
        this.id_cli = id_cli;
    }

    public void setSaldo(double saldo) {
        if (!ContaCorrenteValidator.isValidSaldo(saldo)) {
            System.out.println("Saldo inválido. Deve ser positivo e conter no máximo 15 dígitos (com 2 casas decimais).");
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

    public int getId_cli() {
        return id_cli;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public ContaCorrente(){
        
    }

    public String dadosSQLValues() {
        String dadosContaCorrente = "'"
                + this.getNum_age() + "', '"
                + this.getNum_cc() + "', '"
                + this.getId_cli() + "', '"
                + this.getSaldo() + "'";
        return dadosContaCorrente;
    }
}
