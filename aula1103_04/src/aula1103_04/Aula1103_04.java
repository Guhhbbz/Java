package aula1103_04;
import java.util.Scanner;

public class Aula1103_04 {

    
    public static void main(String[] args) {
        System.out.println("Digite a altura do triangulo: ");
        int a = 0;
        int b = 0;
        Scanner ler = new Scanner(System.in);
        
        a = ler.nextInt();        
        System.out.println("Digite a base: ");               
        b = ler.nextInt();        
        System.out.println("Area = "+(a*b));
    }
    
}
