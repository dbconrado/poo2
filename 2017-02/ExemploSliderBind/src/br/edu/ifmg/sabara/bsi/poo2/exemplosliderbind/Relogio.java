/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifmg.sabara.bsi.poo2.exemplosliderbind;

/**
 *
 * 
 * @author Aluno
 */
public class Relogio {
    
    private int horas;
    private int minutos;
    private Observador observador;
    
    public String getHoras() {
        return String.format("%02d:%02d", horas, minutos);
    }
    
    public void tick() {
        System.out.println("Deu Tick");
        minutos = (minutos + 1) % 60;
        if (minutos == 0) {
            horas = (horas + 1) % 24;
        }
        
        observador.objetoMudou(getHoras());
    }
    
    public void setObservador(Observador o) {
        observador = o;
    }
}
