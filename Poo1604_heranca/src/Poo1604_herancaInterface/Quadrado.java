
package Poo1604_herancaInterface;


public class Quadrado implements FormasGeometricas {
    
    private double lado;
    
    public Quadrado(double lado){
        this.lado = lado;
    }
    @Override
    public double calcularArea(){
    return lado * lado;
}
    
}
