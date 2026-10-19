import model.*;

public class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        Vendedor v1 = new Vendedor();
        Faxineiro f1 = new Faxineiro();

        System.out.println(g1.baterPonto());
        System.out.println(v1.baterPonto());
        System.out.println(f1.baterPonto());

        System.out.println(g1.fecharCaixa());
        System.out.println(v1.realizarVenda());
        System.out.println(f1.solicitarMaterial());

    }
}
