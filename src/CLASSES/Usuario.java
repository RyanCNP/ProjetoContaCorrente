/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASSES;

import UTIL.UsuarioValidator;

/**
 * @author Ryan Carlo Negretti Pereira
 */
public class Usuario {

    private String id;
    private String senha;
    private int num_age;
    private long num_cc;

    public Usuario(String id, String senha, int num_age, long num_cc) {
        this.id = id;
        this.senha = senha;
        this.num_age = num_age;
        this.num_cc = num_cc;
    }

    public void setId(String id) {
        if (!UsuarioValidator.isValidId(id)) {
            System.out.println("ID inválido. Deve conter entre 1 e 20 caracteres.");
            return;
        }
        this.id = id;
    }

    public void setSenha(String senha) {
        if (!UsuarioValidator.isValidSenha(senha)) {
            System.out.println("Senha inválida. Deve conter entre 1 e 20 caracteres.");
            return;
        }
        this.senha = senha;
    }

    public void setNum_age(int num_age) {
        if (!UsuarioValidator.isValidNumAgencia(num_age)) {
            System.out.println("Número da agência inválido. Deve conter até 5 dígitos positivos.");
            return;
        }
        this.num_age = num_age;
    }

    public void setNum_cc(long num_cc) {
        if (!UsuarioValidator.isValidNumConta(num_cc)) {
            System.out.println("Número da conta inválido. Deve conter até 10 dígitos positivos.");
            return;
        }
        this.num_cc = num_cc;
    }

    public String getId() {
        return id;
    }

    public String getSenha() {
        return senha;
    }

    public int getNum_age() {
        return num_age;
    }

    public long getNum_cc() {
        return num_cc;
    }

    public Usuario() {

    }
    
    public String dadosSQLValues() {
        String dadosUsuarios = "'"
                + this.getId() + "', '"
                + this.getSenha() + "', '"
                + this.getNum_age() + "', '"
                + this.getNum_cc() + "'";
        return dadosUsuarios;
    }

    public String alteraDadosSQLValues() {
        String dadosUsuario;
        dadosUsuario = "SENHA ='"
                + this.getSenha() + "',NUM_AGE ='"
                + this.getNum_age() + "',NUM_CC ='"
                + this.getNum_cc();

        return dadosUsuario;
    }
}
