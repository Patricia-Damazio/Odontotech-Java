import java.util.Scanner;

/**
 * Odontotech - Sistema gamificado para auxiliar a higiene bucal infantil.
 * Desenvolvido para execução no console (Java 17).
 */
public class Main {

    public static void main(String[] args) {

        // --- Boas-vindas: cabeçalho amigável do Odontotech ---
        System.out.println("========================================");
        System.out.println("           ODONTO TECH");
        System.out.println("   Higiene Bucal Gamificada Infantil");
        System.out.println("========================================");
        System.out.println();

        // --- Captura de dados: nome da criança ---
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o seu nome? ");
        String nomeCrianca = scanner.nextLine().trim();

        // Garante um nome padrão caso a criança não digite nada
        if (nomeCrianca.isEmpty()) {
            nomeCrianca = "Amigo(a)";
        }

        System.out.println();
        System.out.println("Olá, " + nomeCrianca + "! Vamos escovar os dentes juntos?");
        System.out.println();

        // --- Gatilho de início: escova + pasta e digitar 1 ---
        System.out.println("Pegue sua escova com pasta de dente.");
        System.out.println("Quando estiver pronto(a), digite 1 para iniciar o cronômetro.");
        System.out.print("Digite aqui: ");

        String entrada = scanner.nextLine().trim();

        // Se não digitar 1, exibe despedida gentil e encerra o programa
        if (!entrada.equals("1")) {
            System.out.println();
            System.out.println("Tudo bem, " + nomeCrianca + "!");
            System.out.println("Quando quiser cuidar dos seus dentes, volte aqui.");
            System.out.println("Até a próxima!");
            scanner.close();
            return;
        }

        // --- Cronômetro e repetição: laço com 4 etapas ---
        System.out.println();
        System.out.println("Cronômetro iniciado! Vamos lá, " + nomeCrianca + "!");
        System.out.println("----------------------------------------");

        // Laço for percorre as 4 etapas da escovação
        for (int etapa = 1; etapa <= 4; etapa++) {

            // Estrutura de decisão if/else para cada etapa
            if (etapa == 1) {
                System.out.println("Etapa 1: Escove os dentes da frente!");
            } else if (etapa == 2) {
                System.out.println("Etapa 2: Escove os dentes do fundo (em cima)!");
            } else if (etapa == 3) {
                System.out.println("Etapa 3: Escove os dentes do fundo (embaixo)!");
            } else {
                System.out.println("Etapa 4: Escove a língua com cuidado!");
            }

            // Simulação de tempo: pausa entre etapas (não pausa após a última)
            if (etapa < 4) {
                try {
                    // Pausa de 3 segundos para simular o cronômetro
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    // Tratamento correto da exceção para o programa não quebrar
                    Thread.currentThread().interrupt();
                    System.out.println("O cronômetro foi interrompido.");
                }
            }
        }

        System.out.println("----------------------------------------");
        System.out.println();

        // --- Recompensa final: celebração e troféu virtual ---
        System.out.println("Parabéns, " + nomeCrianca + "! O tempo acabou!");
        System.out.println();
        System.out.println("Você cuidou muito bem dos seus dentes!");
        System.out.println();
        System.out.println("*** Troféu conquistado: DENTE BRILHANTE ***");
        System.out.println();
        System.out.println("Continue assim todos os dias. Até a próxima!");

        scanner.close();
    }
}
