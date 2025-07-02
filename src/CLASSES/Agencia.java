/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASSES;

import UTIL.AgenciaValidator;

/**
 * @author Ryan Carlo Negretti Pereira
 */
public class Agencia {

    private int num_agencia;
    private String nome;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String UF;
    private String CEP;
    private String telefone;

    public Agencia(int num_agencia, String nome, String endereco, String numero,
            String complemento, String bairro, String cidade, String UF,
            String CEP, String telefone, String gerente) {
        this.num_agencia = num_agencia;
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.UF = UF;
        this.CEP = CEP;
        this.telefone = telefone;
    }

    public void setNumAgencia(int num_agencia) {
        if (!AgenciaValidator.isValidNumAgencia(num_agencia)) {
            System.out.println("Número da agência inválido. Deve ser um número positivo com até 5 dígitos.");
            return;
        }
        this.num_agencia = num_agencia;
    }

    public void setNome(String nome) {
        if (!AgenciaValidator.isValidNome(nome)) {
            System.out.println("Nome inválido! Deve conter entre 5 e 30 caracteres.");
            return;
        }
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        if (!AgenciaValidator.isValidEndereco(endereco)) {
            System.out.println("Endereço inválido! Deve conter até 50 caracteres e não pode ser vazio.");
            return;
        }
        this.endereco = endereco;
    }

    public void setNumero(String numero) {
        if (!AgenciaValidator.isValidNumero(numero)) {
            System.out.println("Número inválido! Deve conter até 8 caracteres e não pode ser vazio.");
            return;
        }
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        if (!AgenciaValidator.isValidComplemento(complemento)) {
            System.out.println("Complemento inválido! Deve conter até 20 caracteres.");
            return;
        }
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        if (!AgenciaValidator.isValidBairro(bairro)) {
            System.out.println("Bairro inválido! Deve conter até 20 caracteres e não pode ser vazio.");
            return;
        }
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        if (!AgenciaValidator.isValidCidade(cidade)) {
            System.out.println("Cidade inválida! Deve conter até 30 caracteres e não pode ser vazia.");
            return;
        }
        this.cidade = cidade;
    }

    public void setUF(String UF) {
        if (!AgenciaValidator.isValidUF(UF)) {
            System.out.println("UF inválido! Deve conter exatamente 2 letras maiúsculas.");
            return;
        }
        this.UF = UF;
    }

    public void setCEP(String CEP) {
        if (!AgenciaValidator.isValidCEP(CEP)) {
            System.out.println("CEP inválido! Deve conter exatamente 8 dígitos.");
            return;
        }
        this.CEP = CEP;
    }

    public void setTelefone(String telefone) {
        if (!AgenciaValidator.isValidTelefone(telefone)) {
            System.out.println("Telefone inválido! Deve conter entre 10 e 13 dígitos numéricos.");
            return;
        }
        this.telefone = telefone;
    }

    public int getNumAgencia() {
        return num_agencia;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUF() {
        return UF;
    }

    public String getCEP() {
        return CEP;
    }

    public String getTelefone() {
        return telefone;
    }

    public Agencia() {
    }

    public String dadosSQLValues() {
        String dadosAgencias;
        dadosAgencias = "'"
                + this.getNumAgencia() + "','"
                + this.getNome() + "','"
                + this.getEndereco() + "','"
                + this.getNumero() + "','"
                + this.getComplemento() + "','"
                + this.getBairro() + "','"
                + this.getCidade() + "','"
                + this.getUF() + "','"
                + this.getCEP() + "','"
                + this.getTelefone() + "'";

        return dadosAgencias;
    }
}
