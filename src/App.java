import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
        imprimirSelecionados();
    }

    static void imprimirSelecionados() {
        List<String> meu = selecaoCandidatos();

        for (String candidato: meu) {
            System.out.println("O candidato " + candidato + " foi selecionado");
        }
    }

    static ArrayList<String> selecaoCandidatos() {
        ArrayList<String> candidatosSelecionadosOficial = new ArrayList<>();
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "MONICA", "FABRICIO", "DANIEL", "HENRIQUE", "MOISES", "JOSE", "AUGUSTO", "MARIA", "ROBERTO"};
        
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou um salário de " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionadosOficial.add(candidato);
                candidatosSelecionados++;
            } 
            candidatoAtual++;
            
        }
        return candidatosSelecionadosOficial;

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if(salarioBase==salarioPretendido) {
            System.out.println("LIGAR PARA CANDIODATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
        }
    }
}
