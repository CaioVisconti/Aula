package ExercicioAulaEntregavel;

public class Ordenacao {

    public static void ordenar(Aluno[] vetor) {
        Aluno aux = new Aluno("0", "aux", 0.0);
        String alunoComparado = "";

        Integer indice;
        for(int i = 0; i < vetor.length - 1; i++) {
            String nomeAtual = vetor[i].getNome();
            System.out.println(nomeAtual);
            indice = i;
            for(int j = 1; j < vetor.length; j++) {
                alunoComparado = vetor[j].getNome();
                System.out.println(alunoComparado);
                if(nomeAtual.compareTo(alunoComparado) > 0) {
                    indice = j;
                }
            }

            System.out.println("\n\n\n");

            aux.setNome(nomeAtual);
            System.out.println(aux.getNome() + " aux");
            vetor[i].setNome(alunoComparado);
            vetor[indice].setNome(aux.getNome());
        }
    }
}