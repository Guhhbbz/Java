
package aula0423_01;


public abstract class Personagem {
    
    private String nome;
    private int hp;
    
    public Personagem(int hp){
        this.hp = hp;
    }
    public Personagem(String nome, int hp){
        this.nome = nome;
        this.hp = hp;
    }
    
    public String getNome(){
        return this.nome;
    }
    public int getHp(){
        return this.hp;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    
    public void causarDano(int dano, Personagem destino){
        int vida = destino.getHp();
        if(vida > dano){
            // receber o dano
            vida = vida - dano; // vida = vida - dano;
            destino.getHp();
        }else{
            // zerar a vida
            destino.setHp(0);
        }
    }
    
     public abstract int atack(int num);
     
}
