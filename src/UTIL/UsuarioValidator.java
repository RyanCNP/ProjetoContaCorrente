/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTIL;

/**
 * @author Ryan Carlo Negretti Pereira
 */
public class UsuarioValidator {

    public static boolean isValidId(String id) {
        return id != null && !id.trim().isEmpty() && id.length() <= 20;
    }

    public static boolean isValidSenha(String senha) {
        return senha != null && !senha.trim().isEmpty() && senha.length() <= 20;
    }

    public static boolean isValidNumAgencia(int num) {
        return num > 0 && num <= 99999;
    }

    public static boolean isValidNumConta(long num) {
        return num > 0 && num <= 9999999999L;
    }
}
