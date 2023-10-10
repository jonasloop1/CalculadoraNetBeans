package com.mycompany.calculadora.visao;

import com.mycompany.calculadora.controle.CalculadoraController;
import com.mycompany.calculadora.enums.EnumOperacao;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 *
 * @author Jonas silva
 * @Email: jonasloop1@gmail.com
 */
public class Tela extends javax.swing.JFrame {

    private CalculadoraController calculadora;
    
    private EnumOperacao ultimaOperacao;

    public Tela() {
        initComponents();
        calculadora = new CalculadoraController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldResult = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButtonAc = new javax.swing.JButton();
        jButtonMaisMenos = new javax.swing.JButton();
        jButtonPorcentagem = new javax.swing.JButton();
        jButtonDivisao = new javax.swing.JButton();
        jButtonNum7 = new javax.swing.JButton();
        jButtonNum8 = new javax.swing.JButton();
        jButtonNum9 = new javax.swing.JButton();
        jButtonMultiplica = new javax.swing.JButton();
        jButtonNum4 = new javax.swing.JButton();
        jButtonNum5 = new javax.swing.JButton();
        jButtonNum6 = new javax.swing.JButton();
        jButtonSubtrair = new javax.swing.JButton();
        jButtonNum1 = new javax.swing.JButton();
        jButtonNum2 = new javax.swing.JButton();
        jButtonNum3 = new javax.swing.JButton();
        jButtonAdicao = new javax.swing.JButton();
        jButtonNum0 = new javax.swing.JButton();
        jButtonVirgula = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Manual");

        jTextFieldResult.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jTextFieldResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldResult.setText("0,00");
        jTextFieldResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldResultActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(5, 4));

