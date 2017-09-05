package br.edu.ifmg.bsi.sabara.poo2.exemplolistener;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Classe de objetos que representam uma janela
 * que pede o nome do usuário e o recepciona com
 * uma mensagem de boas-vindas.
 * @author Aluno
 */
public class JanelaBemvindo {
    
    private JFrame janela;
    private JTextField tfNome;
    private JButton btOk;
    private JLabel lbMensagem;

    public JanelaBemvindo() {
        montarJanela();
    }
    
    private void montarJanela() {
        janela = new JFrame();
        janela.setTitle("Bem-vindo!");
        
        tfNome = new JTextField();
        btOk = new JButton("OK");
        btOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = tfNome.getText();
                String msg = "Bem-vindo, " + nome;
                lbMensagem.setText(msg);
            }
        });
        lbMensagem = new JLabel("Mensagem");
        
        Container conteudo = janela.getContentPane();
        conteudo.add(tfNome, BorderLayout.NORTH);
        conteudo.add(btOk, BorderLayout.CENTER);
        conteudo.add(lbMensagem, BorderLayout.SOUTH);
        
        janela.pack();
    }
    
    public void abrir() {
        janela.setVisible(true);
    }
        
}
