import java.util.Arrays;

public class Bubble {
    public static void bubbleSort (int[] v) {
        Integer trocaB = 0;
        for(int i = 0; i < v.length - 1; i++) {
            for (int j = 1; j < v.length - i; j++) {
                if(v[j-1] > v[j]) {
                    int aux = v[j];
                    trocaB += 1;
                    v[j] = v[j - 1];
                    v[j-1] = aux;
                }
            }
        }

        System.out.println("Número de trocas: " + trocaB);
        System.out.println("Vetor: " + Arrays.toString(v));
    }
}
