/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifmg.sabara.bsi.poo2.parquimetro;

/**
 *
 * @author Aluno
 */
public class Parquímetro {
   
    private double saldo;
    private double montante;
    private String tempo;
    private String tempos[] = {"15min", "30min",
        "1h", "1h30", "2h"
    };
    private int tempoEscolhido = -1;
    private double valorIncremento;
    
    public Parquímetro(double valorIncremento) {
        this.valorIncremento = valorIncremento;
    }
    
    public void inserirDinheiro(double quantia) {
        if (quantia > 0) // garantindo a consistência do objeto
            saldo += quantia;
    }
    
    public void aumentarTempo() {
        tempo = tempos[++tempoEscolhido];
    }
    
    public void imprimirBilhete() {
        double valorBilhete = (tempoEscolhido+1) * valorIncremento;
        if (saldo >= valorBilhete) {
            System.out.println("** Parquímetro **");
            System.out.printf ("*  Tempo: %s *\n", tempo);
            System.out.printf ("*  Preço: %.2f *\n", valorBilhete);
            System.out.println("*****************");
            
            double troco = saldo - valorBilhete;
            System.out.printf("TROCO: %.2f\n", troco);
            montante += valorBilhete;
            
            saldo = 0;
            tempo = null;
            tempoEscolhido = -1;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    
    public double getMontante() {
        return montante;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public String getTempo() {
        return tempo;
    }
}
