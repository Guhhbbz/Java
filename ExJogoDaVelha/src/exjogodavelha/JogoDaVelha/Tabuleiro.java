
package exjogodavelha.JogoDaVelha;


public class Tabuleiro {
    
    private int[][] tabuleiro;
    
    public Tabuleiro(){
        tabuleiro = new int[3][3];
    }
    
    public void start(){
        for (int i = 0; i < 3; i++) {
            for (int x = 0; x < 3; x++) {
                tabuleiro [i][x] = -1;
            } 
        }
    }
    
    public boolean testaPosicao(int linha, int coluna){
        return((linha >= 0 && linha <= 2)&& (coluna >= 0 && coluna <=2));
    }
    
    public boolean posicaoOcupada(int linha, int coluna){
        return(tabuleiro[linha][coluna] != -1);
    }
    
    public boolean verificarVitoria(int jogador){
        for(int nl = 0; nl < 3; nl++){
            int vitoria = 0;
            for(int nc = 0; nc < 3; nc++){
                if(tabuleiro[nl][nc] == jogador){
                    vitoria++;
                }
            }
            if(vitoria == 3){
                return true;
            }
        }
        
        return false;
        }
        
    public boolean jogar(int linha, int coluna, int jogador){
        if(testaPosicao(linha, coluna)&& !posicaoOcupada(linha, coluna)){
            tabuleiro[linha][coluna]= jogador;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean fimDoJogo(){
        for(int linha = 0; linha <3; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
             if(tabuleiro[linha][coluna]== -1){
                 return false;
             }   
            }
        }
        return true;
    }
    }
    


