import java.util.Scanner;
import java.util.Random;
public class BuscaSequencial {
    public static void main(String[] args) {
        
        //Criando objeto para a classe Random.
        Random aaa = new Random();
        //Criando objeto para a classe Scanner.
        Scanner fome = new Scanner(System.in);
        
        //Criação do vetor.
        int vetor[] = new int[15];
        System.out.println("Valor a ser encontrado:");
        int num = fome.nextInt();
        
        //Colocando valores nas posições do vetor.
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aaa.nextInt(15);
        }
        
        boolean encontrado = false;
        
        System.out.println(aaa);
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[1] == num){
                System.out.println("O valor foi encontrado na posição " + i);
                encontrado = true;
                break;
            }
        }
        if (encontrado == false){
            System.out.println("O valor não existe no vetor >_<");
        }
    }
}
