import java.util.Arrays;

public class Ordenacao {
    public static void selectionSort (int[]vetor) {
        Integer trocaO = 0;
        for(int i = 0; i < vetor.length - 1; i ++) {
            Integer aux = 0;
            for(int j = i + 1; j < vetor.length; j++ ) {
                if(vetor[j] < vetor[i]) {
                    trocaO++;
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

        System.out.println("Número de trocas: " + trocaO);
        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
    }
}