package sptech.school;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno caio = new Aluno(1, "Caio", true, false, 8.0, 7.0);
        Aluno barbara = new Aluno(2, "Bárbara", false, true, 9.0, 10.0);
        Aluno gabriel = new Aluno(3, "Gabriel", false, false, 5.0, 6.0);

        Secretaria secretaria = new Secretaria();

        secretaria.registraPagamento(caio);
        secretaria.registraAtrasoPag(barbara);
        secretaria.registraCancelamento(gabriel);

        secretaria.verificaAprovacaoAluno(caio);
        secretaria.verificaAprovacaoAluno(barbara);
        secretaria.verificaAprovacaoAluno(gabriel);

        secretaria.exibirRelatorio();
    }
}