package services;
import entities.gravarCSV;

public class criarCliente {
    public static void main() {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();

        System.out.print("Telefone do cliente: ");
        String telefone = sc.nextLine();

        System.out.print("Idade do cliente: ");
        int idade = sc.nextInt();

        sc.close();

        boolean nomeEhEduardo = nome.equalsIgnoreCase("Eduardo");
        boolean menorDeIdade = idade < 18;

        if (nomeEhEduardo || menorDeIdade) {
            System.out.println("Erro: não é possivel registrar o cliente!!");
        } else {
            String retorno = gravarCSV.gravarCliente(nome, telefone, idade);
            System.out.println(retorno);
        }
    }
}