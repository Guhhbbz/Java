package aula2404_01;
import java.util.Scanner;

public class Aula2404_01 {

    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[3];
        
        
        for(int i = 0; i < 3; i++){
            System.out.println("Digite A"+(i +1));
            notas[i] = ler.nextDouble();
        }
        
        //double nf = 3*notas[0]+3*notas[1]+4*notas[2];
        
        double[] pesos = {3, 3, 4};
        double nf = 0;
        for(int i = 0;i < pesos.length; i++){
            nf = nf + pesos[i]*notas[i];
        }
        
        
        System.out.println("Sua nota final é: "+nf);
        
    }
    
}
