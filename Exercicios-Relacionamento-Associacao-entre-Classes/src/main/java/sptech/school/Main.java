package sptech.school;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno caio = new Aluno(1, "Caio", true, false, 8.0, 7.0);
        Aluno barbara = new Aluno(2, "Bárbara", false, true, 9.0, 10.0);
        Aluno gabriel = new Aluno(3, "Gabriel", false, false, 5.0, 6.0);

        Secretaria sptech = new Secretaria();

        sptech.registraPagamento(barbara);
        sptech.registraAtrasoPag(gabriel);
        sptech.registraCancelamento(caio);
        sptech.verificaAprovacaoAluno(caio);

        sptech.exibirRelatorio();
    }
}