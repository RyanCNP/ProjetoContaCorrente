/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTIL;

/**
 * @author Ryan Carlo Negretti Pereira
 */
public class ClienteValidator {

    public static boolean isPositiveId(int id) {
        return id > 0;
    }

    public static boolean isValidNome(String nome) {
        return nome != null && !nome.trim().isEmpty() && nome.length() <= 50;
    }

    public static boolean isValidEndereco(String endereco) {
        return endereco != null && !endereco.trim().isEmpty() && endereco.length() <= 50;
    }

    public static boolean isValidComplemento(String complemento) {
        return complemento != null && complemento.length() <= 20;
    }

    public static boolean isValidNumero(String numero) {
        return numero != null && !numero.trim().isEmpty() && numero.length() <= 8;
    }

    public static boolean isValidBairro(String bairro) {
        return bairro != null && !bairro.trim().isEmpty() && bairro.length() <= 20;
    }

    public static boolean isValidCidade(String cidade) {
        return cidade != null && !cidade.trim().isEmpty() && cidade.length() <= 30;
    }

    public static boolean isValidTelefone(String telefone) {
        return telefone != null && !telefone.trim().isEmpty() && telefone.matches("\\d{10,13}");
    }

    public static boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w\\.-]+@[\\w\\.-]+\\.\\w{2,}$");
    }

    public static boolean isValidCPF(String cpf) {
        if (cpf == null) return false;

        cpf = cpf.replaceAll("[^\\d]", "");
        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) return false;

        try {
            int soma = 0, resto;
            for (int i = 1; i <= 9; i++)
                soma += Integer.parseInt(cpf.substring(i - 1, i)) * (11 - i);
            resto = (soma * 10) % 11;
            if (resto == 10 || resto == 11) resto = 0;
            if (resto != Integer.parseInt(cpf.substring(9, 10))) return false;

            soma = 0;
            for (int i = 1; i <= 10; i++)
                soma += Integer.parseInt(cpf.substring(i - 1, i)) * (12 - i);
            resto = (soma * 10) % 11;
            if (resto == 10 || resto == 11) resto = 0;

            return resto == Integer.parseInt(cpf.substring(10));
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isValidCNPJ(String cnpj) {
        if (cnpj == null) return false;

        cnpj = cnpj.replaceAll("[^\\d]", "");
        if (cnpj.length() != 14 || cnpj.matches("(\\d)\\1{13}")) return false;

        try {
            int[] pesos1 = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
            int[] pesos2 = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

            int soma = 0;
            for (int i = 0; i < 12; i++)
                soma += (cnpj.charAt(i) - '0') * pesos1[i];
            int resto = soma % 11;
            char dig1 = (resto < 2) ? '0' : (char)((11 - resto) + '0');

            soma = 0;
            for (int i = 0; i < 13; i++)
                soma += (cnpj.charAt(i) - '0') * pesos2[i];
            resto = soma % 11;
            char dig2 = (resto < 2) ? '0' : (char)((11 - resto) + '0');

            return dig1 == cnpj.charAt(12) && dig2 == cnpj.charAt(13);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isValidUF(String uf) {
        return uf != null && uf.matches("^[A-Z]{2}$");
    }

    public static boolean isValidCEP(String cep) {
        return cep != null && cep.matches("^\\d{8}$");
    }

    public static boolean isValidSexo(String sexo) {
        return sexo != null && (sexo.equalsIgnoreCase("Masculino") ||
                                sexo.equalsIgnoreCase("Feminino"));
    }
}

