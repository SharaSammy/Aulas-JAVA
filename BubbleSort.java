import java.util.Random;
public class BubbleSort {
    public static void main(String[] args) {
        Random aaa = new Random();
        int Vetor[] = new int [20];
        
        //Colocando valores aleatórios no vetor.
        for (int i = 0; i < Vetor.length; i++) {
            Vetor[i] = aaa.nextInt(99);
        }
        
        //Mostrando o vetor antes de ordenar.
        System.out.println("Vetor não ordenado");
        for (int i = 0; i < Vetor.length; i++) {
            System.out.print(Vetor[i] + "\t");
        }
        int aux;
        //Bubble sort.
        for (int i = 0; i < Vetor.length; i++) {
            for (int j = 0; j < Vetor.length; j++) {
                if (Vetor[i] < Vetor[j]){
                    aux = Vetor[i];
                    Vetor[i] = Vetor[j];
                    Vetor[j] = aux;
                }         
            }
        }
        System.out.println("");
        System.out.println("Vetor ordenado");
        
        for (int i = 0; i < Vetor.length; i++) {
            System.out.print(Vetor[i] + "\t");
        }
    }
}
