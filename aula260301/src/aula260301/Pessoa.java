package aula260301;


public class Pessoa {
    /*NÃO TEM MAIN AQUI*/
    
    /*ATRIBUTOS*/
    private String nome;
    protected int idade;
    
    /*CONSTRUTOR*/
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        if(idade == 0){
            System.out.println("Idade invalida!");
        }
    }
    /*METODOS*/    
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    
    }
    
    
    
    

