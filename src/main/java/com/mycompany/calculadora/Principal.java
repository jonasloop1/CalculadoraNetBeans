package com.mycompany.calculadora;

import com.mycompany.calculadora.visao.Tela;

/**
 *
 * @author JonaseJoao
 */
public class Principal {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }
}
