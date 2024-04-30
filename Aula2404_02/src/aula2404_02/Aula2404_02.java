
package aula2404_02;


public class Aula2404_02 {

   
    public static void main(String[] args) {
               
        int[] multiplo = new int[10];
        
        for (int i = 1; i <= 10; i++) {
            multiplo[i-1] = i*7;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(multiplo[i]);
        }
       
    }
    
}
