package ExercicioAulaEntregavel;

import java.util.Arrays;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno caio = new Aluno("1", "Caio", 9.9);
        Aluno gabriel = new Aluno("2", "Gabriel", 9.2);
        Aluno duda = new Aluno("3", "Duda", 10.0);
        Aluno roberto = new Aluno("4", "Roberto", 7.8);
        Aluno guilherme = new Aluno("5", "Guilherme", 6.6);
        Aluno zaqueu = new Aluno("6", "Zaqueu", 0.1);
        Aluno julia = new Aluno("7", "Julia", 6.5);
        Aluno vitor = new Aluno("8", "Vitor", 3.3);
        Aluno ricardo = new Aluno("9", "Ricardo", 5.6);
        Aluno gustavo = new Aluno("10", "Gustavo", 8.9);

        Aluno[] vetor = {caio, gabriel, duda, roberto, guilherme, zaqueu, julia, vitor, ricardo, gustavo};

        Ordenacao.ordenar(vetor);

        System.out.println(vetor[0].getNome() + " " + vetor[1].getNome() + " " + vetor[2].getNome() + " " + vetor[3].getNome() + " " + vetor[4].getNome() + " " + vetor[5].getNome() + " " + vetor[6].getNome() + " " + vetor[7].getNome() + " " + vetor[8].getNome() + " " + vetor[9].getNome());
    }


}
