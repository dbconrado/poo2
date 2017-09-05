package br.edu.ifmg.bsi.sabara.poo2.somaapp;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Um objeto desta classe é uma janela
 * com uma interface de usuário que permite
 * entrar com dois números e somá-los.
 * 
 * @author Daniel Conrado
 */
public class FormSoma {
   
    private JFrame janela;
    private JLabel lbNumero1;
    private JLabel lbNumero2;
    private JTextField tfNumero1;
    private JTextField tfNumero2;
    private JButton btSomar;
    private JTextField tfResultado;
    
    private void iniciarComponentes() {
       janela = new JFrame();
       janela.setTitle("SomaApp v1.0");
       
       Container painel = janela.getContentPane();
       painel.setLayout(new FlowLayout());
       
       lbNumero1 = new JLabel("Número 1");
       lbNumero2 = new JLabel("Número 2");
       tfNumero1 = new JTextField(10);
       tfNumero2 = new JTextField(10);
       btSomar = new JButton("Somar");
       tfResultado = new JTextField(10);
       
       painel.add(lbNumero1);
       painel.add(tfNumero1);
       painel.add(lbNumero2);
       painel.add(tfNumero2);
       painel.add(btSomar);
       painel.add(tfResultado);
       
       // configurar eventos
       btSomar.addActionListener(new SomarListener());
       
       janela.pack();
    }
    
    public FormSoma() {
        iniciarComponentes();
        
    }
    
    public void abrir() {
        janela.setVisible(true);
    }
    
    public void somar() {
        String numero1str = tfNumero1.getText();
        String numero2str = tfNumero2.getText();
        
        float numero1 = Float.valueOf(numero1str);
        float numero2 = Float.valueOf(numero2str);
        
        float resultado = numero1 + numero2;
        tfResultado.setText("" + resultado);
    }
    
    class SomarListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
           somar(); 
        }
        
    }
}





