/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTIL;

/**
 * @author Ryan Carlo Negretti Pereira
 */
public class HistoricoValidator {

    public static boolean isValidIdHis(int id) {
        return id > 0 && id <= 9999;
    }

    public static boolean isValidDesHis(String descricao) {
        return descricao != null && !descricao.trim().isEmpty() && descricao.length() <= 30;
    }
}
