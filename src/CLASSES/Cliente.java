/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASSES;

/**
 * @author Ryan Carlo Negretti Pereira
 */
import UTIL.ClienteValidator;
import javax.swing.JOptionPane;

public class Cliente {

    private int id;
    private String nome;
    private String CPF;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String UF;
    private String CEP;
    private String email;
    private String telefone;
    private String CNPJ;
    private String sexo;

    public Cliente(int id, String nome, String CPF, String endereco,
            String numero, String complemento, String bairro, String cidade,
            String UF, String CEP, String email, String status) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.UF = UF;
        this.CEP = CEP;
        this.email = email;
        this.telefone = telefone;
        this.CNPJ = CNPJ;
        this.sexo = sexo;
    }

    public void setId(int id) {
        if (!ClienteValidator.isPositiveId(id)) {
            JOptionPane.showMessageDialog(null, "ID inválido. O valor deve ser maior ou igual a 1.");
            return;
        }
        this.id = id;
    }

    public void setNome(String nome) {
        if (!ClienteValidator.isValidNome(nome)) {
            JOptionPane.showMessageDialog(null, "Nome inválido. O campo não pode estar vazio e deve ter no máximo 50 caracteres.");
            return;
        }
        this.nome = nome;
    }

    public void setCPF(String cpf) {
        if (!ClienteValidator.isValidCPF(cpf)) {
            JOptionPane.showMessageDialog(null, "CPF inválido.");
            return;
        }
        this.CPF = cpf;
    }

    public void setEndereco(String endereco) {
        if (!ClienteValidator.isValidEndereco(endereco)) {
            JOptionPane.showMessageDialog(null, "Endereço inválido. Máximo de 50 caracteres e não pode estar vazio.");
            return;
        }
        this.endereco = endereco;
    }

    public void setNumero(String numero) {
        if (!ClienteValidator.isValidNumero(numero)) {
            JOptionPane.showMessageDialog(null, "Número inválido. Máximo de 8 caracteres e não pode estar vazio.");
            return;
        }
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        if (!ClienteValidator.isValidComplemento(complemento)) {
            JOptionPane.showMessageDialog(null, "Complemento inválido. Máximo de 20 caracteres.");
            return;
        }
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        if (!ClienteValidator.isValidBairro(bairro)) {
            JOptionPane.showMessageDialog(null, "Bairro inválido. Máximo de 20 caracteres e não pode estar vazio.");
            return;
        }
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        if (!ClienteValidator.isValidCidade(cidade)) {
            JOptionPane.showMessageDialog(null, "Cidade inválida. Máximo de 30 caracteres e não pode estar vazia.");
            return;
        }
        this.cidade = cidade;
    }

    public void setUF(String uf) {
        if (!ClienteValidator.isValidUF(uf)) {
            JOptionPane.showMessageDialog(null, "UF inválido. Deve conter exatamente duas letras maiúsculas.");
            return;
        }
        this.UF = uf;
    }

    public void setCEP(String cep) {
        if (!ClienteValidator.isValidCEP(cep)) {
            JOptionPane.showMessageDialog(null, "CEP inválido. Deve conter exatamente 8 dígitos.");
            return;
        }
        this.CEP = cep;
    }

    public void setEmail(String email) {
        if (!ClienteValidator.isValidEmail(email)) {
            JOptionPane.showMessageDialog(null, "E-mail inválido.");
            return;
        }
        this.email = email;
    }

    public void setTelefone(String telefone) {
        if (!ClienteValidator.isValidTelefone(telefone)) {
            JOptionPane.showMessageDialog(null, "Telefone inválido. Deve conter entre 10 e 13 dígitos numéricos.");
            return;
        }
        this.telefone = telefone;
    }

    public void setCNPJ(String cnpj) {
        if (!ClienteValidator.isValidCNPJ(cnpj)) {
            JOptionPane.showMessageDialog(null, "CNPJ inválido.");
            return;
        }
        this.CNPJ = cnpj;
    }

    public void setSexo(String sexo) {
        if (!ClienteValidator.isValidSexo(sexo)) {
            JOptionPane.showMessageDialog(null, "Sexo inválido. Valores aceitos: Masculino, Feminino ou Outro.");
            return;
        }
        this.sexo = sexo;
    }

    public int getId() {
        return id;
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

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getSexo() {
        return sexo;
    }

    public Cliente() {
    }

    public String dadosSQLValues() {
        String dadosClientes;
        dadosClientes = "'"
                + this.getId() + "','"
                + this.getNome() + "','"
                + this.getEndereco() + "','"
                + this.getNumero() + "','"
                + this.getComplemento() + "','"
                + this.getBairro() + "','"
                + this.getCidade() + "','"
                + this.getUF() + "','"
                + this.getCEP() + "','"
                + this.getTelefone() + "','"
                + this.getCPF() + "','"
                + "2020-01-01" + "','"
                + this.getCNPJ() + "', EMAIL = '"
                + this.getEmail() + "', SEXO = '"
                + this.getSexo() + "'";

        return dadosClientes;
    }

    public String alteraDadosSQLValues() {
        String dadosClientes;
        dadosClientes = "NOME ='"
                + this.getNome() + "',ENDERECO ='"
                + this.getEndereco() + "',NUMERO ='"
                + this.getNumero() + "',COMPLEMENTO ='"
                + this.getComplemento() + "',BAIRRO ='"
                + this.getBairro() + "',CIDADE ='"
                + this.getCidade() + "',UF ='"
                + this.getUF() + "',CEP ='"
                + this.getCEP() + "',TELEFONE ='"
                + this.getTelefone() + "',CPF ='"
                + this.getCPF() + "',DATA_NASC ='"
                + "2020-01-01" + "',CNPJ = '"
                + this.getCNPJ() + "', EMAIL = '"
                + this.getEmail() + "', SEXO = '"
                + this.getSexo() + "'";

        return dadosClientes;
    }
}
