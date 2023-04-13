import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidato: candidatos) {
            case4(candidato);
        }
    }

    static void case4(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }
        } while(continuarTentando && tentativasRealizadas<3);

        if (atendeu) {
            System.out.println("Conseguimos contato com o candidato " + candidato + " na " + tentativasRealizadas + " ligação");
        } else {
            System.out.println("Não conseguimos contato com o candidato " + candidato);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        for (int indice=1; indice <= candidatos.length; indice++){
            System.out.println("O candidato de n" + indice + " é " + candidatos[indice-1]);
        }

        for (String candidato: candidatos) {
            System.out.println("O candidato " + candidato + " foi selecionado");
        }
    }

    static void selecaoCandidatos() {
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
