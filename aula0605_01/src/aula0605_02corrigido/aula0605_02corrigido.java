package aula0605_02corrigido;
import java.util.Scanner;
import aula0605_02corrigido.Faltas;
import aula0605_02corrigido.Notas;

public class aula0605_02corrigido {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    Notas notas = new Notas();
    Faltas faltas = new Faltas();
    double avaliacao = 0;
    
    char op = 'e';

        for(int i = 1; i <= 3; i++){
            System.out.println("Digite a nota da sua A"+i);
            avaliacao = sc.nextDouble();
            while(!notas.validaNota(avaliacao)){
                System.out.println("Nota invalida. Digite novamente:");
                avaliacao = sc.nextDouble();
            }
            notas.setNota(avaliacao, i);
                }
    
        System.out.println("Digite a quantidade de faltas: ");
        int numeroFaltas = sc.nextByte();
        
        if(faltas.aprovado(numeroFaltas)){
            if(notas.aprovado()==0){
                System.out.println("Aprovado");
            }else if(notas.aprovado()==1){
                System.out.println("Sub");
            }else{
                System.out.println("Reprovado");
            }
        }else{
                    System.out.println("Reprovado");
                    System.out.println("Deseja parar? Digite 'E' para sim ");
        op = sc.nextLine().toUpperCase().charAt(0);
                    }while(op != 'E');
        
        
        
    }
}
