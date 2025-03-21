package sptech.school;

import java.util.ArrayList;
import java.util.List;

public class Secretaria {
    private Integer totalInadimplentes = 0;
    private Integer totalCancelamentos = 0;
    private Integer totalPagamentos = 0;

    public void registraPagamento(Aluno a) {
        a.inadimplente(false);
        this.totalPagamentos++;
        System.out.printf("\no aluno %s de ra %d está em dia com o pagamento\n", a.getNome(), a.getRa());
    }

    public void registraAtrasoPag(Aluno a) {
        a.adimplente(true);
        this.totalInadimplentes++;
        System.out.printf("\no aluno %s de ra %d está inadimplente \n", a.getNome(), a.getRa());
    }

    public void registraCancelamento(Aluno a) {
        a.setAtivo(false);
        this.totalCancelamentos++;
        System.out.printf("\no aluno %s de ra %d cancelou a matrícula \n", a.getNome(), a.getRa());
    }

    public void verificaAprovacaoAluno(Aluno a) {
        String status = "Aprovado";
        String ativo = "DESATIVO";
        String inadimplente = "NÃO";
        if(a.calcularMedia() > 6) {
            status = "Reprovado";
        }

        if(a.getAtivo()) {
            ativo = "ATIVO";
        }

        if(a.getInadimplente()) {
            inadimplente = "SIM";
        }

        System.out.printf("\nSITUAÇÃO DO ALUNO -> %s \nRA: %d \nNome: %s \nNota 1: %f \nNota 2: %f \nMédia: %f \nStatus: %s \nInadimplente: %s\n", ativo, a.getRa(), a.getNome(), a.getNota1(), a.getNota2(), a.calcularMedia(), status, inadimplente);
    }

    public void exibirRelatorio() {
        System.out.printf("\n--------------- Relatório --------------- \nPagamentos realizados: %d \nInadimplentes: %d \nEvasões: %d\n", this.totalPagamentos, this.totalInadimplentes, this.totalCancelamentos);
    }
}
