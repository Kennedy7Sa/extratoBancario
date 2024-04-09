import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in); // pra conseguir ler entradas pelo teclado

            int escolha = 0;
            double saldoConta = 2500.00;
            //informaçoes do cliente
            System.out.println();
            String cadastroCliente;
            cadastroCliente = """
                    ********************************
                            DADOS DA CONTA 
                    
                    Nome:  Kennedy da Silva Arruda 
                    saldo Atual : %.2f
                    Tipo de conta : Corrente 
                    *********************************
                    """.formatted(saldoConta);

            System.out.println(cadastroCliente);

            //menu de transações
            while (escolha != 4) { // loop para ficar aparecendo até que o clinte feche o programa
                System.out.println("\n-----OPERAÇÕES-----");
                System.out.println("1. CONSULTAR SALDO");
                System.out.println("2. DEPOSITAR");
                System.out.println("3. TRANSFERIR");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");
                escolha = leitura.nextInt();

                //consultar saldo
                if (escolha == 1) {
                    System.out.print("Saldo atual em conta: " + saldoConta);


                //fazer deposito
                } else if (escolha == 2) {
                    System.out.print("Digite o valor a ser depositado: ");
                    double deposito = leitura.nextDouble();
                    saldoConta += deposito;  //aqui estamos somando o valor existente mais o valor depositado
                    System.out.println("Saldo da conta atualizado é R$" + saldoConta);

                //fazer transferencia
                } else if (escolha == 3) {
                    System.out.println("Digite o valor a ser transferido");
                    double valorTransferido = leitura.nextDouble();
                    if (valorTransferido <= saldoConta) {
                        saldoConta -= valorTransferido;
                        System.out.println("Valor transferido saldo em conta é R$"+ saldoConta); // uso do \n pra pular linha
                        //o .formatted é pra usar uma mascara pra colocar direto na string

                    }else{
                        System.out.println("Saldo insuficiente");
                    }



                //sair do programa
                }else if (escolha == 4) {
                    System.out.println("Programa encerrado.");
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }
    }