        jButtonAc.setText("AC");
        jButtonAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAc);

        jButtonMaisMenos.setText("+/-");
        jButtonMaisMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMaisMenosActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMaisMenos);

        jButtonPorcentagem.setText("%");
        jButtonPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPorcentagemActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPorcentagem);

        jButtonDivisao.setText("/");
        jButtonDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisaoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDivisao);

        jButtonNum7.setText("7");
        jButtonNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNum7);

        jButtonNum8.setText("8");
        jButtonNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNum8);

        jButtonNum9.setText("9");
        jButtonNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNum9);

        jButtonMultiplica.setText("*");
        jButtonMultiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMultiplica);

        jButtonNum4.setText("4");
        jButtonNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNum4);

        jButtonNum5.setText("5");
        jButtonNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNum5);

        jButtonNum6.setText("6");
        jButtonNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNum6);

        jButtonSubtrair.setText("-");
        jButtonSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtrairActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSubtrair);

        jButtonNum1.setText("1");
        jButtonNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNum1);

        jButtonNum2.setText("2");
        jButtonNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNum2);

        jButtonNum3.setText("3");
        jButtonNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNum3);

        jButtonAdicao.setText("+");
        jButtonAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicaoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAdicao);

        jButtonNum0.setText("0");
        jButtonNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum0ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNum0);

        jButtonVirgula.setText(",");
        jButtonVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVirgulaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVirgula);

        jButtonFechar.setText("X");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonFechar);

        jButtonIgual.setText("=");
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonIgual);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldResult))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldResult, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldResultActionPerformed

    }//GEN-LAST:event_jTextFieldResultActionPerformed

    private void jButtonMaisMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaisMenosActionPerformed
        // TODO add your handlinode here:
    }//GEN-LAST:event_jButtonMaisMenosActionPerformed

    private void jButtonPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPorcentagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPorcentagemActionPerformed

    private void jButtonDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisaoActionPerformed
        calculadora.realizaOperacao(EnumOperacao.DIVISAO, stringToDoubleNum(jTextFieldResult.getText()));
        ultimaOperacao = EnumOperacao.DIVISAO;
        limpar();
    }//GEN-LAST:event_jButtonDivisaoActionPerformed

    private void jButtonNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum7ActionPerformed
        digita("7");
    }//GEN-LAST:event_jButtonNum7ActionPerformed

    private void jButtonNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum8ActionPerformed
        digita("8");
    }//GEN-LAST:event_jButtonNum8ActionPerformed

    private void jButtonNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum9ActionPerformed
        digita("9");
    }//GEN-LAST:event_jButtonNum9ActionPerformed

    private void jButtonMultiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicaActionPerformed
        calculadora.realizaOperacao(EnumOperacao.MULTIPLICACAO, stringToDoubleNum(jTextFieldResult.getText()));
        ultimaOperacao = EnumOperacao.MULTIPLICACAO;
        limpar();
    }//GEN-LAST:event_jButtonMultiplicaActionPerformed

    private void jButtonNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum4ActionPerformed
        digita("4");
    }//GEN-LAST:event_jButtonNum4ActionPerformed

    private void jButtonNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum5ActionPerformed
        digita("5");
    }//GEN-LAST:event_jButtonNum5ActionPerformed

    private void jButtonNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum6ActionPerformed
        digita("6");
    }//GEN-LAST:event_jButtonNum6ActionPerformed

    private void jButtonSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtrairActionPerformed
        calculadora.realizaOperacao(EnumOperacao.SUBTRACAO, stringToDoubleNum(jTextFieldResult.getText()));
        ultimaOperacao = EnumOperacao.SUBTRACAO;
        limpar();
    }//GEN-LAST:event_jButtonSubtrairActionPerformed

    private void jButtonNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum1ActionPerformed
        digita("1");
    }//GEN-LAST:event_jButtonNum1ActionPerformed

    private void jButtonNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum2ActionPerformed
        digita("2");
    }//GEN-LAST:event_jButtonNum2ActionPerformed

    private void jButtonNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum3ActionPerformed
        digita("3");
    }//GEN-LAST:event_jButtonNum3ActionPerformed

    private void jButtonAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicaoActionPerformed
        calculadora.realizaOperacao(EnumOperacao.SOMA, stringToDoubleNum(jTextFieldResult.getText()));
        ultimaOperacao = EnumOperacao.SOMA;
        limpar();
    }//GEN-LAST:event_jButtonAdicaoActionPerformed

    private void jButtonNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum0ActionPerformed
        digita("0");
    }//GEN-LAST:event_jButtonNum0ActionPerformed

    private void jButtonVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVirgulaActionPerformed
        digita(",");
    }//GEN-LAST:event_jButtonVirgulaActionPerformed

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        calculadora.realizaOperacao(ultimaOperacao, stringToDoubleNum(jTextFieldResult.getText()));
        jTextFieldResult.setText(DoubleToString(calculadora.getTotal()));
    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jButtonAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcActionPerformed
        limpar();
        calculadora.zerar();
    }//GEN-LAST:event_jButtonAcActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private String DoubleToString(Double numero){
        if(numero != null){
            DecimalFormat formato = new DecimalFormat("##,###,###,##0.00", new DecimalFormatSymbols(new Locale("pt","BR")));
            formato.setParseBigDecimal(true);
            return formato.format(numero);
        }
        return "";
    }
    
    private Double stringToDoubleNum(String numero) {
        NumberFormat nf = NumberFormat.getInstance();
        Double dv = 0.0;
        try {
            dv = nf.parse(numero).doubleValue();
        } catch (ParseException ex) {
        }
        return dv;
    }

    private void limpar() {
        jTextFieldResult.setText("0,00");
    }

    private void digita(String caractere) {
        if (jTextFieldResult.getText().equals("0,00")) {
            jTextFieldResult.setText(caractere);
        } else {
            if (caractere.equals(",") && jTextFieldResult.getText().contains(",")) {
            } else {
                jTextFieldResult.setText(jTextFieldResult.getText().concat(caractere));
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAc;
    private javax.swing.JButton jButtonAdicao;
    private javax.swing.JButton jButtonDivisao;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonMaisMenos;
    private javax.swing.JButton jButtonMultiplica;
    private javax.swing.JButton jButtonNum0;
    private javax.swing.JButton jButtonNum1;
    private javax.swing.JButton jButtonNum2;
    private javax.swing.JButton jButtonNum3;
    private javax.swing.JButton jButtonNum4;
    private javax.swing.JButton jButtonNum5;
    private javax.swing.JButton jButtonNum6;
    private javax.swing.JButton jButtonNum7;
    private javax.swing.JButton jButtonNum8;
    private javax.swing.JButton jButtonNum9;
    private javax.swing.JButton jButtonPorcentagem;
    private javax.swing.JButton jButtonSubtrair;
    private javax.swing.JButton jButtonVirgula;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldResult;
    // End of variables declaration//GEN-END:variables
}
