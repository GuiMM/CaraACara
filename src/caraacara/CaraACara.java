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
    ArrayList<ArrayList<String>>tentativa ;
    ArrayList<String> olhos;
    ArrayList<String> cabelo;
    ArrayList<String> pele;
    ArrayList<String> sexo;
    Pessoa escolhida;
    public CaraACara(){
        tentativa = new ArrayList<ArrayList<String>>();
        olhos = new ArrayList<String>();
        olhos.add("preto");
        olhos.add("castanho");
        olhos.add("azul");
        olhos.add("verde");
        cabelo = new ArrayList<String>();
        cabelo.add("preto");
        cabelo.add("ruivo");
        cabelo.add("loiro");
        pele = new ArrayList<String>();
        pele.add("negro");
        pele.add("pardo");
        pele.add("branco");
        sexo = new ArrayList<String>();
        sexo.add("homen");
        sexo.add("mulher");
        
        
        tentativa.add(olhos);
        tentativa.add(cabelo);
        tentativa.add(pele);
        tentativa.add(sexo);
        
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
    
    public void jogada(ArrayList<Pessoa> tabuleiro, String atributo, String valor){
        for(Pessoa x:tabuleiro){
            switch(atributo){
                case "olhos":
                    if(x.olhos==valor){
                        tabuleiro.remove(x);
                    }
                    break;
                case "cabelo":
                    if(x.cabelo==valor){
                        tabuleiro.remove(x);
                    }
                    break;
                case "pele":
                    if(x.pele==valor){
                        tabuleiro.remove(x);
                    }
                    
                    break;
                case "sexo":
                    if(x.sexo==valor){
                        tabuleiro.remove(x);
                    }
                    
                    break;    
            
            }
        
        }
    
    }
    
//     minimax(nó, profundidade)
//    SE nó é um nó terminal OU profundidade = 0 ENTÃO
//        RETORNE o valor da heurística do nó
//    SENÃO SE o nó representa a jogada de algum adversário ENTÃO
//        α ← +∞
//        PARA CADA filho DE nó
//            α ← min(α, minimax(filho, profundidade-1))
//        FIM PARA
//        RETORNE α
//    SENÃO
//        α ← -∞
//        PARA CADA filho DE nó
//            α ← max(α, minimax(filho, profundidade-1))
//        FIM PARA
//        RETORNE α
//    FIM SE
//FIM ROTINA
    
    public int minimax(ArrayList<Pessoa> tabuleiro){
        if (jogada(tabuleiro, atributo, valor)) {
            
        }
    
    
    
    }
    
    
    
    
    public static void main(String[] args) {
    }
    
}
