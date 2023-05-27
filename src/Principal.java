import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int requisicao = 0;
        while(requisicao != 3){
            System.out.println("(1) Criar uma Loja");
            System.out.println("(2) Criar um Produto");
            System.out.println("(3) Sair");
            
            requisicao = leitor.nextInt();

            if(requisicao == 1){
                System.out.println("Criando Loja");
            } else if(requisicao == 2){
                System.out.println("Criando Produto");
            } else if(requisicao == 3){
                break;
            } else{
                System.out.println("Opção inválida");
            } // Concluir antes de passar para etapa 3.
        }
        leitor.close();
    }
}
