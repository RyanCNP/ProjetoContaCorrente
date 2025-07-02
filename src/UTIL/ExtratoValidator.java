/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTIL;

/**
 * @author Ryan Carlo NegrettiPereira
 */
import java.time.LocalDateTime;

public class ExtratoValidator {

    public static boolean isValidNumAgencia(int num) {
        return num > 0 && num <= 99999;
    }

    public static boolean isValidNumConta(long num) {
        return num > 0 && num <= 9999999999L;
    }

    public static boolean isValidData(LocalDateTime data) {
        return data != null;
    }

    public static boolean isValidNumDocto(String doc) {
        return doc != null && !doc.trim().isEmpty() && doc.length() <= 6;
    }

    public static boolean isValidDebitoCredito(String tipo) {
        return tipo != null && (tipo.equalsIgnoreCase("D") || tipo.equalsIgnoreCase("C"));
    }

    public static boolean isValidIdHis(int id) {
        return id > 0 && id <= 9999;
    }

    public static boolean isValidComplHis(String texto) {
        return texto != null && !texto.trim().isEmpty() && texto.length() <= 30;
    }

    public static boolean isValidValor(double valor) {
        return valor >= 0 && String.format("%.2f", valor).replace(".", "").length() <= 9;
    }

    public static boolean isValidSaldo(double saldo) {
        return saldo >= 0 && String.format("%.2f", saldo).replace(".", "").length() <= 15;
    }
}
