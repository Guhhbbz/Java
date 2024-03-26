package aula2503_03;
import java.util.Scanner;

public class Aula2503_03 {

    
    public static void main(String[] args) {
        int retangulo;
        int circulo;
        int triangulo;
        int opcoes;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Selecione uma opcao:");
        System.out.println("(1) Calcular a area de um triangulo");
        System.out.println("(2) Calcular a area de um retangulo");
        System.out.println("(3) Calcular a area de um circulo");
        
        opcoes = ler.nextInt();
        
        if(opcoes == 1){
            int baset;
            int alturat;
            Scanner lert = new Scanner(System.in);
            System.out.println("Digite a base:");
            baset = lert.nextInt();
            System.out.println("Digite a altura:");
            alturat = lert.nextInt();
            int areat = baset * alturat / 2;
            System.out.println("Area do triangulo = "+areat);
        }else if(opcoes == 2){
            int comprimentor;
            int largurar;
            Scanner lerr = new Scanner(System.in);
            System.out.println("Digite o comprimento:");
            comprimentor = lerr.nextInt();
            System.out.println("Digite a largura:");
            largurar = lerr.nextInt();
            int arear = comprimentor * largurar;
            System.out.println("Area do retangulo = "+arear);
        }else if(opcoes == 3){
            int raio;
            Scanner lerc = new Scanner(System.in);
            System.out.println("Digite o raio:");
            raio = lerc.nextInt();
            double areac = Math.PI * Math.pow(raio, 2);
        }
        else{
            System.out.println("Opcao invalida");
        }
    }
    
}
