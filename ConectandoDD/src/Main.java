import java.util.Scanner;
import java.sql.ResultSet;

public class Main {
    
    public static void main(String[] args) throws SQLException {
        
        Scanner tc = new Scanner(System.in);
        ControllerJDBC conexao = new ControllerJDBC();
        String nome;
        int id;
        boolean ligado = true;
        
        while(ligado){
            System.out.println("""
                               Acesso ao banco de dados
                               1 - Inserir;
                               2 - Buscar;
                               3 - Atualizar;
                               4 - Deletar;
                               5 - Sair
                               O que voce deseja fazer?
                               """);
            int opcao = tc.nextInt();
            
            switch (opcao){
                case l -> { // Inserir informação no banco de dados
                    System.out.println("Informe o nome da pessoa");
                    nome = tc.next();
                    conexao.inserirDado(nome);
                }
                case 2 -> { //Buscar informacoes no banco
                    ResultSet busca = conexao.buscarDado();
                    while(busca.next()){
                        System.out.print(busca.getInt(id)+" ");
                        System.out.println(busca.getString(nome));
                    }
                }
                case 3 -> {
                    System.out.println("Informe o nome:");
                    nome = tc.next();
                    System.out.println("Informe id");
                    id = tc.nextInt();
                    if(conexao.atualizarDado(id, nome)> 0){
                        System.out.println("Alteracao Realizada");
                    }else{ System.out.println("Erro");
                    }
                }
                case 4 ->{
                    System.out.println("Informe o id");
                    id = tc.nextInt();
                    if(conexao.deletarDado(id))
                }
                case 5 -> {
                    ligado = false;
                    System.out.println("ADEUS");
                }
                default ->{
                    System.out.println("Opcao invalida");
                }
                   
            }
        }
        
    }
}
