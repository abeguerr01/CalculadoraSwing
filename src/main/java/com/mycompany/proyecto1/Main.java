/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author USER
 */
public class Main extends JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Main.class.getName());

    public Main() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Menú Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        // Etiqueta de título
        JLabel titleLabel = new JLabel("Aplicación de Gestión");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(titleLabel, BorderLayout.NORTH);

        // Panel para los botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 1, 10, 10));

        // Botón Calculadora
        JButton btnCalculadora = new JButton("Calculadora");
        btnCalculadora.setFont(new Font("Arial", Font.PLAIN, 18));
        btnCalculadora.setFocusPainted(false);
        btnCalculadora.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirCalculadora();
            }
        });
        buttonPanel.add(btnCalculadora);

        // Botón Cuestionario (Ventana)
        JButton btnCuestionario = new JButton("Cuestionario");
        btnCuestionario.setFont(new Font("Arial", Font.PLAIN, 18));
        btnCuestionario.setFocusPainted(false);
        btnCuestionario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirCuestionario();
            }
        });
        buttonPanel.add(btnCuestionario);

        panel.add(buttonPanel, BorderLayout.CENTER);

        add(panel);
        pack();
        setSize(500, 300);
    }

    private void abrirCalculadora() {
        Calculadora calculadora = new Calculadora();
        calculadora.setVisible(true);
        this.setVisible(false);
    }

    private void abrirCuestionario() {
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
        this.setVisible(false);
    }

    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            Main frame = new Main();
            frame.setVisible(true);
            System.out.println("Aplicacion funcionando correctamente");
        });
    }
}
