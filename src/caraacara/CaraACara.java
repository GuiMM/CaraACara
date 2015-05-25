/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package caraacara;

import java.util.ArrayList;

/**
 *
 * @author 21131133
 */
public class CaraACara {
    /**
     * @param args the command line arguments
     */
    ArrayList<Pessoa> tabuleiro;
    Pessoa escolhida;
    public CaraACara(){
        tabuleiro = new ArrayList<>();
        Pessoa a = new Pessoa("Igor","castanhos","preto","negro","homem");
        Pessoa b = new Pessoa("Renan","castanhos","preto","pardo","homem");
        Pessoa c = new Pessoa("Guilherme","castanhos","preto","pardo","homem");
        Pessoa d = new Pessoa("William","castanhos","preto","negro","homem");
        tabuleiro.add(a);
        tabuleiro.add(b);
        tabuleiro.add(c);
        tabuleiro.add(d);
    }
    
    public void geraEscolhido(){
        escolhida = tabuleiro.get((int)Math.random()*tabuleiro.size());
    }
    
    public void jogada(String atributo, String complemento){
        for(Pessoa x:tabuleiro){
            switch(atributo){
                case "olhos":
                    if(x.olhos==complemento){
                        tabuleiro.remove(x);
                    }
                    break;
                case "cabelo":
                    if(x.cabelo==complemento){
                        tabuleiro.remove(x);
                    }
                    break;
                case "pele":
                    if(x.pele==complemento){
                        tabuleiro.remove(x);
                    }
                    
                    break;
                case "sexo":
                    if(x.sexo==complemento){
                        tabuleiro.remove(x);
                    }
                    
                    break;    
            
            }
        
        
        }
    
    
    }
    
    
    
    
    
    
    public static void main(String[] args) {
    }
    
}
