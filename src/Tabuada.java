import java.util.Scanner;
public class Tabuada {
   public static void main(String[] args) {
       int decisao;
       tabuada();
       do {
           Scanner scanner = new Scanner(System.in);
           System.out.println("1 - Continuar\n2 - Sair");
           decisao = scanner.nextInt();
            if (decisao == 1){
                tabuada();
       } else if (decisao ==2 ) {
                System.out.println("Programa encerrado!!");
            }else {
                System.out.println("Opção inválida!!");
            }
       }while(decisao != 2);
   }

    public static void tabuada(){
        Scanner scanner = new Scanner(System.in);

        int numeroMultiplicado, resultado;
        int multiplicador = 1;

        System.out.println("Digite o número que te apresento a tabuada: ");
        numeroMultiplicado = scanner.nextInt();

        while(multiplicador <= 10){
            resultado = numeroMultiplicado * multiplicador;
            System.out.println(numeroMultiplicado + "x" + multiplicador + "=" + resultado);
            multiplicador++;
        }
    }
}
