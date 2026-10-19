import model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner doido = new Scanner(System.in);
        SistemaSeguranca s1 = new SistemaSeguranca();
        String usuario = "", senha, logout = "n";

        while (!s1.getAutenticado()){
            System.out.println("----- Olá! -----");
            System.out.print("Digite o usuário: ");
            usuario = doido.next();
            System.out.print("Digite a senha: ");
            senha = doido.next();
            if (s1.login(usuario, senha)){
                System.out.println("Bem-vindo " + usuario + "!");
            } else{
                System.out.println("Login incorreto, tente novamente");
            }
        }

        while (!logout.equalsIgnoreCase("s")){
            System.out.println("Deseja fazer logout? (s/n)");
            logout = doido.next();
            if (logout.equalsIgnoreCase("s")){
                s1.logout();
            } else if (logout.equalsIgnoreCase("n")) {
                System.out.println("Você continua logado!");
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
