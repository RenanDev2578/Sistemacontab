
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor; = new Scanner(System.in);
        Scanner leia; = new Scanner(System.in);
        System.out.println("Bem vindo ao nosso programa");
        System.out.println("Para prosseguir deverá inseri os seu dados");
        Usuario[] usuarios = new Usuario[10];
        Usuario usuario = new Usuario();
           do {
               System.out.println("Digite o seu nome");
               usuario.nome = leitor.nextLine();
               System.out.println("Digite o seu sobrenome");
               usuario.sobrenome = leitor.nextLine();
               System.out.println("Digite o seu email");
               usuario.email = leitor.nextLine();
               System.out.println("Digite o seu telefone");
               usuario.telefone = leitor.nextLine();
               System.out.println("Digite o sua senha");
               usuario.senhaI = leitor.nextLine();
               System.out.println("Repita novamente a sua senha ");
               usuario.senhaII = leitor.nextLine();
               usuarios[0] = usuario;
               if (usuario.senhaI.equals(usuario.senhaII)) {
                   System.out.println("Cadastro concluído");
               } else {
                   System.out.println("A senha são diferentes");
               }
           }while (usuario.senhaI.equals(usuario.senhaII));

        System.out.println("Insira suas despesas aqui!");
        System.out.println("Quantas despesas você tem");
        int quantidade = leia.nextInt();

        for (int i = 1; i < quantidade; i++) {
            Despesas[] despesas = new Despesas[quantidade];
            Despesas despessa = new Despesas();
            System.out.println("Digite o valor da  "+ i+ "° primeira despesa!");
            despesas.valor = leia.nextDouble(); ;
            System.out.println("Digite o nome da  "+ i+ "° primeira despesa!");
            despesas.nomedesp = leia.nextLine();
            System.out.println("Digite a quantidade de parcelas da  "+ i+ "° primeira despesa!");
            despesas.parcelas = leia.nextint();
        }




    }
}
