package poo_02042024;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        
        if (a1.setN1(12)) {
            JOptionPane.showMessageDialog(null, "Atualizada com sucesso");
        }
        else{
            JOptionPane.showConfirmDialog(null, "Entrada inválida");
        }
        
        a1.getN1();
        a1.n2 = 4;
        a1.n3 = 6;
        a1.setMedia(a1.getN1(),a1.n2, a1.n3);
        
        System.out.println("N1 : "+ a1.getN1());
        System.out.println("N1 : "+ a1.n2);
        System.out.println("N1 : "+ a1.n3);
        System.out.println("Media: "+a1.getMedia());
        
        
    }
}
