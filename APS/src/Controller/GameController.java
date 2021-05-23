/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author CtSec
 */
public class GameController {
    
    public static int pontuacao = 0;
    private static int valorGanhaPonto, valorPerdePonto;
    String teste;
    
    public void verificar(boolean status){
        if(status == true){
            CalcPontos(valorGanhaPonto);
        } else {
            CalcPontos(valorPerdePonto);
        }
    }
    
    private void CalcPontos(int pontos){
        pontuacao = pontuacao + pontos;
    }
    
    public String SelectLevel(int level){
        String nivel = "";
        switch(level){
            case 1:
                nivel = "Facíl";
                valorGanhaPonto = 100;
                valorPerdePonto = -50;
                break;
            case 2:
                nivel = "Médio";
                valorGanhaPonto = 200;
                valorPerdePonto = -100;
                break;
            case 3:
                nivel = "Dificil";
                valorGanhaPonto = 300;
                valorPerdePonto = -150;
                break;
        }

        return nivel;
    }
    
    public void ZerarPontos(){
        pontuacao = 0;
        valorGanhaPonto = 0;
        valorPerdePonto = 0;
    }

}