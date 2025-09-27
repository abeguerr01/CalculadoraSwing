/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto1;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author USER
 */
public class Calculadora extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Calculadora.class.getName());

    /**
     * Creates new form Ventana
     */
    public Calculadora() {
        initComponents();
    }

    //VARIABLES
    ArrayList<String> operaciones = new ArrayList<>();
    String num="", mos="";
    int ope; //1 suma - 2 resta - 3 producto - 4 division
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup_sexo = new javax.swing.ButtonGroup();
        bGradgra = new javax.swing.ButtonGroup();
        jLabel_titulo = new javax.swing.JLabel();
        jLabel_main = new javax.swing.JLabel();
        jB1 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB7 = new javax.swing.JButton();
        jB8 = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        jB0 = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        restar = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        calcular = new javax.swing.JButton();
        jBpnt = new javax.swing.JButton();
        jBborrar = new javax.swing.JButton();
        jBseno = new javax.swing.JButton();
        jBcoseno = new javax.swing.JButton();
        jBtangente = new javax.swing.JButton();
        jRBgrados = new javax.swing.JRadioButton();
        jRBradianes = new javax.swing.JRadioButton();
        jBpi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel_titulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel_titulo.setForeground(java.awt.Color.black);
        jLabel_titulo.setText("CALCULADORA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        getContentPane().add(jLabel_titulo, gridBagConstraints);

        jLabel_main.setBackground(java.awt.Color.black);
        jLabel_main.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel_main.setForeground(java.awt.Color.black);
        jLabel_main.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(jLabel_main, gridBagConstraints);

        jB1.setBackground(new java.awt.Color(255, 255, 255));
        jB1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jB1.setForeground(new java.awt.Color(0, 0, 0));
        jB1.setText("1");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jB1, gridBagConstraints);

        jB2.setBackground(new java.awt.Color(255, 255, 255));
        jB2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jB2.setForeground(new java.awt.Color(0, 0, 0));
        jB2.setText("2");
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jB2, gridBagConstraints);

        jB3.setBackground(new java.awt.Color(255, 255, 255));
        jB3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jB3.setForeground(new java.awt.Color(0, 0, 0));
        jB3.setText("3");
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jB3, gridBagConstraints);

        jB4.setBackground(new java.awt.Color(255, 255, 255));
        jB4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jB4.setForeground(new java.awt.Color(0, 0, 0));
        jB4.setText("4");
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jB4, gridBagConstraints);

        jB5.setBackground(new java.awt.Color(255, 255, 255));
        jB5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jB5.setForeground(new java.awt.Color(0, 0, 0));
        jB5.setText("5");
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jB5, gridBagConstraints);

        jB6.setBackground(new java.awt.Color(255, 255, 255));
        jB6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jB6.setForeground(new java.awt.Color(0, 0, 0));
        jB6.setText("6");
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jB6, gridBagConstraints);

        jB7.setBackground(new java.awt.Color(255, 255, 255));
        jB7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jB7.setForeground(new java.awt.Color(0, 0, 0));
        jB7.setText("7");
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jB7, gridBagConstraints);

        jB8.setBackground(new java.awt.Color(255, 255, 255));
        jB8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jB8.setForeground(new java.awt.Color(0, 0, 0));
        jB8.setText("8");
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jB8, gridBagConstraints);

        jB9.setBackground(new java.awt.Color(255, 255, 255));
        jB9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jB9.setForeground(new java.awt.Color(0, 0, 0));
        jB9.setText("9");
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jB9, gridBagConstraints);

        jB0.setBackground(new java.awt.Color(255, 255, 255));
        jB0.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jB0.setForeground(new java.awt.Color(0, 0, 0));
        jB0.setText("0");
        jB0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jB0, gridBagConstraints);

        suma.setBackground(new java.awt.Color(204, 204, 204));
        suma.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        suma.setForeground(new java.awt.Color(0, 0, 0));
        suma.setText("+");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(suma, gridBagConstraints);

        restar.setBackground(new java.awt.Color(204, 204, 204));
        restar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        restar.setForeground(new java.awt.Color(0, 0, 0));
        restar.setText("-");
        restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(restar, gridBagConstraints);

        multiplicar.setBackground(new java.awt.Color(204, 204, 204));
        multiplicar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        multiplicar.setForeground(new java.awt.Color(0, 0, 0));
        multiplicar.setText("x");
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(multiplicar, gridBagConstraints);

        dividir.setBackground(new java.awt.Color(204, 204, 204));
        dividir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        dividir.setForeground(new java.awt.Color(0, 0, 0));
        dividir.setText("/");
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(dividir, gridBagConstraints);

        calcular.setBackground(new java.awt.Color(102, 102, 255));
        calcular.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        calcular.setForeground(new java.awt.Color(255, 255, 255));
        calcular.setText("=");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(calcular, gridBagConstraints);

        jBpnt.setBackground(new java.awt.Color(204, 255, 255));
        jBpnt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBpnt.setForeground(new java.awt.Color(0, 0, 0));
        jBpnt.setText(".");
        jBpnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpntActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jBpnt, gridBagConstraints);

        jBborrar.setBackground(new java.awt.Color(204, 102, 0));
        jBborrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBborrar.setForeground(new java.awt.Color(255, 255, 255));
        jBborrar.setText("CE");
        jBborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBborrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jBborrar, gridBagConstraints);

        jBseno.setBackground(new java.awt.Color(204, 204, 204));
        jBseno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBseno.setForeground(new java.awt.Color(0, 0, 0));
        jBseno.setText("sin( )");
        jBseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsenoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jBseno, gridBagConstraints);

        jBcoseno.setBackground(new java.awt.Color(204, 204, 204));
        jBcoseno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBcoseno.setForeground(new java.awt.Color(0, 0, 0));
        jBcoseno.setText("cos( )");
        jBcoseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcosenoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jBcoseno, gridBagConstraints);

        jBtangente.setBackground(new java.awt.Color(204, 204, 204));
        jBtangente.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBtangente.setForeground(new java.awt.Color(0, 0, 0));
        jBtangente.setText("tan( )");
        jBtangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtangenteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jBtangente, gridBagConstraints);

        bGradgra.add(jRBgrados);
        jRBgrados.setText("Grados");
        jRBgrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBgradosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        getContentPane().add(jRBgrados, gridBagConstraints);

        bGradgra.add(jRBradianes);
        jRBradianes.setText("Radianes");
        jRBradianes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBradianesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_START;
        getContentPane().add(jRBradianes, gridBagConstraints);

        jBpi.setBackground(new java.awt.Color(255, 255, 255));
        jBpi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBpi.setForeground(new java.awt.Color(0, 0, 0));
        jBpi.setText("π");
        jBpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpiActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jBpi, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
        num = num + "3";
        mos = mos + "3";
        jLabel_main.setText(mos);
    }//GEN-LAST:event_jB3ActionPerformed

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
        num = num + "5";
        mos = mos + "5";
        jLabel_main.setText(mos);
    }//GEN-LAST:event_jB5ActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed
        num = num + "6";
        mos = mos + "6";
        jLabel_main.setText(mos);
    }//GEN-LAST:event_jB6ActionPerformed

    private void jBborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBborrarActionPerformed
        operaciones.clear();
        num = "";
        mos = "";
        jLabel_main.setText("0");
    }//GEN-LAST:event_jBborrarActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        num = num + "1";
        mos = mos + "1";
        jLabel_main.setText(mos);
    }//GEN-LAST:event_jB1ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
        num = num + "2";
        mos = mos + "2";
        jLabel_main.setText(mos);
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
        num = num + "4";
        mos = mos + "4";
        jLabel_main.setText(mos);
    }//GEN-LAST:event_jB4ActionPerformed

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB7ActionPerformed
        num = num + "7";
        mos = mos + "7";
        jLabel_main.setText(mos);
    }//GEN-LAST:event_jB7ActionPerformed

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB8ActionPerformed
        num = num + "8";
        mos = mos + "8";
        jLabel_main.setText(mos);
    }//GEN-LAST:event_jB8ActionPerformed

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB9ActionPerformed
        num = num + "9";
        mos = mos + "9";
        jLabel_main.setText(mos);
    }//GEN-LAST:event_jB9ActionPerformed

    private void jB0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB0ActionPerformed
        num = num + "0";
        mos = mos + "0";
        jLabel_main.setText(mos);
    }//GEN-LAST:event_jB0ActionPerformed

    private void jBpntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpntActionPerformed
        num = num + ".";
        mos = mos + ".";
        jLabel_main.setText(mos);
    }//GEN-LAST:event_jBpntActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        // 1. Si el usuario ha introducido un número, lo añadimos a las operaciones.
        if (!num.isEmpty()) { 
            operaciones.add(num);
            num = ""; // Reseteamos 'num' para el siguiente número
        }

        // 2. Si la lista de operaciones no está vacía, comprobamos el último elemento.
        if (!operaciones.isEmpty()) {
            String ult = operaciones.get(operaciones.size() - 1);

            // 3. Si el último elemento ya era un operador, no se permite.
            if ("+".equals(ult) || "-".equals(ult) || "x".equals(ult) || "/".equals(ult)){
                System.out.println("No se pueden poner dos simbolos juntos");
                // Aquí puedes simplemente salir del método o ignorar el clic.
                return; 
            }
        }

        // 4. Añadimos el nuevo operador.
        operaciones.add("+");
        mos = mos + "+";
        jLabel_main.setText(mos);
    }//GEN-LAST:event_sumaActionPerformed

    private void restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarActionPerformed
        if (!num.isEmpty()) { 
            operaciones.add(num);
            num = ""; 
        }

        if (!operaciones.isEmpty()) {
            String ult = operaciones.get(operaciones.size() - 1);

            if ("+".equals(ult) || "-".equals(ult) || "x".equals(ult) || "/".equals(ult)){
                System.out.println("No se pueden poner dos simbolos juntos");
                return; 
            }
        }

        operaciones.add("-");
        mos = mos + "-";
        jLabel_main.setText(mos);
    }//GEN-LAST:event_restarActionPerformed

    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed
        // 1. Si el usuario ha introducido un número, lo añadimos a las operaciones.
        if (!num.isEmpty()) { 
            operaciones.add(num);
            num = ""; // Reseteamos 'num' para el siguiente número
        }

        // 2. Si la lista de operaciones no está vacía, comprobamos el último elemento.
        // (Incluye la comprobación de isEmpty() implícitamente)
        if (!operaciones.isEmpty()) {
            String ult = operaciones.get(operaciones.size() - 1);

            // 3. Si el último elemento ya era un operador, no se permite.
            if ("+".equals(ult) || "-".equals(ult) || "x".equals(ult) || "/".equals(ult)){
                System.out.println("No se pueden poner dos simbolos juntos");
                return; 
            }
        }

        // 4. Añadimos el nuevo operador.
        operaciones.add("x"); // Usamos 'x'
        mos = mos + "x";
        jLabel_main.setText(mos);
    }//GEN-LAST:event_multiplicarActionPerformed

    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
        if (!num.isEmpty()) { 
            operaciones.add(num);
            num = ""; 
        }

        if (!operaciones.isEmpty()) {
            String ult = operaciones.get(operaciones.size() - 1);

            if ("+".equals(ult) || "-".equals(ult) || "x".equals(ult) || "/".equals(ult)){
                System.out.println("No se pueden poner dos simbolos juntos");
                return; 
            }
        }

        operaciones.add("/");
        mos = mos + "/";
        jLabel_main.setText(mos);
    }//GEN-LAST:event_dividirActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        if (!num.isEmpty()) {
            operaciones.add(num);
            num = ""; 
        }

        if (operaciones.size() < 3) {
            System.out.println("Operación incompleta o no válida.");
            return; 
        }

        for (int i = 0; i < operaciones.size(); i++) {
            String elemento = operaciones.get(i);

            if (elemento.equals("x") || elemento.equals("/")) {

                try {
                    double operando1 = Double.parseDouble(operaciones.get(i - 1));
                    double operando2 = Double.parseDouble(operaciones.get(i + 1));
                    double resultado;

                    if (elemento.equals("x")) {
                        resultado = operando1 * operando2;
                    } else { // Es división "/"
                        if (operando2 == 0) {
                            jLabel_main.setText("Error: Div / 0");
                            operaciones.clear();
                            mos = "";
                            num = "";
                            return;
                        }
                        resultado = operando1 / operando2;
                    }

                    operaciones.remove(i + 1); 
                    operaciones.remove(i);
                    operaciones.remove(i - 1);

                    operaciones.add(i - 1, String.valueOf(resultado));

                    i = 0; 

                } catch (NumberFormatException | IndexOutOfBoundsException e) {
                    System.out.println("Error de formato o índice durante la Fase 1: " + e.getMessage());
                    return;
                }
            }
        }

        if (operaciones.isEmpty()) {
            jLabel_main.setText("0");
            return;
        }

        double resultadoFinal = 0;
        try {
            resultadoFinal = Double.parseDouble(operaciones.get(0));

            for (int i = 1; i < operaciones.size(); i += 2) {
                String operador = operaciones.get(i);
                double operando = Double.parseDouble(operaciones.get(i + 1));

                if (operador.equals("+")) {
                    resultadoFinal += operando;
                } else {
                    resultadoFinal -= operando;
                }
            }

        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            System.out.println("Error de formato o índice durante la Fase 2: " + e.getMessage());
            return;
        }


        // 3. Mostrar Resultado y Limpiar
        String resultadoStr = String.valueOf(resultadoFinal);
        jLabel_main.setText(resultadoStr);

        // Limpiamos todo para la próxima operación, pero el resultado queda en el display
        operaciones.clear();
        mos = resultadoStr; // Mantiene el resultado en pantalla para una nueva operación
        num = ""; 

        System.out.println("Resultado final: " + resultadoFinal);
    }//GEN-LAST:event_calcularActionPerformed

    private void jRBgradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBgradosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBgradosActionPerformed

    private void jRBradianesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBradianesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBradianesActionPerformed

    private void jBsenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsenoActionPerformed
        try {
            double valor = Double.parseDouble(jLabel_main.getText());

            // Comprobar el estado del JRadioButton de Grados
            if (jRBgrados.isSelected()) {
                valor = Math.toRadians(valor);
            }

            double resultado = Math.sin(valor);

            jLabel_main.setText(String.valueOf(resultado));
            operaciones.clear();
            mos = String.valueOf(resultado);
            num = "";
        
        } catch (NumberFormatException e) {
            jLabel_main.setText("Error");
            operaciones.clear();
            mos = "";
            num = "";
            System.out.println("Error: Formato de número inválido para seno.");
        }
    }//GEN-LAST:event_jBsenoActionPerformed

    private void jBcosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcosenoActionPerformed
        try {
            double valor = Double.parseDouble(jLabel_main.getText());

            if (jRBgrados.isSelected()) {
                valor = Math.toRadians(valor);
            }

            double resultado = Math.cos(valor);

            jLabel_main.setText(String.valueOf(resultado));
            operaciones.clear();
            mos = String.valueOf(resultado);
            num = "";
        } catch (NumberFormatException e) {
            jLabel_main.setText("Error");
            operaciones.clear();
            mos = "";
            num = "";
            System.out.println("Error: Formato de número inválido para coseno.");
        }
    }//GEN-LAST:event_jBcosenoActionPerformed

    private void jBtangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtangenteActionPerformed
        try {
            double valor = Double.parseDouble(jLabel_main.getText());

            if (jRBgrados.isSelected()) {
                valor = Math.toRadians(valor);
            }

            double resultado = Math.tan(valor);

            jLabel_main.setText(String.valueOf(resultado));
            operaciones.clear();
            mos = String.valueOf(resultado);
            num = "";
        } catch (NumberFormatException e) {
            jLabel_main.setText("Error");
            operaciones.clear();
            mos = "";
            num = "";
            System.out.println("Error: Formato de número inválido para tangente.");
        }
    }//GEN-LAST:event_jBtangenteActionPerformed

    private void jBpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpiActionPerformed
        num = num + "3.14159265";
        mos = mos + "π";
        jLabel_main.setText(mos);
    }//GEN-LAST:event_jBpiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Calculadora().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGradgra;
    private javax.swing.ButtonGroup buttonGroup_sexo;
    private javax.swing.JButton calcular;
    private javax.swing.JButton dividir;
    private javax.swing.JButton jB0;
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB8;
    private javax.swing.JButton jB9;
    private javax.swing.JButton jBborrar;
    private javax.swing.JButton jBcoseno;
    private javax.swing.JButton jBpi;
    private javax.swing.JButton jBpnt;
    private javax.swing.JButton jBseno;
    private javax.swing.JButton jBtangente;
    private javax.swing.JLabel jLabel_main;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JRadioButton jRBgrados;
    private javax.swing.JRadioButton jRBradianes;
    private javax.swing.JButton multiplicar;
    private javax.swing.JButton restar;
    private javax.swing.JButton suma;
    // End of variables declaration//GEN-END:variables
}
