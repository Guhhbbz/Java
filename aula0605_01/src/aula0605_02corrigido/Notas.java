
package aula0605_02corrigido;


public class Notas {
    
    private double[] notas = new double[3]; //[0,0,0}
    private double[] pesos = {3,3,4};
    
    public Notas(){}
    
    public Notas(double A1, double A2, double A3){
        this.notas[0] = A1;
        this.notas[1] = A2;
        this.notas[2]= A3;
    }
    
    public boolean validaNota(double nota){
        if((nota >= 0)&&(nota <= 10)){
            return true;
        }else{
            return false;
        }
    }
    
    public double notaFinal(){
        double aux = 0;
        for(int i = 0; i < 3; i++){
            aux = aux + this.pesos[i]*this.notas[i];
        }
            return aux;
    }
    
    public int aprovado(){
        double nota = notaFinal();
        
        if(notaFinal() >= 70){
            return 0;
        }else if((nota >= 50)&&(nota <70)){
            return 1;
        }else{
            return 2;
        }
    }
    
    public void setA1(double nota){
        this.notas[0] = nota;
    }
    public void setA2(double nota){
        this.notas[1] = nota;
    }
    public void setA3(double nota){
        this.notas[2] = nota;
    }
    
    public void setNota(double nota, int avaliacao){
        this.notas[avaliacao-1]= nota;
    }
    public void printNotas(){
        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[2]);
    }
}
