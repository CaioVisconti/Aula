package sptech.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Aluno pedro = new Aluno(1, "Pedro A.", 5.9);
        Aluno gabriel = new Aluno(2, "Gabriel F.", 6.0);

        List<Aluno> lista = new ArrayList<>();

        lista.add(pedro);
        lista.add(gabriel);

        Sala umCCOB = new Sala(1, "1CCOB", lista);

        System.out.println(umCCOB);
    }
}