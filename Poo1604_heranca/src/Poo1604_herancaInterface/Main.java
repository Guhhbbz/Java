package Poo1604_herancaInterface;


public class Main {
    public static void main(String[] args) {
        
        somarAreas s = new somarAreas();
        
        Quadrado q1 = new Quadrado(2);
        Circulo c1 = new Circulo(2);
        
        double aQuadrado = q1.calcularArea();
        double aCirculo = c1.calcularArea();
        double soma = s.somarAreas(c1, q1);
        
        System.out.println(aQuadrado);
        System.out.println(aCirculo);
        System.out.println(soma);
    }
}
