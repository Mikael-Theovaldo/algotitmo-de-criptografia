package algoritmoSimples;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean cont = true;

        do {
            // Menu principal
            System.out.println
                    (" ________________________________________\n" +
                    "|          Sistema de Criptografia       |\n" +
                    "|________________________________________|\n" +
                    "|                                        |\n" +
                    "|  Escolha o tipo da mensagem            |\n" +
                    "|                                        |\n" +
                    "|  1 - criptografada                     |\n" +
                    "|  2 - invertida                         |\n" +
                    "|  0 - Sair                              |\n" +
                    "|________________________________________|");

            int opcao = sc.nextInt();
            sc.nextLine();
            System.out.println();

            // Validar opção do menu principal
            if (opcao == 0) {
                System.out.println("Algoritmo finalizado!");
                cont = false;
                continue;
            }

            if (opcao != 1 && opcao != 2) {
                System.out.println("Erro! Por favor, digite uma opção válida (1, 2 ou 0)\n");
                continue;
            }

            // Pedir mensagem para criptografar/inverter
            System.out.println("Digite a mensagem: (para finalizar digite 'fim') ");
            StringBuilder texto = new StringBuilder();

            // código para ler múltiplas linhas
            while (true) {
                String linha = sc.nextLine();
                if (linha.equalsIgnoreCase("fim")) {
                    break;
                }
                texto.append(linha).append("\n");
            }

            System.out.println();
            String resultado = null;

            // Processar opção escolhida
            switch (opcao) {
                case 1:
                    resultado = Criptografia.substituicaoSimples(texto.toString());
                    System.out.println("Mensagem criptografada: \n" + resultado);
                    break;

                case 2:
                    resultado = Criptografia.palavrasInversas(texto.toString());
                    System.out.println("Mensagem invertida: \n" + resultado);
                    break;
            }

            System.out.println();

            // Menu secundário
            boolean menuSecundario = true;
            do {
                System.out.println
                        (" ________________________________________\n" +
                        "|          Sistema de Criptografia       |\n" +
                        "|________________________________________|\n" +
                        "|                                        |\n" +
                        "|  O que fazer agora?                    |\n" +
                        "|                                        |\n" +
                        "|  1 - descriptografar/reverter          |\n" +
                        "|  2 - Nova mensagem                     |\n" +
                        "|  0 - Sair                              |\n" +
                        "|________________________________________|");

                int opcao2 = sc.nextInt();
                System.out.println();

                switch (opcao2) {
                    case 1:
                        if (opcao == 1) {
                            String descriptografada = Criptografia.reversaoSubsSimples(resultado);
                            System.out.println("Mensagem descriptografada: \n" + descriptografada);
                        } else if (opcao == 2) {
                            String revertida = Criptografia.reverterPalavrasInversas(Criptografia.palavrasInversas(resultado.toString()));
                            System.out.println("Mensagem revertida: \n" + revertida);
                        }
                        System.out.println();
                        break;

                    case 2:
                        menuSecundario = false;
                        break;

                    case 0:
                        System.out.println("Algoritmo finalizado!");
                        menuSecundario = false;
                        cont = false;
                        break;

                    default:
                        System.out.println("Erro! Por favor, digite uma opção válida (1, 2 ou 0)\n");
                }
            } while (menuSecundario);

        } while (cont);
    }
}
