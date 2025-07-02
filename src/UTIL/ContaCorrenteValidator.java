/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTIL;

/**
 * @author Ryan Carlo Negretti Pereira
 */
public class ContaCorrenteValidator {

    public static boolean isValidNumAgencia(int num) {
        return num > 0 && num <= 99999;
    }

    public static boolean isValidNumConta(long num) {
        return num > 0 && num <= 9999999999L;
    }

    public static boolean isValidIdCliente(int id) {
        return id > 0 && id <= 999999999;
    }

    public static boolean isValidSaldo(double saldo) {
        return saldo >= 0 && String.format("%.2f", saldo).replace(".", "").length() <= 15;
    }
}

