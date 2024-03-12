package aula1103_04;
import java.util.Scanner;

public class Aula1103_04 {

    
    public static void main(String[] args) {
        System.out.println("Digite a altura do triangulo: ");
        int a = 0;
        Scanner altura = new Scanner(System.in);
        a = altura.nextInt();
        
        System.out.println("Digite o comprimento: ");
        int c = 0;
        Scanner comp = new Scanner(System.in);
        c = comp.nextInt();
        
        System.out.println("Area = "+(a*c));
    }
    
}
