import java.util.Arrays;

public class Otimizado {
    public static void selectionSort (int[]vetor) {
        Integer troca = 0;
        Integer aux = 0;
        Integer indice = 0;
        for(int i = 0; i < vetor.length - 1; i ++) {
            indice = i;
            for(int j = i + 1; j < vetor.length; j++ ) {
                if(vetor[j] < vetor[indice]) {
                    indice = j;
                }
            }

            troca++;
            aux = vetor[i];
            vetor[i] = vetor[indice];
            vetor[indice] = aux;
        }

        System.out.println("Número de trocas: " + troca);
        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
    }
}
