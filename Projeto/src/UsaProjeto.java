import java.util.Scanner;

public class UsaProjeto {
    public static void main(String[] args) {
        
        Projeto usaProjeto = new Projeto("Projeto01");

        Scanner teclado = new Scanner(System.in);
        int cmd = 0;

        while (cmd != 9) {
            
            System.out.println();
            System.out.println();
            System.out.println("1 PARA ATUALIZAR NOME PROJ.");
            System.out.println("2 PARA ATUALIZAR CUSTO/HORA");
            System.out.println("3 PARA REGISTRAR HORAS TRAB");
            System.out.println("4 PARA CONSULTAR DADOS PROJ.");
            System.out.println("9 PARA ENCERRAR O PROGRAMA");
            System.out.println();
            System.out.println();

            cmd = teclado.nextInt();
                        
            switch (cmd) {

                case 1:
                teclado.nextLine();
                System.out.print("Informe um novo nome para o projeto: ");
                String nomeObj = teclado.nextLine();
                usaProjeto.setNome(nomeObj);
                    break;
                
                case 2:
                System.out.print("Informe um novo custo/hora: ");
                double custoHoraObj = teclado.nextDouble();
                usaProjeto.setCustoHora(custoHoraObj);
                    break;
                
                case 3:
                System.out.print("Informe a quantidade de horas trabalhadas: ");
                int qntHorasObj = teclado.nextInt();
                usaProjeto.registrarHoras(qntHorasObj);
                    break;
                
                case 4:
                System.out.println("Nome do projeto: " + usaProjeto.getNome());
                System.out.println("Custo da hora trabalhada: R$ " + usaProjeto.getCustoHora());
                System.out.println("Quantidade de horas trabalhadas: " + usaProjeto.getHoras());
                System.out.println("Custo atual à receber: R$ " + usaProjeto.getCustoAtual());
                    break;

            }
        }
        
        teclado.close();
    }
}