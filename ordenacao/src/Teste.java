public class Teste {
    public static void main(String[] args) {
        int[] vetor = {7, 3, 5, 2, 8, 1};
        Otimizado.selectionSort(vetor);

        int[] vetor1 = {7, 3, 5, 2, 8, 1};
        Ordenacao.selectionSort(vetor1);

        int[] vetor2 = {7, 3, 5, 2, 8, 1};
        Bubble.bubbleSort(vetor2);

        int[] vetor3 = {10, 20, 30, 40, 50, 60, 70, 80};
        System.out.println(PesquisaBinaria.pesquisaBinaria(vetor3, 50));
    }
}
