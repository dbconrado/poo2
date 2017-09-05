/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifmg.sabara.bsi.poo2.botoesapp;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Um objeto desta classe é uma janela com
 * cinco botões. Cada botão mostra uma mensagem
 * quando clicado.
 * @author Aluno
 */
public class FormBotoes {
    
    private JFrame janela;
    private JButton bt1;
    private JButton bt2;
    private JButton bt3;
    private JButton bt4;
    private JButton bt5;
    
    public void iniciarComponentes() {
        janela = new JFrame("BotoesApp");
        
        Container painel = janela.getContentPane();
        bt1 = new JButton("Um");
        bt2 = new JButton("Dois");
        bt3 = new JButton("Três");
        bt4 = new JButton("Quatro");
        bt5 = new JButton("Cinco");
        
        ActionListener l = new BotaoListener();
        bt1.addActionListener(l);
        bt2.addActionListener(l);
        bt3.addActionListener(l);
        bt4.addActionListener(l);
        bt5.addActionListener(l);
        
        painel.add(bt1, BorderLayout.NORTH);
        painel.add(bt2, BorderLayout.EAST);
        painel.add(bt3, BorderLayout.SOUTH);
        painel.add(bt4, BorderLayout.WEST);
        painel.add(bt5, BorderLayout.CENTER);
        
        janela.pack();
    }
    
    public FormBotoes() {
        iniciarComponentes();
    }
    
    public void abrir() {
        janela.setVisible(true);
    }
    
    class BotaoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane
                    .showMessageDialog(null,
                            e.getActionCommand());
        }
        
    }
    
}
