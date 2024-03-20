package exercicio02;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Calculadora nmr = new Calculadora();
        int n1;
        int n2;
        
        
        
        System.out.println("Digite o primeiro numero:");
        n1 = ler.nextInt();
        nmr.numero1 = n1;
        
        System.out.println("Digite o segundo numero: ");
        n2 = ler.nextInt();
        nmr.numero2 = n2;
        
        System.out.println("SOMA: "+nmr.somar());
        System.out.println("DIVISAO: "+ nmr.dividir());
        
        
    }
    
}
