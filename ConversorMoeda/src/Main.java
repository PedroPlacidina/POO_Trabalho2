import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        Conversor c = new Conversor();
        int cont = 1;

        System.out.println("===== Conversor de Moedas =====");
        
        while (cont == 1) {
            
            System.out.println("Escolha a moeda de origem (Real, Dolar, Euro, Libra, Iene, Peso): ");
            String ValorOrigem = leitor.next().toUpperCase();
            
            if (!Moedas.existeMoeda(ValorOrigem)) {
                System.out.println("Moeda não cadastrada");
                continue;
            }

            Moedas moedaOrigem = Moedas.valueOf(ValorOrigem);

            System.out.print("Digite o valor a ser convertido: ");
            double valor = leitor.nextDouble();

            if (valor < 0) {
                System.out.println("ERRO: Valor digitado menor que zero");
                continue;
            }

            System.out.println("Escolha a moeda de destino (Real, Dolar, Euro, Libra, Iene, Peso): ");
            String valorDestino = leitor.next().toUpperCase();

            if (!Moedas.existeMoeda(valorDestino)) {
                System.out.println("Moeda não cadastrada");
                continue;
            }

            Moedas moedaDestino = Moedas.valueOf(valorDestino);
            
            double converterMoeda = c.converterMoeda(valor, moedaOrigem, moedaDestino);
            System.out.printf("Valor convertido: %.2f %n", converterMoeda);

            System.out.println("Digite 1 para continuar ou 0 para sair: ");
            cont = leitor.nextInt();
        
        }  

        leitor.close();
    }
}
