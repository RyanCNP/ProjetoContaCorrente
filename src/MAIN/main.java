/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MAIN;

import VIEW.ViewMenu;

/**
 * @author Ryan Carlo Negretti Pereira
 */
public class main {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ViewMenu menu = new ViewMenu();
                menu.setVisible(true);
            }
        });
    }
}
