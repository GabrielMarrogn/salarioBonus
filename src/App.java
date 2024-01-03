import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();
        sc.close();

        double comissao = vendas * 15/100 + salario;
        

        System.out.printf("TOTAL = R$ %.2f\n", comissao);
    }
}
