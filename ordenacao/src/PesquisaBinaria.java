public class PesquisaBinaria {
    public static Integer pesquisaBinaria (int[] vetor, int valor) {
        Integer inicio = 0;
        Integer fim = vetor.length - 1;
        while(inicio <= fim) {
            Integer meio = (inicio + fim) / 2;

            if(valor == vetor[meio]) {
                return meio;
            } else {
                if(valor > vetor[meio]) {
                    inicio = meio + 1;
                } else {
                    fim = meio - 1;
                }
            }
        }
        return -1;
    }
}
