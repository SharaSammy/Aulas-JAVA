
import java.util.Scanner;
public class SistemaBanco {
    public static void main(String[] args) {
        Scanner aaa = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println(" CAIXA ELETRÔNICO ");
        System.out.println("--------------------");
        System.out.println("Digite:");
        System.out.println("1-Para sacar");
        System.out.println("2-Para depositar");
        System.out.println("3-Para ver saldo");
        System.out.println("4-Para sair");
        System.out.println("--------------------");
        
        float saldo = 0;
        int opcao = aaa.nextInt();
        
        switch(opcao){
            case 1:
                System.out.println("Digite o valor que deseja sacar?");
                float saque = aaa.nextDouble();
                saldo = saldo - saque;
                break;
            case 2:
                System.out.println("Digite o valor que deseja depositar?");
                float deposito = aaa.nextDouble();
                saldo = saldo + deposito;
                break;
            case 3:
                System.out.println("Seu saldo atual é de R$" + saldo);
                break;
            case 4:
                System.out.println("Você deseja realmente sair?");
                System.out.println("Escreva 'Sim' ou 'Não' ");
                
                String ConfirmaSair = aaa.nextLine();
                boolean confirmar;              
                
                if( "Sim".equals(ConfirmaSair)){
                    confirmar = true;
                } else if("Não".equals(ConfirmaSair)){
                    confirmar = false;
                } else{
                    System.out.println("Pelo amor de Deus, digite 'Sim' ou 'Não' e tente novamente.");
                     
                }    break;
            default:
                System.out.println("Opss!! Essa opção não é válida!!")
                System.out.println("Por favor, digite uma opção válida e tente novamente.");
                break;
        }
         
    }
}
