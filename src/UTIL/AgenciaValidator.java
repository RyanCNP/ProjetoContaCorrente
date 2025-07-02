/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTIL;

/**
 * @author Ryan Carlo Negretti Pereira
 */
public class AgenciaValidator {

    public static boolean isValidNumAgencia(int num) {
        return num > 0 && num <= 99999;
    }

    public static boolean isValidNome(String nome) {
        return nome != null && !nome.trim().isEmpty() && nome.length() >= 5 && nome.length() <= 30;
    }

    public static boolean isValidEndereco(String endereco) {
        return endereco != null && !endereco.trim().isEmpty() && endereco.length() <= 50;
    }

    public static boolean isValidNumero(String numero) {
        return numero != null && !numero.trim().isEmpty() && numero.length() <= 8;
    }

    public static boolean isValidComplemento(String complemento) {
        return complemento != null && complemento.length() <= 20;
    }

    public static boolean isValidBairro(String bairro) {
        return bairro != null && !bairro.trim().isEmpty() && bairro.length() <= 20;
    }

    public static boolean isValidCidade(String cidade) {
        return cidade != null && !cidade.trim().isEmpty() && cidade.length() <= 30;
    }

    public static boolean isValidUF(String uf) {
        return uf != null && uf.matches("^[A-Z]{2}$");
    }

    public static boolean isValidCEP(String cep) {
        return cep != null && cep.matches("^\\d{8}$");
    }

    public static boolean isValidTelefone(String telefone) {
        return telefone != null && telefone.matches("^\\d{10,13}$");
    }
}
