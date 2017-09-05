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
public class Motorista {
    
    public static void main(String[] args) {
        
        Parquímetro parqMorada = new Parquímetro(0.5);
        
        parqMorada.inserirDinheiro(5.0);
        
        parqMorada.aumentarTempo();
        parqMorada.aumentarTempo();
        parqMorada.aumentarTempo();
        
        System.out.printf("Saldo:%.2f, Tempo: %s\n\n",
                parqMorada.getSaldo(),
                parqMorada.getMontante());
        
        parqMorada.imprimirBilhete();
    }
    
}
