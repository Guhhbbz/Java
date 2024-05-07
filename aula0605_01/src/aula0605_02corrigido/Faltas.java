
package aula0605_02corrigido;


public class Faltas {
    
    public Faltas(){}
    
    public boolean aprovado(int faltas){
        int numMax = 20*60/100;
        
        if(faltas > numMax){
            return false;
        }else{
            return true;
        }
    }
    
}
