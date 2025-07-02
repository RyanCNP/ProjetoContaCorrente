/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASSES;

import UTIL.HistoricoValidator;

/**
 * @author Ryan Carlo Negretti Pereira
 */
public class Historico {

    private int id;
    private String descricao;

    public Historico(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public void setId(int id) {
        if (!HistoricoValidator.isValidIdHis(id)) {
            System.out.println("ID inválido. Deve ser um número positivo até 4 dígitos.");
            return;
        }
        this.id = id;
    }

    public void setDescricao(String descricao) {
        if (!HistoricoValidator.isValidDesHis(descricao)) {
            System.out.println("Descrição inválida. Deve conter até 30 caracteres e não pode ser vazia.");
            return;
        }
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Historico() {

    }

    public String dadosSQLValues() {

        String dadosUsuarios = "'"
                + this.getId() + "', '"
                + this.getDescricao() + "'";

        return dadosUsuarios;
    }

}
