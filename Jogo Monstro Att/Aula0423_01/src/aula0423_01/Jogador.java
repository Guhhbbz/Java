
package aula0423_01;

import java.util.Scanner;


public class Jogador extends Personagem {

    private int contadorEspecial = 5;
    
    public Jogador(String nome){
        super(nome, 150);
    }
    
    /**
     * 
     */
    // Mostrar na tela os ataques -> Mostrando a contagem de Especial
    private void ataques(){
        System.out.println("Seus ataques:");
        System.out.println("(1)\t Soco");
        System.out.println("(2)\t Especial "+ (contadorEspecial + " ataques"));
    }
    
    public int pegarAtaque(Scanner tc){
        ataques();
        int escolha = tc.nextInt();
        
        if(escolha == 1){
            return 1;
        }
        else if(escolha == 2){
            return 2;
        }   
        else{
          return 0;
        }
    }
    
/**
 * Esta classe foi criada para conseguirmos o dano de cada ataque
 * @param num seletor de ataque escolhido
 * @return o dano do ataque
 */
    
    @Override
    public int atack(int num) {
        switch(num){
            case 1 -> {
                return 2;
            }
            case 2 -> {
                contadorEspecial --;
                return 5;
            }
            default -> {
                return 0;
            }
        }
    }
    
    public void recuperarEspecial(){
        contadorEspecial = 5;
    }
    public void recuperarVida(){
        int hp = getHp();
        
        if(hp >= 145){
            setHp(150);
        } else {
             hp += 5;
             setHp(hp);
        }
    }
    
    
}
    
    
    
    
    

