package aula2404_03;
import java.util.Scanner;

public class Aula2404_03 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] npares = new int[10];
        // parte de achar 10 numero pares digitados e salvar no vetor
        for (int i = 0; i < 10;) {
            System.out.println("Digite um numero:");
            npares[i] = ler.nextInt();
            npares[i] = npares[i]%2;
            
            if (npares[i]== 0) {
                
                i++;
            }
            else{
                System.out.println("Digite o proximo");
            }
            // agora encontrar o maior valor salvo
            
        }
        
    }
    
}
