package poo_02042024;


public class Aluno {
    //ATRIBUTOS
    
    private String nome;
    private Long RA;
    private double n1;
    public double n2;
    public double n3;
    private double media;
    
    public double getMedia( ){
        return this.media;
    }
    
    public void setMedia(double n1,double n2,double n3){
        this.media = (n1 + n2 + n3) /3;
    }
    
    public double getN1(){
        return this.n1;
    }
    public Boolean setN1(double nota1){
        if(n1 > 10){
            return false;
        }
        return true;
    }
}
