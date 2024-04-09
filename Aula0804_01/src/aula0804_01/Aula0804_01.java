package aula0804_01;
import java.util.Scanner;

public class Aula0804_01 {

    
    public static void main(String[] args) {
        Scanner coisa = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero");
        double n1 = coisa.nextDouble();
        System.out.println("Digite o segundo numero");
        double n2 = coisa.nextDouble();
        System.out.println("Digite o terceiro numero");
        double n3 = coisa.nextDouble();
        
        double maior = n1;
        double menor = n1;
        
        if(maior<n2) maior=n2;
        if(maior<n3) maior=n3;
        if(menor>n2) menor=n2;
        if(menor>n3) menor=n3;
        
        System.out.println(maior);
        System.out.println(menor);
        }
        
    }
    

