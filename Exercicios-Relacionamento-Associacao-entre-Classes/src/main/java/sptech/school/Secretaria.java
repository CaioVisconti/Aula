package sptech.school;

import java.util.ArrayList;
import java.util.List;

public class Secretaria {
    private Integer totalInadimplentes;
    private Integer totalCancelamentos;
    private Integer totalPagamentos;

    public Secretaria(Integer totalInadimplentes, Integer totalCancelamentos, Integer totalPagamentos) {
        this.totalInadimplentes = totalInadimplentes;
        this.totalCancelamentos = totalCancelamentos;
        this.totalPagamentos = totalPagamentos;
    }

    public void registraPagamento(Aluno a) {
        a.inadimplente(false);
        this.totalPagamentos = this.totalPagamentos + 1;
        System.out.printf("o aluno %s de ra %d está em dia com o pagamento", a.getNome(), a.getRa());
    }

    public void registraAtrasoPag(Aluno a) {
        a.adimplente(true);
        this.totalInadimplentes = this.totalInadimplentes + 1;
        System.out.printf("o aluno %s de ra %d está inadimplente", a.getNome(), a.getRa());
    }

    public void registraCancelamento(Aluno a) {
        a.setAtivo(false);
        this.totalCancelamentos = this.totalCancelamentos + 1;
        System.out.printf("o aluno %s de ra %d cancelou a matrícula", a.getNome(), a.getRa());
    }
}
